package br.com.caelum;

public class Academia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = "Mauricio";
		int idade = 39;
		float peso = 84.5f;
		double altura = 1.78;
		double imc = peso /  (altura * altura);
		boolean ehFumante = false; //guardar true ou false
		char sexo = 'M';
		boolean amigoDoDono = false;
		if (idade > 18 || amigoDoDono){
			System.out.println("Pode se matricular");
		}else{
			System.out.println("Não pode");
		}
				
	}

}
