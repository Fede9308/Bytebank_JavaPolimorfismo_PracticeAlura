package br.com.bytebank.banco.modelo;

public class GuardadorDeCuentas extends GuardadorDeReferencias {

	 public GuardadorDeCuentas() {
	        super.referencias = new Cuenta[10];
	        super.posicionLibre = 0;
	 }
	 
	 @Override
	 public Cuenta getReferencia(int pos) {
			
			return (Cuenta) super.referencias[pos];
		}
	 
	
  
}
