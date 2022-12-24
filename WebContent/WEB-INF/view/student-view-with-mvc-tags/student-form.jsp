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
Gender :<form:select path="gender">
			<form:option value="male" label="male" />
			<form:option value="female" label="female" />
			<form:option value="not answer" label="not answer" />
		</form:select>
		<br>
Country :<form:select path="counrty">
			<form:options items="${student.countryOptions}" />
		</form:select>
		<br>
		<input type="submit" value="Done" />
	</form:form>

</body>
</html>