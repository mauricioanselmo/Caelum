<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<%-- comentario em JSP aqui: nossa primeira p�gina JSP --%>
	<%
		String mensagem = "Bem vindo ao sistema de agenda do FJ-21!";	
	%>
	<%= mensagem %>
	<br/>
	
	<%
		String desenvolvido = "Desenvolvido por (Maur�cio)";
	%>
	<%= desenvolvido %>
	<br />
	<%
		System.out.println("Tudo foi executado!");
	%>
</body>
</html>