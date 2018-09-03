<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Livraria Roseria - Carrinho</title>
</head>
	<body>
		<c:import url="../include/menu.jsp" />
		<c:if test="${not empty mensage}">
			<div class="container" style="">
				<div class="alert alert-warning">
	  				${mensage}
				</div>
			</div>
		</c:if>
		<table>
			<thead>
			</thead>
			<tbody>
				<c:forEach var="iten" items="${produto}">
					<tr>
						<td>${iten.tituloDoLivro}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<c:import url="../include/footer.jsp" />
	</body>
</html>