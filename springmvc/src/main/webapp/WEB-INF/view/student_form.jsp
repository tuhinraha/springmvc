<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>

<html>

<head>
<title>Student Registration Form</title>
</head>

<body>

	<form:form action="processForm" method="POST" modelAttribute="student">
	
	FirstName :: <form:input path="firstName" />
	<form:errors path="firstName"/>
	<br/>
	<br/>
	LastName :: <form:input path="lastName" />
	<form:errors path="lastName"/>
	<br/>
	<br/>
		<input type="submit">

	</form:form>

</body>
</html>