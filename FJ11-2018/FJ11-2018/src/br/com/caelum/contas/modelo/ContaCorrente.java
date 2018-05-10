package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel{
	@Override
	public void saca(double valor){
		if (valor <0 ){
			throw new IllegalArgumentException("Não permitido saque de valor negativo");
		}else if (saldo < valor){
			throw new IllegalArgumentException("Saldo Insuficiente");
		}
		this.saldo -= (valor + 0.10);
	}
	public String getTipo(){
		return "Conta Corrente";
	}

	public double getValorImposto() {
		return this.getSaldo()*0.01;
	}
}
