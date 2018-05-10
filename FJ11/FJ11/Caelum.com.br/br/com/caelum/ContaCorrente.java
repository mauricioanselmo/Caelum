package br.com.caelum;

public class ContaCorrente {

	String numero;
	String dono;
	double saldo;
	double limite;
	double salario;
	
	boolean saca(double valor) {
		if (saldo > valor) {
			this.saldo -= valor;
			return true;
		}else {
	return false;
		}
	}
	
	public void deposita(double quantidade) {
		this.saldo += quantidade;
	}
	
	
}
