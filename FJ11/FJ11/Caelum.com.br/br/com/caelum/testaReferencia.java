package br.com.caelum;

public class testaReferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta c1 = new Conta();
		c1.deposita(100);
		
		Conta c2 = new Conta();
		c2.deposita(200);
		
		c2 = c1;

		c2.deposita(200);
		
		System.out.println(c1.saldo);
		System.out.println(c2.saldo);
		
		
	}

}
