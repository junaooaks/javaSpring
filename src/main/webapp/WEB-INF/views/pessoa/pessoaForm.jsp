<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html lang="en">
<head>
<head>
<jsp:include page="../templating/head.jsp"></jsp:include>
</head>

<body>
	<jsp:include page="../templating/navegation.jsp"></jsp:include>
	<div class="container" style="padding-top: 50px;">

		<h2>Formulário de Pessoas</h2>

		<div class="row clearfix">
			<div class="col-md-12 column">

				<c:choose>
					<c:when test="${empty pessoa['id']}">
						<c:set var="method" value="POST" />
					</c:when>
					<c:otherwise>
						<c:set var="method" value="PUT" />
					</c:otherwise>
				</c:choose>

				<form:form method="${method}" modelAttribute="pessoa">
					<div class="form-group">
						<form:label for="nome" path="nome" cssErrorClass="error">Nome</form:label>
						<form:input type="text" name="nome" class="form-control" id="nome"
							path="nome" />
					</div>

					<div class="form-group">
						<spring:bind path="dataNascimento">
							<form:label for="dataNascimento" path="dataNascimento"
								cssErrorClass="error">Data Nascimento</form:label>
							<form:input type="text" name="dataNascimento"
								class="form-control" id="dataNascimento" path="dataNascimento" />
							<span class="help-inline">${status.errorMessage}</span>
						</spring:bind>
					</div>

					<div class="form-group">
						<form:label for="cpf" path="cpf" cssErrorClass="error">CPF</form:label>
						<form:input type="text" name="cpf" class="form-control" id="cpf"
							path="cpf" />
					</div>
					
					<div class="form-group">
						<form:label for="cnpj" path="cnpj" cssErrorClass="cnpj">CNPJ</form:label>
						<form:input type="text" name="cnpj" class="form-control" id="cnpj"
							path="cnpj" />
					</div>
					
					<div class="form-group">
						<form:label for="cidade" path="cidade" cssErrorClass="cidade">Cidade</form:label>
						<form:input type="text" name="cidade" class="form-control" id="cidade"
							path="cidade" />
					</div>
					
					<div class="form-group">
						<form:label for="endereco" path="endereco" cssErrorClass="endereco">Endereço</form:label>
						<form:input type="text" name="endereco" class="form-control" id="endereco"
							path="endereco" />
					</div>

					<button type="submit" class="btn-primary btn">Salvar</button>
				</form:form>
			</div>
		</div>
</body>
</html>
