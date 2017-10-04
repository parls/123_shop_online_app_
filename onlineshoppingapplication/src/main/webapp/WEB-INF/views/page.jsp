<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
	<spring:url var="css" value="/resources/css"/>
	<spring:url var="images" value="/resources/images"/>
	<spring:url var="js" value="/resources/js"/>
	<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PnP - ${title}</title>
</head>
<body>
<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>PnP - ${title}</title>
    <script>window.menu='${title}';</script>
    <!-- Bootstrap core CSS -->
    <link href="${css}/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${css}/myapp.css" rel="stylesheet">

  </head>

  <body>

    <!-- Navigation -->
    <%@include file="./shared/navbar.jsp" %>
     <!--Load only when user clicks Home -->
     <c:if test="${userClickHome == true}"> 
    <%@include file="home.jsp" %>  
     </c:if>
     <!--Load only when user clicks About -->
     <c:if test="${userClickAbout == true}"> 
    <%@include file="about.jsp" %>  
     </c:if>
     <!--Load only when user clicks Contact -->
     <c:if test="${userClickContact == true}"> 
    <%@include file="contact.jsp" %>  
     </c:if>
     <c:if test="${userClickShop == true}"> 
    <%@include file="shop.jsp" %>  
     </c:if>
    <!-- Footer -->
     <%@include file="./shared/footer.jsp" %>
     
    <!-- Bootstrap core JavaScript -->
    <script src="${js}/jquery.js"></script>
    <script src="${js}/popper.min.js"></script> 
    <script src="${js}/bootstrap.min.js"></script>
    <!-- Self coded javascript -->
    <script src="${js}/myapp.js"></script>

  </body>

</html>
