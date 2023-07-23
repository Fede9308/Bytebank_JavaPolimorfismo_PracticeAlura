package br.com.bytebank.banco.modelo;

public class AutenticacionUtil {
		
	private int contrasena;

    public void setContrasena(int contrasena) {
        this.contrasena = contrasena;
    }

    public boolean autenticar(int contrasena) {
        if (this.contrasena == contrasena) {
            return true;
        } else {
            return false;
        }
    }
    
}
