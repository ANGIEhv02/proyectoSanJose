/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.sanjose.models;

import java.util.ArrayList;
import java.util.List;

/**
 * esto es para crear un paciente
 * @author Moral
 */
public class Paciente {
    
    //Atributos
    
    private String nombre;
    private String documento;
    private int edad;
    private String enfermedad;

    //Constructor
    
    public Paciente(String nombre, String documento, int edad, String enfermedad) {
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.enfermedad = enfermedad;
    }
    
    //Getters y Setters 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    // Métodos CRUD
    public static Paciente buscarPaciente(List<Paciente> pacientes, String documento) {
        for (Paciente paciente : pacientes) {
            if (paciente.getDocumento().equals(documento)) {
                return paciente;
            }
        }
        return null;
    }

    public static void agregarPaciente(List<Paciente> pacientes, Paciente nuevoPaciente) {
        pacientes.add(nuevoPaciente);
    }

    public static boolean eliminarPaciente(List<Paciente> pacientes, String documento) {
        Paciente paciente = buscarPaciente(pacientes, documento);
        if (paciente != null) {
            pacientes.remove(paciente);
            return true;
        }
        return false;
    }

    public static boolean actualizarPaciente(List<Paciente> pacientes, String documento, Paciente pacienteActualizado) {
        Paciente paciente = buscarPaciente(pacientes, documento);
        if (paciente != null) {
            int index = pacientes.indexOf(paciente);
            pacientes.set(index, pacienteActualizado);
            return true;
        }
        return false;
    }
}
