<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Livraria Roseria - Carrinho</title>
	<style type="text/css">
		.img-controll {
			float: left;
		}
	</style>
</head>
	<body>
		<c:import url="../include/menu.jsp" />
		<c:if test="${not empty mensage}">
			<div class="container" style="margin-top: 100px; margin-bottom: 100px;">
				<div class="alert alert-warning">
	  				${mensage}
				</div>
			</div>
		</c:if>
		<div class="container" style="margin-top: 55px; margin-bottom: 55px;">
			<c:forEach var="iten" items="${produto.livros}">
				<div>
					<div class="img-controll">
						<img width="280" height="280" src="${iten.urlImagemLivro}" alt="${iten.tituloDoLivro}" />
					</div>
					<div class="card">
					  	<div class="card-body">
					   		<h5 class="card-title">${iten.tituloDoLivro}</h5>
					   		<p class="card-text">${iten.descricao}</p>
					   		 <div class="card-footer">
	      						<p class="h4"><fmt:formatNumber type="currency" value="${iten.preco}" /></p>
	    					</div>
					 	</div>
					</div>
				</div>
			</c:forEach>
		</div>
		<div>
			Total à pagar:
			<fmt:formatNumber type="currency" value="${produto.valorTotal}" />
			<button class="btn btn-primary">Pagar</button>
		</div>
		<c:import url="../include/footer.jsp" />
	</body>
</html>