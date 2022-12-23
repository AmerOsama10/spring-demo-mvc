<html>
<head>
<title>output form</title>
</head>
<body>

Hello world this is spring!!
<br><br>
<!-- to read the request parameter use param. -->
Student name : ${param.studentName}
<br>
Student password : ${param.studentPassword}
<br>
<!-- to read the java attribute use it directly -->
Student name : ${studentName}
<br>
Student password : ${studentPassword}
<br>
Student length : ${len}

</html>