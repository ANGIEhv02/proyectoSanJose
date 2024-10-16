/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.sanjose.models;

import java.util.ArrayList;
import  autonoma.sanjose.models.*;
import java.util.Date;
import java.util.List;

/**
 * es para generar un hospital 
 * @author Moral
 */
public class Hospital {
    
    //Atributos 
    
    private String nombre;
    private String ubicacion;
    private double presupuesto;
    private Gerente gerente;
    
    //Constructor

    public Hospital(String nombre, String ubicacion, double presupuesto, Gerente gerente) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.presupuesto = presupuesto;
        this.gerente = gerente;
    }
    
    //Gettrs y Settrs

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    
    
     // Métodos CRUD para hospital
    public static Hospital buscarHospital(List<Hospital> hospitales, String nombre) {
        for (Hospital hospital : hospitales) {
            if (hospital.getNombre().equals(nombre)) {
                return hospital;
            }
        }
        return null;
    }

    public static void agregarHospital(List<Hospital> hospitales, Hospital nuevoHospital) {
        hospitales.add(nuevoHospital);
    }

    public static boolean eliminarHospital(List<Hospital> hospitales, String nombre) {
        Hospital hospital = buscarHospital(hospitales, nombre);
        if (hospital != null) {
            hospitales.remove(hospital);
            return true;
        }
        return false;
    }

    public static boolean actualizarHospital(List<Hospital> hospitales, String nombre, Hospital hospitalActualizado) {
        Hospital hospital = buscarHospital(hospitales, nombre);
        if (hospital != null) {
            int index = hospitales.indexOf(hospital);
            hospitales.set(index, hospitalActualizado);
            return true;
        }
        return false;
    }
}
