/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author KARIN MONTERROSO
 */
public class DBConnector {
    /**
     * Variables para instanciar la conexion
     */
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    private static final String URL_MYSQL = "jdbc:mysql://localhost:3306/mi_muebleria";
    private static final String HISTORIAL = "historial";
    private Connection connection = null;

    /**
     * Constructor para iniciar la conexion con la base de datos
     */
    public DBConnector() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(URL_MYSQL, USER, PASSWORD);
        } catch(Exception e){
            e.printStackTrace();
        }
       
    }
    
    /**
     * Metodo que retorna la conexion
     * @return 
     */
    public Connection getDBConnection(){
        return this.connection;
    }
    
}
