/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.sanjose.models;

import java.util.List;

/**
 * Esto es para darle una cordenada de donde queda el Hospital
 * @author Moral
 */
public class Coordenadas {
    
    //Atributos
    
       private double latitud;
    private double longitud;
    
    //Constructor 

    public Coordenadas(double latitud, double longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }
    
    //Getters y Setters

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    
    // Métodos CRUD
    public static Coordenadas buscarCoordenadas(List<Coordenadas> coordenadas, double latitud, double longitud) {
        for (Coordenadas coord : coordenadas) {
            if (coord.getLatitud() == latitud && coord.getLongitud() == longitud) {
                return coord;
            }
        }
        return null;
    }

    public static void agregarCoordenadas(List<Coordenadas> coordenadas, Coordenadas nuevaCoord) {
        coordenadas.add(nuevaCoord);
    }

    public static boolean eliminarCoordenadas(List<Coordenadas> coordenadas, double latitud, double longitud) {
        Coordenadas coord = buscarCoordenadas(coordenadas, latitud, longitud);
        if (coord != null) {
            coordenadas.remove(coord);
            return true;
        }
        return false;
    }

    public static boolean actualizarCoordenadas(List<Coordenadas> coordenadas, double latitud, double longitud, Coordenadas coordActualizada) {
        Coordenadas coord = buscarCoordenadas(coordenadas, latitud, longitud);
        if (coord != null) {
            int index = coordenadas.indexOf(coord);
            coordenadas.set(index, coordActualizada);
            return true;
        }
        return false;
    }
}
