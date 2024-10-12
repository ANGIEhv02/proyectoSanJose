/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.sanjose.models;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author herre
 */


public class Paciente {
    private String nombre;
    private String numeroDocumento;
    private int edad;
    private String correo;
    private String telefono;
    private String estado; // "saludable" o "critico"
    private List<Enfermedad> enfermedades = new ArrayList<>();
    private List<Medicina> medicinas = new ArrayList<>();

    public Paciente(String nombre, String numeroDocumento, int edad, String correo, String telefono) {
        this.nombre = nombre;
        this.numeroDocumento = numeroDocumento;
        this.edad = edad;
        this.correo = correo;
        this.telefono = telefono;
        this.estado = "saludable";
    }

    public void añadirEnfermedad(Enfermedad enfermedad) {
        enfermedades.add(enfermedad);
        estado = "critico";
    }

    public void curarEnfermedad(Enfermedad enfermedad, Medicina medicina) {
        if (enfermedades.contains(enfermedad)) {
            enfermedades.remove(enfermedad);
            medicinas.add(medicina);
            if (enfermedades.isEmpty()) {
                estado = "saludable";
            }
        } else {
            System.out.println("Error: El paciente no tiene esta enfermedad.");
        }
    }

    // Otros métodos de gestión de enfermedades y medicinas
}

    
