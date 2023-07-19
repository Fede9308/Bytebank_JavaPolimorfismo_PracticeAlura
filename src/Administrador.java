
public class Administrador extends Funcionario implements Autenticacion {

	private int contraseña;
	
	@Override
	public double getBonificacion() {
		// TODO Auto-generated method stub
		return 0;
	}

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

	
	
}
