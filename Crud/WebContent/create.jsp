<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create</title>
</head>
<body>
	<h1>Create</h1>
	
	<form action="createServlet" method="post">

<p><h1>CREATE CARNIVORO</h1></p>
	<p>
	<label for"idCarnivorous">ID CARNIVOROUS: </label> 
	<input type="text" name="idCarnivorous" id="idCarnivorous" required placeholder="Nombre">
	</p>
	<p>
	<label for"idCarnivorous">NOMBRE: </label> 
	<input type="text" name="Nombre" id="Nombre" required placeholder="Nombre">
	</p>
	<p>
	<label for"idCarnivorous">EDAD: </label> 
	<input type="number" name="Edad" id="Edad" required placeholder="Edad">
	</p>
	<p>
	<label for"idCarnivorous">HABITAT: </label> 
	<input type="text" name="Habitat" id="Habitat" required placeholder="Habitat">
	</p>
	<p>
	<input type="submit" name="Create" id="Create" required value="CREAR">
	</p>
	
</form>
</body>
</html>