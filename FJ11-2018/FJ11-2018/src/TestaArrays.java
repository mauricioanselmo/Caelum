import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaArrays {

	public static void main(String[] args) {
		Conta[] contas = new Conta[10];
		
		for (int i = 0; i < contas.length; i++){
			Conta conta = new ContaCorrente();
			conta.setTitular("titular " + i);
			conta.deposita(i*100.0);
			contas[i] = conta;
			System.out.println(contas[i].getSaldo());
			System.out.println(contas[i].getTitular());
		}
		
		double total=0;
		double media = 0;
		
		for (int i = 0; i < contas.length; i++){		
			total += contas[i].getSaldo();
			media = total / contas.length;
		}
		System.out.println("O total é " + total);
		System.out.println("A média é " + media);
	}

}
