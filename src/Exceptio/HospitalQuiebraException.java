/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exceptio;

/**
 * Excepción personalizada que se lanza cuando el hospital está en quiebra.
 * @author Moral
 */
public class HospitalQuiebraException extends Exception{
      /**
     * Constructor de la excepción personalizada.
     * @param mensaje Mensaje de error personalizado.
     */
    public HospitalQuiebraException(String mensaje) {
        super(mensaje);
    }
}
