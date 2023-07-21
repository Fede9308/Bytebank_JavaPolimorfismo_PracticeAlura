package br.com.bytebank.banco.modelo.especial;

import br.com.bytebank.banco.modelo.Cuenta;

public class CuentaEspecial extends Cuenta {

	public CuentaEspecial(int agencia, int numero) {
		super(agencia, numero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void depositar(double valor) {
		super.saldo += valor;
		
	}

	
	
}
