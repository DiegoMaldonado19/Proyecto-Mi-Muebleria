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
public class Mueble {
    /**
     * Variables para instanciar un objeto de tipo mueble y recibir los datos de la tabla
     */
    private String nombre;
    private double precioVenta;

    /**
     * Constructor para instanciar un objeto de tipo mueble
     * @param nombre  nombre del mueble
     * @param precioVenta precio de venta que tiene por defecto
     */
    public Mueble(String nombre, double precioVenta) {
        this.nombre = nombre;
        this.precioVenta = precioVenta;
    }

    /**
     * Getter para obtener el nombre del mueble
     * @return 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter para setear el nombre del mueble
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter para obtener el precio de venta de un mueble
     * @return 
     */
    public double getPrecioVenta() {
        return precioVenta;
    }

    /**
     * Setter para setear un precio de venta
     * @param precioVenta 
     */
    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    
    
}
