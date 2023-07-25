package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.*;

public class TestGuardadorDeCuentas {

	 public static void main(String[] args) {
	        GuardadorDeCuentas guardador = new GuardadorDeCuentas();
	        
	        GuardadorDeReferencias guardadorRef = new GuardadorDeReferencias() ;
	        
	        Cuenta cc = new CuentaCorriente(22, 11);
	        guardador.adicionar(cc);
	        guardadorRef.adicionar(cc);

	        Cuenta cc2 = new CuentaCorriente(22, 22);
	        guardador.adicionar(cc2);
	        guardadorRef.adicionar(cc2);
	        
	       
	        
	        Cuenta ref = guardador.getReferencia(0);
	        System.out.println("Referencia de Guardador: " + ref.getNumero());
	        
	        
	       String palabra = "palabra";
	       guardadorRef.adicionar(palabra);
	       
	       int tamanoGF = guardadorRef.getCantidadDeElementos() ;
	       
	       System.out.println("Tamano de gaudadorRef: " + tamanoGF);
	       
	       int tamano = guardador.getCantidadDeElementos();
	        System.out.println("Tamano de guardador: " + tamano);
	       
	        
	    }
	
}
