package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.*;

public class TestSistema {
	
	public static void main(String[] args) {
	
		Gerente g = new Gerente ();
		g.setContraseña (2222);

		SistemaInterno si = new SistemaInterno();
		si.autenticar(g);
		
	}
}
