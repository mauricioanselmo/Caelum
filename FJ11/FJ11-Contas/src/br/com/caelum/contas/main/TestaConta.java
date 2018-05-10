package br.com.caelum.contas.main;
import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaConta {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente();
		conta.setTitular("Ana");
		conta.deposita(500.8);
		conta.saca(400);
		System.out.println(conta.getTitular());
		System.out.println(conta);
		
		Conta conta2 = new ContaCorrente();
		conta2.setTitular("Beatriz");
		conta2.deposita(300.5);
		conta2.saca(150);
		System.out.println(conta2.getTitular());
		System.out.println(conta2);		
		
		
	}
}
