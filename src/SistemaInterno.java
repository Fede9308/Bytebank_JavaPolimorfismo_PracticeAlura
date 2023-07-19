
public class SistemaInterno {


    private int contraseña = 2222;

    public void autenticar(Autenticacion au) {

        boolean autentico = au.autenticar(this.contraseña);

        if (autentico) {
            System.out.println("Puede entrar al sistema");
        } else {
            System.out.println("No puede entrar al sistema");
        }
    }
}
