package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.modelo.Contato;

public class TestaInsere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// pronto para gravar
		
		Contato contato = new Contato();
		contato.setNome("Mauzinho");
		contato.setEmail("mauricioanselmosp@gmail.com");
		contato.setEndereco("R. Vergueiro 3185 cj 57");
		contato.setDataNascimento(Calendar.getInstance());
		
		//grave nessa conexão
		ContatoDao dao = new ContatoDao();
		
		//metodo elegante
		dao.adiciona(contato);
		
		System.out.println("Gravado!");
	}

}
