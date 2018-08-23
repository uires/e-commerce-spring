<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="formSpring" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
	<head>
		<meta charset="UTF-8" />
		<title>Livraria Roseira - Cadastro Produto</title>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" 
			integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
	</head>
	<body>
		<c:import url="../include/menu.jsp" />
		<div class="jumbotron jumbotron-fluid">
		  	<div class="container">
		    	<h1 class="display-4">Cadastro Livro</h1>
			</div>
		</div>
		<div class="container">
			<div class="shadow-sm p-3 mb-5 bg-white rounded">
				<formSpring:form action="cadastrarLivro" method="POST" modelAttribute="livro">
					<!-- Título Input -->
					<div class="form-group">
						<label>Título</label>
						<formSpring:input path="tituloDoLivro" maxlength="55"  cssClass="form-control titulo-input" /><br />
						<formSpring:errors path="tituloDoLivro" cssClass="font-italic" cssStyle="color:red;"/>
					</div>
					<!-- Páginas Input -->
					<div class="form-group">
						<label>Páginas</label>
						<formSpring:input path="paginas" cssClass="form-control pagina-input" /><br />
						<formSpring:errors path="paginas" cssClass="font-italic" cssStyle="color:red;" />
					</div>
					<!-- Preço input -->
					<div class="form-group">
						<label>Preço</label>
						<formSpring:input path="preco" cssClass="form-control preco-input" /><br />
						<formSpring:errors path="preco" cssClass="font-italic" cssStyle="color:red;" />
					</div>
					<!-- Descrição Input -->
					<div class="form-group">
						<label>Descrição</label><br />
						<formSpring:textarea path="descricao" cols="30" rows="10" maxlength="255" cssClass="form-control descricao-input"/><br />
						<formSpring:errors path="descricao" cssClass="font-italic" cssStyle="color:red;" />
					</div><br />
					<button type="submit" class="btn btn-primary active btn-lg" >Cadastrar</button>
					<button type="button" class="btn btn-secondary active btn-lg" onclick="cleanLabel();">Cancelar</button>
				</formSpring:form>
			</div>
		</div>
		<script type="text/javascript">
			
			function cleanLabel(){
				document.querySelector(".titulo-input").value = '';
				document.querySelector(".pagina-input").value = '';
				document.querySelector(".preco-input").value = '';
				document.querySelector(".descricao-input").value = '';
			}
			
		</script>
	</body>
</html>