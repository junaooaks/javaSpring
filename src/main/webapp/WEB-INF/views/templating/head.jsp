<%@ page language="java" contentType="text/html; UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<meta name="_csrf" content="${_csrf.token}" />
<!-- default header name is X-CSRF-TOKEN -->
<meta name="_csrf_header" content="${_csrf.headerName}" />

<link href="<c:url value="/resources/css/bootstrap.min.css"/>"
	rel="stylesheet">
<link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet">

<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
    <script src="<c:url value="/resources/js/html5shiv.js"/>"></script>
  <![endif]-->

<!-- Fav and touch icons -->

<link rel="shortcut icon"
	href="<c:url value="/resources/img/favicon.png"/>">

<script type="text/javascript"
	src="<c:url value="/resources/js/jquery.min.js"/>"></script>
<script type="text/javascript"
	src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
<script type="text/javascript"
	src="<c:url value="/resources/js/scripts.js"/>"></script>
