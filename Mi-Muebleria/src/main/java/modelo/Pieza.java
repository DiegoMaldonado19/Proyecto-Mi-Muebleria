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
public class Pieza {
    /**
     * Variables para almacenar los datos de una pieza
     */
    private int id;
    private String nombre;
    private double costo;

    /**
     * Constructor para instanciar una pieza
     * @param id almacena el id de una pieza
     * @param nombre almacena el nombre de la pieza
     * @param costo almacena el costo de la pieza
     */
    public Pieza(int id, String nombre, double costo) {
        this.id = id;
        this.nombre = nombre;
        this.costo = costo;
    }

    /**
     * Getter para obtener el id de una pieza
     * @return 
     */
    public int getId() {
        return id;
    }

    /**
     * Setter para setear el id de una pieza
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter par obtener el nombre de una pieza
     * @return 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter para setear el nombre de una pieza
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter para obtener el costo de una pieza
     * @return 
     */
    public double getCosto() {
        return costo;
    }

    /**
     * Setter para setear el costo de una pieza
     * @param costo 
     */
    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    
}
