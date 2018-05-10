package br.com.caelum;

public class TestaDuasContas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta minhaConta = new Conta();
		minhaConta.saldo = 1000;
		
		Conta meuSonho = new Conta();
		meuSonho.saldo = 1500000;
		
		System.out.println("Minha Conta " + minhaConta.saldo);
		System.out.println("Meu sonho " + meuSonho.saldo);
		
	}

}
