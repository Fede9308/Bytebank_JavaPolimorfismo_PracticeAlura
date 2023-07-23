package br.com.bytebank.banco.modelo;

public class Administrador extends Funcionario implements Autenticacion {

	private AutenticacionUtil autenticador;

	public Administrador() {
	        this.autenticador = new AutenticacionUtil();
	}
	
	@Override
	public double getBonificacion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setContrasena(int contrasena) {
		this.autenticador.setContrasena(contrasena);
	}

	@Override
	public boolean autenticar(int contrasena) {
		 return this.autenticador.autenticar(contrasena);
	}

	
	
}
