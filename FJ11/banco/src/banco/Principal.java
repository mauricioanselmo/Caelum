package banco;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta conta = new Conta();
		conta.deposita(2000);
		System.out.println("Seu saldo atual é : " + conta.getSaldo());
	}

}
