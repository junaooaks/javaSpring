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
			<li><a href="<c:url value="/pessoa/novo"/>">Cadastrar</a></li>
		</div>

		<h2>Listagem de Pessoas</h2>

		<div class="row clearfix">
			<form method="get" action="<c:url value="/pessoa/buscar"/>">
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
			<div class="col-md-6 column">

				<div class="form-group">
					<label for="nome" id="nome">Nome</label> <input type="text"
						name="nome" id="buscarText" class="form-control" />
				</div>

			</div>
			<div class="col-md-6 column">
				<div class="form-group">
					<input type="submit" class="btn-primary btn" id="buscarButton"
							value="Enviar POST" /> <input type="submit"
							class="btn-primary btn" id="buscarButton2" value="Enviar POST 2" />
						<input type="submit" class="btn-primary btn" id="buscarButton3"
							value="Enviar GET" />
				</div>
			</div>

		</div>


		<div class="row clearfix">
			<div class="col-md-12 column">
				<table class="table table-hover table-striped">
					<thead>
						<tr>
							<th>#</th>
							<th>Nome</th>
							<th>Data Nascimento</th>
							<th>CPF</th>
							<th>Endereco</th>
							<th>-</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="pessoa" items="${pessoas}">
							<tr class="entity_row">
								<td class="id clickable">${pessoa.id}</td>
								<td class="clickable">${pessoa.nome}</td>
								<td class="clickable"><fmt:formatDate value=""
										pattern="dd/MM/yyyy" /> ${pessoa.dataNascimento}</td>
								<td class="clickable">${pessoa.cpf}</td>
								<td class="clickable">${pessoa.endereco}</td>
								<td><a class="btn-primary btn"
									href="<c:url value="/pessoa/${pessoa.id}/deletar"/>">Deletar</a>
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

				$(this).parent().children(".id").each(function() {
					id = $(this).html();
				});
				url = '<c:url value="/pessoa/'+id+'/editar"/>';

				window.location = url;
			});
		});

		
		$("#buscarButton").click(function() {

			var token = $("meta[name='_csrf']").attr("content");
			$.ajax({
				url : '<c:url value="/pessoa/buscarJson"/>',
				type : 'POST',
				headers : {
					'${_csrf.headerName}' : token
				},
				dataType : 'json',
				contentType : 'application/json',
				mimeType : 'application/json',
				success : function(data) {
					console.info(data);
				}
			});
		});

		$("#buscarButton2").click(function() {
			var token = $("meta[name='_csrf']").attr("content");
			$.ajax({
				url : '<c:url value="/pessoa/buscarJsonPOST"/>',
				data : JSON.stringify({ 'nome': $("#buscarText").val() }),
				type : 'POST',
				headers : {
					'${_csrf.headerName}' : token
				},
				dataType : 'json',
				contentType : 'application/json',
				mimeType : 'application/json',
				success : function(data) {
					console.info(data);
				}
			});
		});
		
		$("#buscarButton3").click(function() {
			var token = $("meta[name='_csrf']").attr("content");
			$.ajax({
				url : '<c:url value="/pessoa/buscarJsonGET"/>/' + $("#buscarText").val(),
				type : 'GET',
				headers : {
					'${_csrf.headerName}' : token
				},

				success : function(data) {
					console.info(data);
				}
			});
		});
	});
</script>
</html>