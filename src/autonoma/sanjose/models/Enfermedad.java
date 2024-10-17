/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.sanjose.models;

import java.util.List;

/**
 * esto es para crear una emfermedad 
 * @author Moral
 */
public class Enfermedad {
    
    //Atributos
    
    private String nombre;
    private String descripcion;
    
    //Constructor
    
    public Enfermedad(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    //Getters y Setters 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    // Métodos CRUD
    public static Enfermedad buscarEnfermedad(List<Enfermedad> enfermedades, String nombre) {
        for (Enfermedad enfermedad : enfermedades) {
            if (enfermedad.getNombre().equals(nombre)) {
                return enfermedad;
            }
        }
        return null;
    }

    public static void agregarEnfermedad(List<Enfermedad> enfermedades, Enfermedad nuevaEnfermedad) {
        enfermedades.add(nuevaEnfermedad);
    }

    public static boolean eliminarEnfermedad(List<Enfermedad> enfermedades, String nombre) {
        Enfermedad enfermedad = buscarEnfermedad(enfermedades, nombre);
        if (enfermedad != null) {
            enfermedades.remove(enfermedad);
            return true;
        }
        return false;
    }

    public static boolean actualizarEnfermedad(List<Enfermedad> enfermedades, String nombre, Enfermedad enfermedadActualizada) {
        Enfermedad enfermedad = buscarEnfermedad(enfermedades, nombre);
        if (enfermedad != null) {
            int index = enfermedades.indexOf(enfermedad);
            enfermedades.set(index, enfermedadActualizada);
            return true;
        }
        return false;
    }
    
}
