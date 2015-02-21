<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html lang="en">
<head>
<jsp:include page="../templating/head.jsp"></jsp:include>
</head>

<body>
	<jsp:include page="../templating/navegation.jsp"></jsp:include>
	<div class="container" style="padding-top: 50px;">
		
		<div class="col-md-1 column">
			<li><a href="<c:url value="/produto/novo"/>">Cadastrar</a></li>
		</div>

		<h2>Listagem de Produtos</h2>

		<div class="row clearfix">
			<form method="get" action="<c:url value="/produto/buscar"/>">
				<div class="col-md-6 column">

					<div class="form-group">
						<label for="nome" id="nome">Nome</label> <input type="text"
							name="nome" id="nome" class="form-control" />
					</div>

				</div>
				<div class="col-md-6 column">
					<div class="form-group">
						<input type="submit" class="btn-primary btn" />
					</div>
				</div>

			</form>
		</div>

		<div class="row clearfix">
			<div class="col-md-12 column">
				<table class="table table-hover table-striped">
					<thead>
						<tr>
							<th>#</th>
							<th>Nome</th>
							
							<th>-</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="produto" items="${produto}">
							<tr class="entity_row">
								<td class="id clickable">${produto.id}</td>
								<td class="clickable">${produto.produto}</td>
								<td><a class="btn-primary btn"
									href="<c:url value="/produto/${produto.id}/deletar"/>">Deletar</a>
								</td>
							</tr>
						</c:forEach>

					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>

<script type="text/javascript">
	$(document).ready(function() {
		$("td.clickable").each(function() {

			$(this).bind("click", function() {
				id = "";
				console.info($(this).parent);
				$(this).parent().children(".id").each(function() {
					id = $(this).html();
				});
				url = '<c:url value="/produto/'+id+'/editar"/>';

				window.location = url;
			});
		});
	});
</script>
</html>