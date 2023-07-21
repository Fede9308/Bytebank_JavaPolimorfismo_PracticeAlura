package br.com.bytebank.banco.modelo;

public abstract class Funcionario {

	private String nombre;
	private String documentoIdentidad;
	protected double salario;
	
	
	public Funcionario(){
		
		
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocumentoIdentidad() {
		return documentoIdentidad;
	}
	public void setDocumentoIdentidad(String documento) {
		this.documentoIdentidad = documento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
		}
	
	
	
	public abstract double getBonificacion(); 
	
	
}