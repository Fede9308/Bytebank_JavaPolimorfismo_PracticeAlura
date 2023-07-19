
public class Gerente extends Funcionario implements Autenticacion {
	
	private int contraseña;
	


	  @Override
	    public void setContraseña(int contraseña) {
	        this.contraseña = contraseña;

	    }


	   @Override
	    public boolean autenticar(int contraseña) {
	        if (this.contraseña == contraseña) {
	            return true;
	        } else {
	            return false;
	        }
	    }
	
	
		public double getBonificacion() {
			
			System.out.println("Bonificacion Gerente");
		    return  this.salario * 0.1 + super.getSalario();
		}

}
