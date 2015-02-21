<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<nav class="navbar navbar-default navbar-fixed-top" role="navigation">
	<div class="navbar-header">
		<a class="navbar-brand">WebCom</a>
	</div>

	<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
		<ul class="nav navbar-nav">
			<li><a href="#" class="dropdown-toggle" data-toggle="dropdown">Administração
					<strong class="caret"></strong>
			</a>
				<ul class="dropdown-menu">
					<li><a href="" onclick="abrir('C2'); return false;">Condição PG</a></li>
					<li><a href="" onclick="abrir('C4'); return false;">Empresa</a></li>
					<li><a href="" onclick="abrir('C5'); return false;">Setor</a></li>
					<li><a href="" onclick="abrir('C1'); return false;">Usuarios</a></li>
					<li><a href="" onclick="abrir('C7'); return false;">Caixas</a></li>
					<li><a href="" onclick="abrir('C8'); return false;">Contas Bancárias</a></li>
					<li><a href="" onclick="abrir('C6'); return false;">Autorizações</a></li>
				</ul></li>
			<li><a href="#" class="dropdown-toggle" data-toggle="dropdown">Cadastros
					<strong class="caret"></strong>
			</a>
				<ul class="dropdown-menu">
					<li><a href="<c:url value="/pessoa/listar"/>">Clientes</a></li>
					<li><a href="<c:url value="/produto/listar"/>">Produtos</a></li>
					<li><a href="" onclick="abrir('CO4'); return false;">Fornecedores</a></li>
					<li><a href="" onclick="abrir('CO3'); return false;">Marcas</a></li>

				</ul></li>
			<li><a href="#" class="dropdown-toggle" data-toggle="dropdown">Movimentação
					<strong class="caret"></strong>
			</a>
				<ul class="dropdown-menu">
					<li><a href="" onclick="abrir('NFO1'); return false;">Nota Saida</a>
					<li><a href="" onclick="abrir('NF4'); return false;">Nota Entrada</a></li>
				</ul></li>
			<li><a href="#" class="dropdown-toggle" data-toggle="dropdown">Financeiro
					<strong class="caret"></strong>
			</a>
				<ul class="dropdown-menu">
					<li><a href="" onclick="abrir('F1'); return false;">Fechamento Saida</a>
					<li><a href="" onclick="abrir('F2'); return false;">Mov. de Caixa</a></li>
					<li><a href="" onclick="abrir('F3'); return false;">Contas a Receber</a></li>
				</ul></li>
			<li><a href="#" class="dropdown-toggle" data-toggle="dropdown">Relatório
					<strong class="caret"></strong>
			</a>
				<ul class="dropdown-menu">
					<li><a href="" onclick="abrir('RC1'); return false;">Comissão</a></li>
				</ul></li>
			<li><a href="#" class="dropdown-toggle" data-toggle="dropdown">Importação
					<strong class="caret"></strong>
			</a>
				<ul class="dropdown-menu">
					<li><a href="" onclick="abrir('IM1'); return false;">Produtos</a></li>
				</ul></li>


		</ul>

		<ul class="nav navbar-nav" style="float: right;">
			<li><a href="<c:url value="/login.jsp?logout"/>">Logout</a></li>
		</ul>
	</div>

</nav>