<%-- 
    Document   : login
    Created on : 04-sep-2021, 22:28:14
    Author     : KARIN MONTERROSO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <div class="wrapper">
            <form class="Log in" method="POST" action="LoginServlet">
                <p class="title">Inicio de Sesión</p>
                <input type="text" id="username" name="username" placeholder="Nombre de Usuario:" autofocus/>
                <i class="fa fa-user"></i>
                <input type="password" id="password" name="password" placeholder="Contraseña: " />
                <i class="fa fa-key"></i>
                <a href="#">Olvidaste tu contraseña?</a>
                <button type="submit">
                    <i class="spinner"></i>
                    <span class="state">Ingresar</span>
                </button>
            </form>
        </p>
    </div>
    </body>
</html>

