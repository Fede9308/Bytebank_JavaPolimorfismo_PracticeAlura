package br.com.bytebank.banco.modelo;

public interface Autenticacion {

	public abstract void setContraseña(int contraseña);
    public abstract boolean autenticar(int contraseña);
	
}