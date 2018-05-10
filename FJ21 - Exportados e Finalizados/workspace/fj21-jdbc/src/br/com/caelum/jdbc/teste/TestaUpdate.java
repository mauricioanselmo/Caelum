package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.modelo.Contato;

public class TestaUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContatoDao dao = new ContatoDao();
		Contato contato = new Contato();
		contato.setId(13L);
		contato.setNome("SR. Maurício");
		contato.setEmail("mautotoso@gmail.com");
		
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.set(1800,  Calendar.APRIL, 21);
		contato.setDataNascimento(dataNascimento);
		dao.altera(contato);
		System.out.println("Atualizado com sucesso!");
		
		
	}

}
