package br.com.caelum.contas.modelo;

public class SeguroDeVida implements Tributavel{
	private double valor;
	private String titular;
	private int numeroApolice;
	
	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return 42 + this.valor * 0.02 ;
	}

	@Override
	public String getTitular() {
		// TODO Auto-generated method stub
		return this.titular;
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "Seguro de vida";
	}

	public int getNumeroApolice() {
		return numeroApolice;
	}

	public void setNumeroApolice(int numeroApolice) {
		this.numeroApolice = numeroApolice;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
