<!-- for getting for each for looping over the collection -->
<%@ taglib prefix="loop" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>student data</title>
</head>
<body>

	<!-- it will call getter methods student.getname ..... -->
	<h3>Student is confirmed</h3>
	<hr>
	Name is : ${student.name}
	<br>
	<br> Age is : ${student.age}
	<br>
	<br> Gender is : ${student.gender}
	<br>
	<br> Country is : ${student.country}
	<br>
	<br> Course is : ${student.course}
	<br>
	<br> Course is :

		<loop:forEach var="temp" items="${student.operatingSystem}">
			${temp} 
		</loop:forEach>


</body>

</html>