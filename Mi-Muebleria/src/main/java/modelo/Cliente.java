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
public class Cliente {
    /**
     * Variables que crean el modelo cliente, dentro del cual almacenaremos los datos de la tabla cliente
     */
    private int nit;
    private String nombre;
    private String direccion;
    private String municipio;
    private String departamento;

    /**
     * Constructor para instanciar un objeto de tipo cliente
     * @param nit almacena el nit del cliente
     * @param nombre almacena el nombre del cliente
     * @param direccion almacena la direccion del cliente
     * @param municipio almacena el municipio del cliente
     * @param departamento almacena el departamento del cliente
     */
    public Cliente(int nit, String nombre, String direccion, String municipio, String departamento) {
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.municipio = municipio;
        this.departamento = departamento;
    }

    /**
     * Constructor sin los datos de municipio, ni departamento
     * @param nit  almacena el nit del cliente
     * @param nombre    almacena el nombre del cliente
     * @param direccion     almacena la direccion del cliente
     */
    public Cliente(int nit, String nombre, String direccion) {
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
    }

        
    /**
     * Getter para obtener el nit
     * @return 
     */
    public int getNit() {
        return nit;
    }

    /**
     * Setter para setear el nit
     * @param nit 
     */
    public void setNit(int nit) {
        this.nit = nit;
    }

    /**
     * Getter para obtener el nombre del cliente
     * @return 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter para setear el nombre del cliente
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter para obtener la direccion del cliente
     * @return 
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Setter para setear la direccion del cliente
     * @param direccion 
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Getter para obtener el municipio del cliente
     * @return 
     */
    public String getMunicipio() {
        return municipio;
    }

    /**
     * Setter para setear el municipio del cliente
     * @param municipio 
     */
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    /**
     * Getter para obtener el departamento del cliente
     * @return 
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * Setter para setear el departamento del cliente
     * @param departamento 
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
}
