package br.com.caelum.contas.modelo;
/**
 * 
 * Esse é um comentário de bloco a ser exportado num arquivo doc
 *@author Maurício
 */
public abstract class Conta implements Comparable<Conta>{
	public abstract String getTipo();
	private String titular;
	protected double saldo;
	private int numero;
	private String agencia;
	private String dataDeAbertura;

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getDataDeAbertura() {
		return dataDeAbertura;
	}

	public void setDataDeAbertura(String dataDeAbertura) {
		this.dataDeAbertura = dataDeAbertura;
	}
/**
 * mnétodo que retorna o saldo para o usuário
 * @return O saldo
 */
	public double getSaldo() {
		return saldo;
	}
/**
 * Faz o incremento de valor dentro da Conta incluíndo o valor de depósito.
 * @param valor
 */
	public void deposita(double valor) {
		// TODO Auto-generated method stub
		if (valor < 0){
			throw new IllegalArgumentException("Oh imbecil!!! como se saca valor negativo?");
		}else{
			this.saldo += valor;
		}
	}

	public void saca(double valorDigitado) {
		// TODO Auto-generated method stub
		if (saldo >= valorDigitado) {
			this.saldo -= valorDigitado;
		}
	}
	
	public void transfere(double valor, Conta conta){
		this.saca(valor);
		conta.deposita(valor);
	}
	
	@Override
	public String toString(){
		return "[Titular=" + titular.toUpperCase() + ", numero=" + numero + ",  agencia=" + agencia + "]";
	}
	
	@Override
	public boolean equals(Object obj){
		if (obj == null){
			return false;
		}
		Conta outra = (Conta) obj;
		return this.numero == outra.numero && this.agencia.equals(outra.agencia);		
		}
	
	public int compareTo(Conta outraConta){
		return this.titular.compareTo(outraConta.titular);
	}
}