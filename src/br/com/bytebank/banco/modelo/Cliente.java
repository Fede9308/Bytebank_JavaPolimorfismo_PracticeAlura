package br.com.bytebank.banco.modelo;
/**
 * 
 * @author Becerra Federico
 * @version 0.1
 *
 */

public class Cliente implements Autenticacion {

    private String nombre;
    private String numeroIdentidad;
    private String profesion;
   
    
    private AutenticacionUtil autenticador;
    
    public Cliente() {
        this.autenticador = new AutenticacionUtil();
    }
    
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNumeroIdentidad() {
		return numeroIdentidad;
	}
	public void setNumeroIdentidad(String numeroIdentidad) {
		this.numeroIdentidad = numeroIdentidad;
	}
	public String getProfesion() {
		return profesion;
	}
	public void setProfesion(String profesion) {
		this.profesion = profesion;
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