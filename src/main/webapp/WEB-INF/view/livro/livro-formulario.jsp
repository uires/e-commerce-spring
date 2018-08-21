<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="formSpring" %>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Livraria Roseira - Cadastro Produto</title>
	</head>
	<body>
		<formSpring:form action="cadastrarLivro" method="POST" modelAttribute="livro">
			<!-- Título Input -->
			<div>
				<label>Título Livro:</label>
				<formSpring:input path="tituloDoLivro" maxlength="55"  /><br />
				<formSpring:errors path="tituloDoLivro" />
			</div><br />
			<!-- Páginas Input -->
			<div>
				<label>Páginas:</label>
				<formSpring:input path="paginas" /><br />
				<formSpring:errors path="paginas" />
			</div>
			<!-- Descrição Input -->
			<div>
				<label>Descrição Livro:</label><br />
				<formSpring:textarea path="descricao" cols="55" rows="10"/><br />
				<formSpring:errors path="descricao" />
			</div><br /><br />
			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</formSpring:form>
	</body>
</html>