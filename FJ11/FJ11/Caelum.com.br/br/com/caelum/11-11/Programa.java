package br.com.caelum;

public class Programa {

	public static void main(String[] args) {
		ContaCorrente minhaConta;
		minhaConta = new ContaCorrente();
		minhaConta.dono = "Maurício";
		minhaConta.limite = 11.600;
		minhaConta.saldo = 1000;
		minhaConta.numero = "021.9384-2";
		
		System.out.println("Cliente: " + minhaConta.dono);
		System.out.println("Limite cheque especial: "+ minhaConta.limite);
		System.out.println("Saldo Atual: " + minhaConta.saldo);
		System.out.println("Conta Corrente: " + minhaConta.numero);
		if(minhaConta.saca(200)){
			System.out.println("Saque realizado com sucesso, saldo atual " + minhaConta.saldo);
		}else {
			System.out.println("Saldo Insuficiente para a operação " + minhaConta.saldo);
		}
		System.out.println("Saldo Atual: " + minhaConta.saldo);
		minhaConta.deposita(500);
		System.out.println("Saldo Atual: " + minhaConta.saldo);
	}

}
