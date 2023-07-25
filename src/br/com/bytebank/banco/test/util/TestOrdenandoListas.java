package br.com.bytebank.banco.test.util;



import br.com.bytebank.banco.modelo.*;

import java.util.*;

public class TestOrdenandoListas {
	
	public static void main(String[] args) {
		
		
		Cuenta cc1 = new CuentaCorriente(22, 33);
		cc1.depositar(333.0);

		Cuenta cc2 = new CuentaAhorros(22, 44);
		cc2.depositar(444.0);

		Cuenta cc3 = new CuentaCorriente(22, 11);
		cc3.depositar(111.0);

		Cuenta cc4 = new CuentaAhorros(22, 22);
		cc4.depositar(222.0);

		List<Cuenta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		
		
		for (Cuenta cuenta : lista) {
		    System.out.println(cuenta);
		}

		NumeroDeCuentaComparator comparator = new NumeroDeCuentaComparator();
		lista.sort(comparator);

		System.out.println("---------");
		
		for (Cuenta cuenta : lista) {
		    System.out.println(cuenta);
		}
		
	}

	 public static class NumeroDeCuentaComparator implements Comparator<Cuenta> {

		
		    @Override
		    public int compare(Cuenta c1, Cuenta c2) {
		    	
		    	return Integer.compare(c1.getNumero(), c2.getNumero());
		    }
		}

}


