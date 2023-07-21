package br.com.bytebank.banco.modelo;

public abstract class Cuenta {
	
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	
	public Cuenta (int agencia, int numero){
	    this.agencia = agencia;
	    this.numero = numero;
	    this.saldo = 100; 
	    
	    total++;
	}
	
	
	public static int getTotal() {
		
		return Cuenta.total ;
	}
	
	public abstract void depositar(double valor);
	
	
	public void sacar(double valor) throws SaldoInsuficienteException{

        if(this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
        }

        this.saldo -= valor;           
	}
	
	public void transferir(double valor, Cuenta destino)throws SaldoInsuficienteException{

		 this.sacar(valor);
	        destino.depositar(valor);
	}


	public int getAgencia() {
		return agencia;
	}


	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public Cliente getTitular() {
		return titular;
	}


	public void setTitular(Cliente titular) {
		this.titular = titular;
	}


	public double getSaldo() {
		return saldo;
	}
	
	

	
}
