package br.com.bytebank.banco.modelo;

public class AutenticacionUtil {
		
	private int contraseña;

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    public boolean autenticar(int contraseña) {
        if (this.contraseña == contraseña) {
            return true;
        } else {
            return false;
        }
    }
    
}
