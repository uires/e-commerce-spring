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
		<c:import url="../include/.jsp" />
		<table>
			<thead>
			</thead>
			<tbody>
				<c:forEach var="iten" items="${produto}">
					<tr>
						<td>${iten.livro.nome}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<c:import url="../include/footer.jsp" />
	</body>
</html>