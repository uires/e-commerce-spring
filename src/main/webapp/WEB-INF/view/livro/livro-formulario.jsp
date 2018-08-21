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
		<formSpring:form action="" method="POST" modelAttribute="livro">
			<div>
				<label>Título Livro:</label>
				<formSpring:input path="tituloDoLivro" maxlength="55"  />
				<formSpring:errors path="tituloDoLivro" />
			</div>
			
			<div>
				<label>Descrição Livro:</label>
				<formSpring:textarea path="descricao" cols="150" rows="30"/>
				<formSpring:errors path="descricao" />
			</div>
		</formSpring:form>
	</body>
</html>