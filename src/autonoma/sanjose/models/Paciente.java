/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.sanjose.models;
import java.util.ArrayList;
/**
 *
 * @author herre
 */


public class Paciente {
    
    //Atributos
    
    private String nombre;
    private String documentoIdentidad;
    private int edad;
    private ArrayList<String> enfermedades;  // Lista de enfermedades del paciente
    private ArrayList<Medicamento> medicamentos;  // Medicamentos que el paciente está tomando

    /**
     * Constructor del paciente.
     * @param nombre Nombre del paciente.
     * @param documentoIdentidad Documento de identidad del paciente.
     * @param edad Edad del paciente.
     */
    public Paciente(String nombre, String documentoIdentidad, int edad) {
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
        this.edad = edad;
        this.enfermedades = new ArrayList<>();
        this.medicamentos = new ArrayList<>();
    }
    
    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<String> getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(ArrayList<String> enfermedades) {
        this.enfermedades = enfermedades;
    }

    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }
    

    /**
     * Método para agregar una enfermedad al paciente.
     * @param enfermedad Enfermedad a agregar.
     */
    public void agregarEnfermedad(String enfermedad) {
        enfermedades.add(enfermedad);
    }

    /**
     * Método para prescribir un medicamento al paciente.
     * @param medicamento Medicamento a ser prescrito.
     */
    public void prescribirMedicamento(Medicamento medicamento) {
        medicamentos.add(medicamento);
    }

    @Override
    public String toString() {
        return "Paciente: " + nombre + " (" + documentoIdentidad + "), Edad: " + edad;
    }
}

    
