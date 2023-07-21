package br.com.bytebank.banco.modelo;

public class CuentaCorriente extends Cuenta implements Tributacion {

	public CuentaCorriente(int agencia, int numero) {
	    super(agencia, numero);
	}
	
	@Override
	public void sacar(double valor) throws SaldoInsuficienteException {
        double valorASacar = valor + 0.2;
        super.sacar(valorASacar);
	}

	@Override
	public void depositar(double valor) {
		super.saldo += valor;
		
	}

	@Override
	public double getValorImpuesto() {
		return super.saldo * 0.01;
	}
	
}
