<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>WebCom Gestão Web</title>
<meta name="description" content="">
<meta name="author" content="">

<!-- Le styles -->
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<style type="text/css">
/* Override some defaults */
html,body {
	background-color: #eee;
}

body {
	padding-top: 40px;
}

.container {
	width: 300px;
}

/* The white background content wrapper */
.container>.content {
	background-color: #fff;
	padding: 20px;
	margin: 0 -20px;
	-webkit-border-radius: 10px 10px 10px 10px;
	-moz-border-radius: 10px 10px 10px 10px;
	border-radius: 10px 10px 10px 10px;
	-webkit-box-shadow: 0 1px 2px rgba(0, 0, 0, .15);
	-moz-box-shadow: 0 1px 2px rgba(0, 0, 0, .15);
	box-shadow: 0 1px 2px rgba(0, 0, 0, .15);
}

.login-form {
	margin-left: 65px;
}

legend {
	margin-right: -50px;
	font-weight: bold;
	color: #404040;
}
</style>

</head>
<body>
	<div class="container">
		<div class="content">
			<div class="row">
				<div class="login-form">


					<h4>Bem Vindo WebCom</h4>

					<c:if test="${not empty error}">
						<div class="error">${error}</div>
					</c:if>
					<c:if test="${not empty msg}">
						<div class="msg">${msg}</div>
					</c:if>


					<form name='loginForm'
						action="<c:url value='j_spring_security_check' />" method='POST'>
						<fieldset>
							<div class="clearfix">
								<input type="text" placeholder="Usuario" name="username">
							</div>
							<div class="clearfix">
								<input type="password" placeholder="Senha" name="password">
							</div>
							<button class="btn primary" type="submit">Enviar</button>
						</fieldset>
						<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>