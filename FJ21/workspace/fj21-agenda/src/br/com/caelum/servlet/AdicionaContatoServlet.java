package br.com.caelum.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDao;
import br.com.caelum.agenda.modelo.Contato;

@WebServlet("/insereContato")
public class AdicionaContatoServlet extends HttpServlet{
	protected void service(HttpServletRequest request, 
			HttpServletResponse response) 
			throws IOException, ServletException {
		
		//busca o writer
		PrintWriter out = response.getWriter();
		
		//buscando os parametros do request
		String nome = request.getParameter("nome");
		String endereco = request.getParameter("endereco");
		String email = request.getParameter("email");
		String dataEmTexto = request.
				getParameter("dataNascimento");
		
		Calendar dataNascimento = null;
		
		try{
			Date date = new SimpleDateFormat("dd/MM/yyyy")
					.parse(dataEmTexto);
			dataNascimento = Calendar.getInstance();
			dataNascimento.setTime(date);
		}catch (ParseException e){
			out.println("Erro e conversão da data");
			return;   //para a execução do metodo
		}
		//monta um objeto contato
		Contato contato = new Contato();
		contato.setNome(nome);
		contato.setEndereco(endereco);
		contato.setEmail(email);
		contato.setDataNascimento(dataNascimento);
		Connection conexao = (Connection) request.getAttribute("conexao");
		
		
		
		
		//salva o contato
		ContatoDao dao = new ContatoDao(conexao);
		dao.adiciona(contato);
		
		//imprime que o nome do contato foi adicionado
		RequestDispatcher rd= request.getRequestDispatcher("/contato-adicionado.jsp");
		rd.forward(request, response);
		/*
		out.println("<html>");
		out.println("<body>");
		out.println("Contato " + contato.getNome() +
				" adicionado com sucesso");
		out.println("</body>");
		out.println("</html>");
		*/
	}
}
