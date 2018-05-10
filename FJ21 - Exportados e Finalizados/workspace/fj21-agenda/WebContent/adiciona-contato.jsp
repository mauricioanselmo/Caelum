<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="caelum" %>
<html>
<head>
<meta charset="utf-8">
<title>FJ21 - Agenda | FormulÃ¡rio de Contato</title>

<link href="css/jquery.css" rel="stylesheet">
<script src="js/jquery.js"></script>
<script src="js/jquery-ui.js"></script>

</head>
<body>
<c:import url="cabecalho.jsp"/>
<h1>Adiciona Contatos</h1>
<hr />
<form action="/fj21-agenda/insereContato">
	<label>Nome: </label>
		<input type="text" name="nome" /><br />
		

	<label>Email: </label>
		<input type="text" name="email" /><br />


	<label>Endereço: </label>
		<input type="text" name="endereco" /><br />
		

	<label>Data de Nascimento: </label>
		<caelum:campoData id="dataNascimento" /><br />
		

	<input type="submit" value="Gravar" />

</form>
<c:import url="rodape.jsp" />
</body>
</html>