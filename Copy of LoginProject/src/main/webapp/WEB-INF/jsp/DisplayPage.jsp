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
<td><a href="edit?id=${ls.id}">Edit</a></td>
<td><a href="delete?id=${ls.id}">Delete</a></td>
</tr>
</c:forEach>
</table>

</body>
</html>