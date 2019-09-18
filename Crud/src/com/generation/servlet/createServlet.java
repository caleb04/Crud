package com.generation.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.generation.model.Carnivorous;
import com.mysql.jdbc.Statement;

/**
 * Servlet implementation class createServlet
 */
@WebServlet("/createServlet")
public class createServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public createServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String url = "jdbc:mysql://127.0.0.1:3306/animales";
		String user = "root";
		String password = "";
		
		int nRegistros=0;
		
		//paso 2. Declarar objetos
		Connection conn= null;
		Statement stmnt = null;
		
		try {
			//Paso 3. Instanciar Driver
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			
			//Paso 4. Abrimos la conexion
			conn = (Connection) DriverManager.getConnection(url, user, password);
			System.out.println("Conexion exitosa");
			
			//Paso 5. Configurar Statement
			stmnt = (Statement) conn.createStatement();
			
			//Paso 6. Ejecutamos la instruccion para sql
			Carnivorous miCarnivoro= new Carnivorous();
			
			miCarnivoro.setIdCarnivorous(Integer.parseInt(request.getParameter("idCarnivorous")));
			
			miCarnivoro.setNameCrnivorous(request.getParameter("nameCarnivorous"));
			
			miCarnivoro.setEdadCarnivorous(Integer.parseInt(request.getParameter("edadCarnivorous")));
			
			miCarnivoro.setHabitatCarnivorous(request.getParameter("habitatCrnivorous"));
			
			String sentenciaSQL= "INSERT INTO carnivoros values ("+miCarnivoro.getIdCarnivorous()+",'"+miCarnivoro.getNameCrnivorous()+"',"
			+miCarnivoro.getEdadCarnivorous()+",'"+miCarnivoro.getHabitatCarnivorous()+"')";
			
			nRegistros = stmnt.executeUpdate(sentenciaSQL);
			
			//ResultSet rs = stmnt.executeQuery("SELECT * FROM CARNIVOROS");
			
			//Paso 7. Observar el resultado
			if(nRegistros<0) {
				salida.append("Registros añadidos con exito");
			}
			
			else
			{
				salida.append("Error al crear registro");
			}
			
			
			//Cerrar conexion
			stmnt.close();
			conn.close();
			
		}
		catch(Exception e){
			System.out.println("Exception: "+e);
		}
	}

}

