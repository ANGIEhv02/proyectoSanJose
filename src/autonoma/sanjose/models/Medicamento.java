/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.sanjose.models;

/**
 * Clase abstracta que representa un medicamento.
 * Las subclases definirán tipos específicos de medicamentos (genéricos y de marca).
 * @author Moral
 */
public abstract class Medicamento {
    
    //Atributos
    
    protected String nombre;
    protected double precio;
    
    //Constructor
    /**
     *  medicamento.
     * @param nombre Nombre del medicamento.
     * @param precio Precio del medicamento.
     */
    public Medicamento(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    /**
     * Método abstracto para calcular el precio del medicamento.
     * Las subclases implementarán este método.
     * @return Precio calculado.
     */
    public abstract double calcularPrecio();

    @Override
    public String toString() {
        return nombre + " - Precio: " + precio;
    }
}
