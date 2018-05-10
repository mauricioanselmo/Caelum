
public class Conta {
	private String titular;
	private int numero;
	private String agencia;
	private double saldo;
	public String dataDeAbertura;
	
	
	public void saca(double valor){
		if (this.saldo > valor){
			this.saldo -= valor;
		}
	}
	
	public void deposita(double valor){
		if (valor >= 0){
			this.saldo += valor;
		}
	}
	
	public double calculaRendimento(){
		return this.saldo * 0.1;
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public int getNumero(){
		return this.numero;
	}
	
	public String getAgencia(){
		return this.agencia;
	}
	
	public void setNumero(int numero){
		this.numero = numero;
	}
	
	public void setAgencia(String agencia){
		this.agencia = agencia;
	}
	
	public void setTitular(String titular){
		this.titular = titular;
	}
	
	public String getTitular(){
		return this.titular;
	}
	
		public Conta(){
			
		}
		
		public Conta(String titular){
			this.titular = titular;
		}
}
