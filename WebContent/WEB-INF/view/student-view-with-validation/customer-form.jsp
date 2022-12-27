<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Customer Registration Form</title>

<style>
.error {color: red}
</style>
</head>
<body>
	<form:form action="processValidation" modelAttribute="customer">

First Name : <form:input path="firstName" />
		<br>

Last Name :<form:input path="lastName" />
		<form:errors path="lastName" cssClass="error" />
		<br>
		
Free Passes :<form:input path="freePasses" />
		<form:errors path="freePasses" cssClass="error" />
		<br>
		
Postal Code :<form:input path="postalCode" />
		<form:errors path="postalCode" cssClass="error" />
		<br>

		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>