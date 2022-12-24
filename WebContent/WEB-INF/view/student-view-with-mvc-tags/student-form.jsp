<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Student form</title>
</head>
<body>
	<!-- 3- the attribute model is binded to the form -->
	<form:form action="studentDataV1" modelAttribute="student">

		<!-- 4- set attributes -->
Name : <form:input path="name" />
		<br>

		<!-- a- form of an input  -->
Age :<form:input path="age" />
		<br>

		<!-- b- form of a a tag list  -->
Gender :<form:select path="gender">
			<form:option value="male" label="male" />
			<form:option value="female" label="female" />
			<form:option value="not answer" label="not answer" />
		</form:select>
		<br>

		<!-- c- form of a java list  -->
Country :<form:select path="country" items="${student.countryOptions}" />
		<br>


		<!-- d- form of form radio button tag  -->
Course :<form:radiobutton path="course" label="Java" value="Java" />
		<form:radiobutton path="course" label="C++" value="C++" />
		<form:radiobutton path="course" label="Database" value="Database" />
		<form:radiobutton path="course" label="SQL" value="SQL" />
		<br>

		<!-- e- form of form radio button tag  -->
Operating Systems : 
		<form:checkbox path="operatingSystem" label="Windows" value="Windows" />
		<form:checkbox path="operatingSystem" label="Mac" value="Mac" />
		<form:checkbox path="operatingSystem" label="Linux" value="Linix" />
		<br>

		<input type="submit" value="Done" />
	</form:form>
</body>
</html>