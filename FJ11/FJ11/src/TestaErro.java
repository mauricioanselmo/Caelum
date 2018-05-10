
import br.com.caelum.ContaCorrente;

public class TestaErro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inicio do main");
		metodo1();
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		// TODO Auto-generated method stub
		System.out.println("Inicio do metodo1");
		metodo2();
		System.out.println("fim do metodo1");
	}

	private static void metodo2() {
		// TODO Auto-generated method stub
		System.out.println("Inicio do metodo2");
		ContaCorrente cc = new ContaCorrente();
		for (int i = 0; i <= 15; i++){
			cc.deposita(i + 1000);
			System.out.println(cc.getsaldo());
			if (i == 5){
				cc = null;
		}
	}
	System.out.println("fim do metodo 2");
	
	}
}
