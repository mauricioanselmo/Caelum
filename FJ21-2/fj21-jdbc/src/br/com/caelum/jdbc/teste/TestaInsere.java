package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaInsere {
	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.setNome("Mauricio");
		contato.setEmail("mauricioanselmo@hotmail.com");
		contato.setEndereco("Rua Juari, 518");
		contato.setDataNascimento(Calendar.getInstance());
		
		//Grava conexao
		ContatoDao dao = new ContatoDao();
		
		//metodo elegante
		dao.adiciona(contato);
		System.out.println("Gravado!");
		

	}
}
