<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<spring:url value="/resources/css/main.css" var="mainCss" />
<link href="${mainCss}" rel="stylesheet" type="text/css" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<th>firstName</th>
<th>lastName</th>
<th>dob</th>
<th>addressLine1</th>
<th>addressLine2</th>
<th>city</th>
<th>state</th>
<th>pincode</th>
<th>mobileNo</th>
<th>email</th>
<th>aadhar</th>
<th>pan</th>
<th>userName</th>
<th>password</th>
<th>dobProof</th>
<th>addressProof</th>
</tr>
<c:forEach var="ls" items="${ls}">

<c:if test="${ls.id==r.id}">
<form:form action="update" modelAttribute="reg">
<tr>
<td><form:input path="firstName" value="${r.firstName}"></form:input></td>
<td><form:input path="lastName" value="${r.lastName}"></form:input></td>
<td><form:input path="dob" value="${r.dob}"></form:input></td>
<td><form:input path="addressLine1" value="${r.addressLine1}"></form:input></td>
<td><form:input path="addressLine2" value="${r.addressLine2}"></form:input></td>
<td><form:input path="city" value="${r.city}"></form:input></td>
<td><form:input path="state" value="${r.state}"></form:input></td>
<td><form:input path="pincode" value="${r.pincode}"></form:input></td>
<td><form:input path="mobileNo" value="${r.mobileNo}"></form:input></td>
<td><form:input path="email" value="${r.email}"></form:input></td>
<td><form:input path="aadhar" value="${r.aadhar}"></form:input></td>
<td><form:input path="pan" value="${r.pan}"></form:input></td>
<td><form:input path="userName" value="${r.userName}"></form:input></td>
<td><form:input path="password" value="${r.password}"></form:input></td>
<td><form:input path="dobProof" value="${r.dobProof}"></form:input></td>
<td><form:input path="addressProof" value="${r.addressProof}"></form:input></td>
<td><a href="update?id=${ls.id}"></a></td>
<td><a href="delete?id=${ls.id}"></a></td>
</tr>
</form:form>
</c:if>

<c:if test="${ls.id!=r.id}">
<tr>
<td>${ls.firstName}</td>
<td>${ls.lastName}</td>
<td>${ls.dob}</td>
<td>${ls.addressLine1}</td>
<td>${ls.addressLine2}</td>
<td>${ls.city}</td>
<td>${ls.state}</td>
<td>${ls.pincode}</td>
<td>${ls.mobileNo}</td>
<td>${ls.email}</td>
<td>${ls.aadhar}</td>
<td>${ls.pan}</td>
<td>${ls.userName}</td>
<td>${ls.password}</td>
<td>${ls.dobProof}</td>
<td>${ls.addressProof}</td>
<td><a href="edit?id=${ls.id}"></a></td>
<td><a href="delete?id=${ls.id}"></a></td>
</tr>
</c:if> 

</c:forEach>
</table>
</body>
</html>