<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
     <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
     <link rel="stylesheet"  href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<spring:url value="/resources/css/main.css" var="mainCss" />
<link href="${mainCss}" rel="stylesheet" type="text/css" />    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>
  $( function() {
     $('#datePicker').datepicker({ dateFormat: 'dd-mm-yy' });
  });
  </script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<div class="container">
</div>
<center><h1>Customer Registration</h1></center>
    <p></p>
    <form:form action="save" modelAttribute="reg" >
         
         <table class="table">
        <tr>
            <td>First Name</td>
             <td>Last Name</td>
              <td>DOB:</td>
              </tr>
              <tr>
            <td><form:input path="firstName"/></td>
           <td><form:input path="lastName"/></td>
            <td><form:input path="dob" id="datePicker" /></td>
            </tr>
            
        <tr>
            <td>Address Line1</td>
             <td>Address Line2</td>
             <td>City</td>
             </tr>
             <tr>
            <td><form:input path="addressLine1"/></td>
           
            <td><form:input path="addressLine2"/></td>
            
            <td><form:input path="city"/></td>
            </tr>  
        
        
         <tr>
            <td>State</td>
              <td>Pincode</td>
                 <td>MobileNumber</td>
                 </tr>
                 <tr>
            <td><form:input path="state"/></td>
          
            <td><form:input path="pincode"/></td>
         
            <td><form:input path="mobileNo"/></td>
            </tr>  
        
        
         <tr>
            <td>Email</td>
                     <td>Aadhar</td>
                     <td>Pan</td>
                     </tr>
                     <tr>
            <td><form:input  path="email"/></td>
   
            <td><form:input path="aadhar"/></td>
            
            <td><form:input path="pan"/></td>
            </tr>  
        
         <tr>
            <td>Username</td>
            <td>Password</td>
            <td>Confirm Password</td>
            </tr>
            <tr>
            <td><form:input  path="userName"/></td>  
            
            <td><form:password path="password"/></td>
            
            <td><input type="password"></td>
            </tr> 
            <tr>
            <td>DateOfBirth Proof</td>
            
            <td><form:input type="file" path="dobProof" /></td>
        </tr>
         <tr>
            <td>Address Proof</td>
           <td><form:input type="file" path="addressProof" /></td>
        </tr>
         <tr>
            <td>Aadhar</td>
            
            <td><form:input type="file" path="aadharProof" /></td>
        </tr>
        <tr>
            <td>Pan</td>
            
            <td><form:input type="file" path="panProof" /><p id="p6"></td>
        </tr>
        
        
         <p></p>
             <tr>
             <td><input type="reset"  class="btn btn-warning" value="Reset" /></td>
                 <td><input type="submit"  class="btn btn-primary" value="Submit" /></td>
             
                 
             </tr>
         </table>
    </form:form>


</body>
</html>
