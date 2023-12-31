package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.*;

public class TestSacar {

        public static void main(String[] args) {
            Cuenta cuenta = new CuentaCorriente(123, 321);

            cuenta.depositar(200.0);

            try {
                cuenta.sacar(310.0);
            } catch(SaldoInsuficienteException ex) {
                System.out.println("Exception: " + ex.getMessage());
                ex.printStackTrace();
            }

            System.out.println(cuenta.getSaldo());
        }
}
