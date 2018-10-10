<%-- 
    Document   : index
    Created on : 9/10/2018, 10:17:39 PM
    Author     : osnap
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <form action="ValidarServlet" method="post"> 
	
                    <h1> LLENAR CORRECTAMENTE LOS SIGUIENTES CAMPOS: </h1>
		
		Nombre: <br>
                <input type = "text" placeholder = "Escribe tu nombre" name = "txtNombre"> <br>
  
		Contraseña: <br>
		<input type = "password" placeholder = "Escribe tu contraseña" name = "txtPass"> <br>
                
		<input type = "submit" onclick = "alert ('DATOS ENVIADOS')" value = "Enviar"> 
		<input type = "reset" value = "Cancelar">
		</form> 
    </body>
</html>
