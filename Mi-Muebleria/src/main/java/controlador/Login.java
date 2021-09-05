/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import database.DBConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Clase login para ejecutar todos los procesos de consultas con la base de datos
 * @author KARIN MONTERROSO
 */
public class Login {
    /**
     * Variable para almacenar estaticamente el nombre de nuestra tabla
     */
    private static final String USUARIO = "usuario";
    private Connection connection;
    
    /**
     * Metodo para autenticar un usuario
     * @param usuario usuario del sistema
     * @param password contraseña del sistema
     * @return 
     */
    public boolean autenticacionUsuario(String usuario, String password){
        try{
            DBConnector db = new DBConnector();
            this.connection = db.getDBConnection();
            PreparedStatement query = this.connection.prepareStatement(String.format(
                    "SELECT nombre_usuario, password FROM %s WHERE nombre_usuario=? and password=? ", USUARIO));
            query.setString(1, usuario);
            query.setString(2, password);
            ResultSet result = query.executeQuery();
            
            if(result.next()){
                return true;
            }
            
       
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
