<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
	<body>
		<c:import url="cabecalho.jsp"/>
		
		<!--  cria o dao -->
		
		<table>
		<!--  percorre contatos montando as linhas da tabela -->
		<c:forEach var="contato" items="${contatos}">
		<tr>
			<td>${contato.nome}</td>
			<td>
				<c:if test="${not empty contato.email}">
				<a href="mailto:${contato.email}">${contato.email}</a>
				</c:if>
				
				
				<c:if test="${empty contato.email}">
					E-mail não informado
				</c:if>
				
				
				
			</td>

			<td>${contato.endereco}</td>
			<td>${contato.dataNascimento.time}</td>
			<td>
				<a href="mvc?logica=RemoveContatoLogic&id=${contato.id}">Remover</a> 
			</td>
			
		</tr>
		</c:forEach>
		</table>
		<c:import url="rodape.jsp" />
	</body>
</html>


