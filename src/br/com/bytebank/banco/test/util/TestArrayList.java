package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.modelo.*;


import java.util.*;

public class TestArrayList {

	 public static void main(String[] args) {

	       //ArrayList<Cuenta> lista = new ArrayList<Cuenta>();
	        
	       //List<Cuenta> lista = new ArrayList<Cuenta>(); //usa array por debajo
	        //List<Cuenta> lista = new LinkedList<Cuenta>(); //lista linkada
	        List<Cuenta> lista = new Vector<Cuenta>(); //usa array por debajo, pero también es threadsafe
	        /*Collection<Cuenta> lista = new Vector<Cuenta>(); No compila el metodo get() ya que la interfaz collection 
	        tiene implementaciones ademas de List que no tienen indice.*/
	        
	        Cuenta cc = new CuentaCorriente(22, 11);
	        lista.add(cc);

	        Cuenta cc2 = new CuentaCorriente(22, 22);
	        lista.add(cc2);

	        System.out.println("Tamanho: " + lista.size());

	        Cuenta ref = lista.get(0);
	        System.out.println(ref.getNumero());

	        lista.remove(0);
	        System.out.println("Tamanho: " + lista.size());

	        Cuenta cc3 = new CuentaCorriente(33, 311);
	        lista.add(cc3);

	        Cuenta cc4 = new CuentaCorriente(33, 322);
	        lista.add(cc4);

	        for(int i = 0; i < lista.size(); i++) {
	            Object oRef = lista.get(i);
	            System.out.println(oRef);
	        }

	        System.out.println("----------");

	        for(Cuenta oRef : lista) {
	            System.out.println(oRef);
	        }
	       // Collections.sort();
	    }
	
}
