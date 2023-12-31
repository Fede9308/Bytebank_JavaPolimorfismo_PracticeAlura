package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.modelo.*;


import java.util.ArrayList;

public class TestArrayListEquals {

	public static void main(String[] args){

	    ArrayList<Cuenta> lista = new ArrayList<Cuenta>();

	    Cuenta cc1 = new CuentaCorriente(22, 22);
	    Cuenta cc2 = new CuentaCorriente(22, 22);

	    lista.add(cc1);

	    for(Cuenta cuenta : lista){
	        System.out.println(cuenta);
	    }
	    
	    boolean existe = lista.contains(cc2); //nuevo

	    System.out.println("Ya existe? " + existe);

	    for(Cuenta cuenta : lista){
	        System.out.println(cuenta);
	    }
	    
	    boolean igual = cc1.equals(cc2);
	    System.out.println(igual);
	    
	}
		
}
