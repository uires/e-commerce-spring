<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="formSpring" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" />
		<title>Livraria Roseira - Livros </title>
		<style type="text/css">
			.card-deck .card {
				margin-bottom: 30px !important;
			}
			.card-img-top {
				padding: 30px;
			}
			.card-img-top img{
				align-content: center;
				padding: 30px;
			}
			.border-bottom-bg {
				height: 55px;
				background-color: #23272b;
				margin-bottom: 55px;
				color: white;
				text-align: right;
				line-height: 55px;
			}
			.border-bottom-bg i {
				margin-right: 20px;
			}
		</style>
	</head>
	<body>
		<c:import url="../include/menu.jsp" />
		<c:import url="../include/bg.jsp" />
		<div class="border-bottom-bg">
			<i>Livres, connaissances, sagesse, information!</i>
		</div>
		<div class="container">
			<div class="card-deck">
				<c:forEach var="iten" items="${livros}">
					<div class="card card-controll-layout" style="max-width:348px; min-width:340px; 
						display: flex; flex-grow: 1; flex-wrap: wrap;">
						<img class="card-img-top" src="${iten.urlImagemLivro}" width="200">
					    <div class="card-body">
					    	<h5 class="card-title">${iten.tituloDoLivro }</h5>
					    	<p class="card-text lead">${iten.descricao}</p>
					    	<div class="card-footer">
					    		<p class="h4"><fmt:formatNumber value="${iten.preco}" type="currency" /></p>
						    </div>
					    </div>
					</div>
				</c:forEach>
			</div>
		</div>
		<c:import url="../include/footer.jsp" />
	</body>
</html>