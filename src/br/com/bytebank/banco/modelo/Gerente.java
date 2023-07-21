package br.com.bytebank.banco.modelo;

public class Gerente extends Funcionario implements Autenticacion {
	
    private AutenticacionUtil autenticador;

    public Gerente() {
        this.autenticador = new AutenticacionUtil();
    }


	  @Override
	    public void setContraseña(int contraseña) {
		  this.autenticador.setContraseña(contraseña);

	    }


	   @Override
	    public boolean autenticar(int contraseña) {
		   return this.autenticador.autenticar(contraseña);
	    }
	
	
		public double getBonificacion() {
			
			System.out.println("Bonificacion Gerente");
		    return  this.salario * 0.1 + super.getSalario();
		}

}
