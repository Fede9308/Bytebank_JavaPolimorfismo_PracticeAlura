package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.*;

public class TestToString {

	
    public static void main(String[] args) {

        Object cc = new CuentaCorriente(22, 33);
        Object cp = new CuentaAhorros(33, 22);

        System.out.println(cc);
        System.out.println(cp);
    }
	
}
