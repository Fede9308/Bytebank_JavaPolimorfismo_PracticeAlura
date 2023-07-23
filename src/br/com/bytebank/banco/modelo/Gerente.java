package br.com.bytebank.banco.modelo;

public class Gerente extends Funcionario implements Autenticacion {
	
    private AutenticacionUtil autenticador;

    public Gerente() {
        this.autenticador = new AutenticacionUtil();
    }


	  @Override
	    public void setContrasena(int contrasena) {
		  this.autenticador.setContrasena(contrasena);

	    }


	   @Override
	    public boolean autenticar(int contrasena) {
		   return this.autenticador.autenticar(contrasena);
	    }
	
	
		public double getBonificacion() {
			
			System.out.println("Bonificacion Gerente");
		    return  this.salario * 0.1 + super.getSalario();
		}

}
