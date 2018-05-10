package banco;

public class Conta {
	private double saldo;

	void deposita(double valor) {
		this.saldo += valor;
	}

	public double getSaldo() {
		// TODO Auto-generated method stub
		return this.saldo;
	}

	public void atualiza(double taxa) {
		new ContaCorrente();
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
