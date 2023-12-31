package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.*;

public class TestGerente {

    public static void main(String[] args) {

        Gerente g1 = new Gerente();
        g1.setNombre("Marco");
        g1.setDocumentoIdentidad("235568413");
        g1.setSalario(5000.0);

        System.out.println(g1.getNombre());
        System.out.println(g1.getDocumentoIdentidad());
        System.out.println(g1.getSalario());
      

        g1.setContrasena(2222);
        boolean autentico = g1.autenticar(2222);

        System.out.println(autentico);

        System.out.println(g1.getBonificacion());
    }

}