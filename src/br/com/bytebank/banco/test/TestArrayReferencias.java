package br.com.bytebank.banco.test;
import br.com.bytebank.banco.modelo.*;

public class TestArrayReferencias {

    public static void main(String[] args) {

        Cuenta[] cuentas = new Cuenta[5];
        CuentaCorriente cc1 = new CuentaCorriente(22, 11);
        cuentas[0] = cc1;

        CuentaAhorros ca2 = new CuentaAhorros(22, 22);
        cuentas[1] = ca2;  

        System.out.println( cuentas[1].getNumero()  );

        CuentaCorriente ref =(CuentaCorriente) cuentas[0];
        System.out.println(ca2.getNumero());
        System.out.println(ref.getNumero());
    }
}
