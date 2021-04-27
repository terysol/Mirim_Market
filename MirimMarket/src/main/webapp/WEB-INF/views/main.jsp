<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%@ include page="/menuBar.jsp" %> --%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>메인</title>
		<style type="text/css">
			.box{
				width:200px;
				height:200px;
				overflow:hidden;
			}
			.profile{
				width:100%;
				height:100%;
				object-fit:cover;
			}
			.img{  /*멤버들 이미지*/
		        float:left;
		        width:20%; 
		        margin:15px; align-items: center;
		     }
		</style>
	</head>
	<body>
		
	      <c:forEach items="${productlist }" var="product">
	      	<a href="BuyProduct.jsp?seq=${product.seq }">	
	      	[${product.category }] &nbsp; ${product.title } &nbsp; ${product.price }<br>
	      	</a>  
	      </c:forEach>
	</body>
</html>