package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel{
	
	@Override
	public void saca(double valor){
		if (valor < 0){
			throw new IllegalArgumentException("Valor solicitado de saque é negativo");
		}
		if (valor > saldo){
			throw new SaldoInsuficienteException(valor);
		}
		if(this.saldo >= valor){
			this.saldo -= (valor +0.10);			
		}
	}
	public String getTipo(){
		return "Conta Corrente";
	}
	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return this.getSaldo() * 0.01;
	}
}
