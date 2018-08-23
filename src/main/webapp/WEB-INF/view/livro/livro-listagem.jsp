<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="formSpring" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" />
		<title>Livraria Roseira - Livros </title>
	</head>
	<body>
		<div>
			<table>
				<thead>
					<tr>
						<th>Nome</th>
						<th>Preço</th>
						<th>Páginas</th>
					</tr>					
				</thead>
				<tbody>
					<c:forEach var="iten" items="${livros}">
						<tr>
							<td>${iten.nome}</td>
							<td>${iten.preco}</td>
							<td>${iten.paginas}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</body>
</html>