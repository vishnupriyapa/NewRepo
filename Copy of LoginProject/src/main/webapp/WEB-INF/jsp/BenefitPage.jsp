<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<c:if test="${str=='benefit'}">
<tr>
<td><a href="TransferWithinBank">Transfer within bank</a></td>
<td><a href="TransferOutsideBank">Transfer Outside Bank</a></td>
</tr>
</c:if>
<c:if test="${str=='transfer'}">
<tr>
<td><a href="WithinBankTransaction">Within Bank Transaction</a></td>
<td><a href="OutsideBankTransaction">Outside Bank Transaction</a></td>
</tr>
</c:if>
</table>
</body>
</html>