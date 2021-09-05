/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author KARIN MONTERROSO
 */
public class Usuario {
    /**
     * Variables para almacenar los datos de la tabla Usuario
     */
    private String nombre;
    private String password;
    private int tipo;

    /**
     * Constructor para instanciar un objeto de tipo usuario
     * @param nombre almacena el nombre del usuario
     * @param password  almacena un password de un usuario
     * @param tipo almacena el tipo de usuario
     */
    public Usuario(String nombre, String password, int tipo) {
        this.nombre = nombre;
        this.password = password;
        this.tipo = tipo;
    }

    /**
     * Getter para obtener el nombre de usuario
     * @return 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter para setear un nombre 
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter para obtener un password de un usuario
     * @return 
     */
    public String getPassword() {
        return password;
    }

    /**
     * Setter para setear un password de un usuario
     * @param password 
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Getter para obtener el tipo de usuario
     * @return 
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * Setter para setear un tipo al usuario
     * @param tipo 
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
}
