/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.sanjose.models;

/**
 *Clase que representa las coordenadas geográficas del hospital.
 * @author Moral
 */
public class Localizacion {
    
    //Atributos
    
    private double latitud;
    private double longitud;
    
    
    //Constructor
    
    /**
     * clase Localizacion.
     * @param latitud Latitud del hospital.
     * @param longitud Longitud del hospital.
     */
    public Localizacion(double latitud, double longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }
    
    @Override
    public String toString() {
        return "Localización: [" + latitud + ", " + longitud + "]";
    }
}
