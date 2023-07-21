package br.com.bytebank.banco.modelo;


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
	public void setContraseña(int contraseña) {
		this.autenticador.setContraseña(contraseña);
		
	}
	@Override
	public boolean autenticar(int contraseña) {
		return this.autenticador.autenticar(contraseña);
    }
}