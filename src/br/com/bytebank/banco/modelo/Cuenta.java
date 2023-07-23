package br.com.bytebank.banco.modelo;

/**
 * 
 * @author Becerra Federico
 * @version 0.1
 *
 */

public abstract class Cuenta {
	
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	/**
	 * 
	 * Constructor para inicializar el objeto Cuenta a partir da agencia y numero
	 * @param agencia
	 * @param numero
	 */
	
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
	
	/**
	 * 
	 * valor necesita ser menor o igual al saldo
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	
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
	
	@Override
	public String toString() {
	    return "Numero: " + this.numero + ", Agencia: " + this.agencia;
	}
	
	

	
}
