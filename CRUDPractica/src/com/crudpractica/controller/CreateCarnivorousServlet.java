package com.crudpractica.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crudpractica.model.Carnivorous;


@WebServlet("/CreateCarnivorousServlet")
public class CreateCarnivorousServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html charset='utf-8'");
		PrintWriter salida = response.getWriter();
		
		//Paso 1. Declaramos variables
		String user="root";
		String pass="root";
		String urlServidor="jdbc:mysql://localhost:3306/animalitus?useSSL=false&serverTimezone=UTC";
		String sentenciaSQL;
		int nRegistros=0;
		
		//Paso 2. Declaramos objetos
		Connection conn = null;
		Statement stmnt = null;
		
		try {
			//Paso 3. Instanciamos el driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Paso 4. Abrimos la conexión
			conn =  DriverManager.getConnection(urlServidor, user, pass);
			
			//Paso 5. Configuramos el statement
			stmnt = conn.createStatement();
			
			//Paso 6. Ejecutamos la instrucción en la base de datos
			Carnivorous miCarnivoro = new Carnivorous();
			miCarnivoro.setIdCarnivorous(Integer.parseInt(request.getParameter("idCarnivorous")));
			miCarnivoro.setNameCarnivorous(request.getParameter("nameCarnivorous"));
			miCarnivoro.setEdadCarnivorous(Integer.parseInt(request.getParameter("edadCarnivorous")));
			miCarnivoro.setHabitatCarnivorous(request.getParameter("habitatCarnivorous"));
			
			sentenciaSQL = "INSERT INTO carnivorous values(null,'"+miCarnivoro.getNameCarnivorous()+"',"+miCarnivoro.getEdadCarnivorous()+" ,'"+miCarnivoro.getHabitatCarnivorous()+"' )";
			nRegistros = stmnt.executeUpdate(sentenciaSQL);
			//Paso 7. Observamos resultado
			if(nRegistros>0)
			{
				salida.append("Registros añadido con éxito!!");
			}
			else
			{
				salida.append("Error al crear registro");
			}
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			//Paso 8. Cerramos los objetos statement y connection
			try {
				stmnt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		
		salida.print("Hola Mundo");
		salida.close();
	}

}
