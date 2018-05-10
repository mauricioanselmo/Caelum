package br.com.caelum.contas.main;
import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;

public class TestaConta {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente();
		Conta c3 = new ContaCorrente();
		System.out.println(c3.getTitular());
		
		
		conta.setTitular("Maurício");
		conta.setNumero(1234);
		conta.setAgencia("6699-X");
		conta.deposita(500);
		conta.dataDeAbertura = "17/03/2001";

		
		conta.deposita(100);
		conta.saca(50);
		System.out.println("Bom dia " + conta.getTitular() + " Agencia: " + conta.getAgencia() + " conta " + conta.getNumero() + ":");
		System.out.println("O saldo atual é : " + conta.getSaldo());
		System.out.println("O Juros com o saldo atual é de " + conta.calculaRendimento());
		
		Conta c1 = new ContaCorrente();
		Conta c2 = new ContaCorrente();
		
		c1.deposita(300);
		System.out.println(c1.getSaldo()); 
		c1.getSaldo();
		System.out.println(c1.getSaldo());
		System.out.println(c2.getSaldo());
	}

}
