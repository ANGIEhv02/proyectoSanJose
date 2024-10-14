/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exceptio;

/**
 * Excepción personalizada que se lanza cuando no hay suficiente inventario de medicamentos.
 * @author Moral
 */
public class InventarioInsuficienteException extends Exception{
    /**
     * Constructor de la excepción personalizada.
     * @param mensaje Mensaje de error personalizado.
     */
    public InventarioInsuficienteException(String mensaje) {
        super(mensaje);
    }
}
