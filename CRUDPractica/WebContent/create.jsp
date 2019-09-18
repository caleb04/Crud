<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Create Carnivorous</h2>
	<form action="CreateCarnivorousServlet" method="post">
		<p>
			<label for="idCarnivorous">Id Carnivorous:</label>
			<input type="text" id="idCarnivorous" name="idCarnivorous">
		</p>
		<p>
			<label for="nameCarnivorous">Name Carnivorous:</label>
			<input type="text" id="nameCarnivorous" name="nameCarnivorous">
		</p>
		<p>
			<label for="edadCarnivorous">Edad Carnivorous:</label>
			<input type="text" id="edadCarnivorous" name="edadCarnivorous">
		</p>
		<p>
			<label for="habitatCarnivorous">Habitat Carnivorous:</label>
			<input type="text" id="habitatCarnivorous" name="habitatCarnivorous">
		</p>
		<p>
			<input type="submit" value="Create Carnivorous">
		</p>
	</form>
</body>
</html>