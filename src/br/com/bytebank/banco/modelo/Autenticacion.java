package br.com.bytebank.banco.modelo;

public interface Autenticacion {

	public abstract void setContrasena(int contrasena);
    public abstract boolean autenticar(int contrasena);
	
}
