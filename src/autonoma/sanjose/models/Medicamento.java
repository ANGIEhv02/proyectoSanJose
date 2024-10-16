/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.sanjose.models;

/**
 *
 * @author Moral
 */
public abstract class Medicamento {
    
    //Atributos
    
    protected String nombre;
    protected String laboratorio;
    protected double precio;
    
    //Constructor
    public Medicamento(String nombre, String laboratorio, double precio) {
        this.nombre = nombre;
        this.laboratorio = laboratorio;
        this.precio = precio;
    }
    
    //Getters y Setters 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public abstract String obtenerDetalles();
}
