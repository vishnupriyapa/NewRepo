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
<form:form action="TransferOutside" modelAttribute="ben">
<table>
<tr>
<td>name</td>
<td><form:input path="name"></form:input></td>
</tr>
<tr>
<td>ifsc</td>
<td><form:input path="ifsc"></form:input></td>
</tr>
<tr>
<td>accnum</td>
<td><form:input path="accnum"></form:input></td>
</tr>
<tr>
<td>reEnteraccnum</td>
<td><form:input path="reEnteraccnum"></form:input></td>
</tr>
<tr>
<td>email</td>
<td><form:input path="email"></form:input></td>
</tr>
<tr>
<td>remarks</td>
<td><form:input path="remarks"></form:input></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="Submit"></td>
</tr>
</table>
</form:form>
</body>
</html>