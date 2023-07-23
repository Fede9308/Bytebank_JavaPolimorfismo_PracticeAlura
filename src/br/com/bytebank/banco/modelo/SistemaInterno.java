package br.com.bytebank.banco.modelo;

public class SistemaInterno {


    private int contrasena = 2222;

    public void autenticar(Autenticacion au) {

        boolean autentico = au.autenticar(this.contrasena);

        if (autentico) {
            System.out.println("Puede entrar al sistema");
        } else {
            System.out.println("No puede entrar al sistema");
        }
    }
}
