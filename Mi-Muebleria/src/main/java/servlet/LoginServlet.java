/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import controlador.Login;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author KARIN MONTERROSO
 */
@WebServlet(name = "login-servlet", urlPatterns = {"/login/LoginServlet"})
public class LoginServlet extends HttpServlet {

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /**
         * Metodo para analizar si esta loggeado el usuario en el sistema
         */
        try{
            boolean loggeado;
            String usuario = request.getParameter("username");
            String password = request.getParameter("password");

            Login login = new Login();
            
            /**
             * Redireccion al inicio de los usuarios
             */
            if(login.autenticacionUsuario(usuario, password)){
                response.sendRedirect("inicio.jsp");
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        
        
    }

   
}
