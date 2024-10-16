/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.sanjose.models;

import java.util.ArrayList;

/**
 * esto es para crear un paciente
 * @author Moral
 */
public class Paciente {
    
    //Atributos
    
    private String nombre;
    private String numeroDocumento;
    private int edad;
    private String correo;
    private String telefono;
    private String estado; // Saludable o Crítico
    private ArrayList<Enfermedad> enfermedades;
    
    //Constructor
    
    public Paciente(String nombre, String numeroDocumento, int edad, String correo, String telefono) {
        this.nombre = nombre;
        this.numeroDocumento = numeroDocumento;
        this.edad = edad;
        this.correo = correo;
        this.telefono = telefono;
        this.estado = "Saludable"; // Estado inicial
        this.enfermedades = new ArrayList<>();
    }
    
    //Getters y Setters 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList<Enfermedad> getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(ArrayList<Enfermedad> enfermedades) {
        this.enfermedades = enfermedades;
    }
    
    /**
     * Método para agregar una enfermedad al paciente.
     */
    public void agregarEnfermedad(Enfermedad enfermedad) {
        enfermedades.add(enfermedad);
    }

    /**
     * Método para curar una enfermedad.
     */
    public void curarEnfermedad(Enfermedad enfermedad, Medicamento medicamento) {
        if (enfermedades.contains(enfermedad)) {
            enfermedades.remove(enfermedad);
            // Aquí se podría agregar el medicamento a una lista si fuera necesario
            if (enfermedades.isEmpty()) {
                estado = "Saludable"; // Cambiar a Saludable si no tiene enfermedades
            }
        } else {
            throw new IllegalArgumentException("El paciente no tiene esta enfermedad.");
        }
    }
    
}
