<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="formSpring" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" />
		<title>Livraria Roseira - Livros </title>
	</head>
	<body>
		<c:import url="../include/menu.jsp" />
		<c:import url="../include/bg.jsp" />
		<div class="container">
			<div class="card-deck">
				<c:forEach var="iten" items="${livros}">
					<div class="card">
						<img class="card-img-top" src="" width="383" height="180">
					    <div class="card-body">
					    	<h5 class="card-title">${iten.tituloDoLivro }</h5>
					    	<p class="card-text">${iten.descricao}</p>
					    	<p class="card-text">
					    		<small class="text-muted"><fmt:formatNumber value="${iten.preco}" type="currency" /></small>
					    	</p>
					    </div>
					</div>
				</c:forEach>
			</div>
		</div>
	</body>
</html>