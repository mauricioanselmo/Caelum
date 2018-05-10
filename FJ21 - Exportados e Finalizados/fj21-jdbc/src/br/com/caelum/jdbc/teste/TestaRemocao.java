package br.com.caelum.jdbc.teste;

import org.omg.PortableServer.SERVANT_RETENTION_POLICY_ID;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.modelo.Contato;

public class TestaRemocao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContatoDao dao = new ContatoDao();
		
		Contato contato = new Contato();
		contato.setId(10L);
		dao.remove(contato);
		System.out.println("Elemento removido com sucesso!");
	}

}
