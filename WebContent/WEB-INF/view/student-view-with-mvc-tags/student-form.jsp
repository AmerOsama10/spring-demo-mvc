<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Student form</title>
</head>
<body>

	<form:form action="studentDataV1" modelAttribute="student">
Name : <form:input path="name" />
		<br>
Age :<form:input path="age" />
		<br>
Gender :<form:input path="gender" />
		<br>
Country :<form:select path="counrty">
			<form:option value="Brazil" label="Brazil" />
			<form:option value="Egypt" label="Egypt" />
			<form:option value="Spain" label="Spain" />
			<form:option value="Germany" label="Germany" />
		</form:select>
		<br>
		<input type="submit" value="Done" />
	</form:form>

</body>
</html>