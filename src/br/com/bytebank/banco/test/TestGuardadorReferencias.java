package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.GuardadorDeReferencias;
import br.com.bytebank.banco.modelo.Cuenta;
import br.com.bytebank.banco.modelo.CuentaCorriente;

public class TestGuardadorReferencias {
    public static void main(String[] args) {
        GuardadorDeReferencias guardador = new GuardadorDeReferencias();

        Cuenta cc = new CuentaCorriente(22, 11);
        guardador.adicionar(cc);

        Cuenta cc2 = new CuentaCorriente(22, 22);
        guardador.adicionar(cc2);

        int tamano = guardador.getCantidadDeElementos();
        System.out.println(tamano);

        Cuenta ref = (Cuenta)guardador.getReferencia(0);
        System.out.println(ref.getNumero());        
    }
}