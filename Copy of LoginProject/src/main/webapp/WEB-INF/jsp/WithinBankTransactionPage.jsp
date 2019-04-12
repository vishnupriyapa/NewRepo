<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<title>Insert title here</title>
<script type="text/javascript">
  $(document).ready(function(){
    $("#test").hide();
                                $("#isSelect").on('change', function() {
                                                
                                                var value = $("#isSelect").val();
                                                alert(value);
                                                var res = value.split(",");
                                                $("#accnum").val(res[0]);
                                                $("#ifsc").val(res[1]);
                                                $("#test").show();

                                });
                                });
</script>
</head>
<body>
<form:form action="saveTranWithin" modelAttribute="tran">
<table>
<tr>
<td>accountNo</td>
<td><form:input path="accountNo" /></td>
</tr>
<tr>
<td>Beneficiary name</td>
<td><form:select path="benificiaryName" id="isSelect">
 <c:forEach var="beni" items="${reg.benificiary}">
<c:if test="${beni.registration.id==reg.id }">
<c:if test="${beni.ifsc=='HDFC6666IFSC'}">
<form:option value="${beni.accnum },${beni.ifsc }" label="${beni.name }"></form:option>
</c:if>
</c:if>
</c:forEach> 
</form:select></td>
</tr>
<tr id="test">
<td><input type="text" id="accnum" value=""></td>
<td><input type="text" id="ifsc" value=""></td>
</tr>
<tr>
<td>transferDescription</td>
<td><form:input path="transferDescription" /></td>
</tr>
<tr>
<td>transferAmount</td>
<td><form:input path="transferAmount" /></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="submit"></td>
</tr>
</table>
</form:form>
</body>
</html>