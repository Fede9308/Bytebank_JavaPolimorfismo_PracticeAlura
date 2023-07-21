package br.com.bytebank.banco.modelo;

public class ControleBonificacion {

	private double suma;
	
	public void registrar(Funcionario e) {
	    double boni = e.getBonificacion();
	    this.suma = this.suma + boni;
	}

	public double getSuma() {
	    return this.suma;
	}
}
