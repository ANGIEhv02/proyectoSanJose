/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.sanjose.models;

import java.util.Date;
import java.util.List;

/**
 * este modulo es para agendar una cita
 * @author Moral
 */
public class Cita {
    
    //Atributos
    
    private Paciente paciente;
    private EmpleadoSalud medico;
    private String fecha;
    private double valor;
    
    //Constructor
    
   public Cita(Paciente paciente, EmpleadoSalud medico, String fecha, double valor) {
        this.paciente = paciente;
        this.medico = medico;
        this.fecha = fecha;
        this.valor = valor;
    }
    
    //Getters y Setters 

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public EmpleadoSalud getMedico() {
        return medico;
    }

    public void setMedico(EmpleadoSalud medico) {
        this.medico = medico;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    
    // Métodos CRUD
    public static Cita buscarCita(List<Cita> citas, String fecha) {
        for (Cita cita : citas) {
            if (cita.getFecha().equals(fecha)) {
                return cita;
            }
        }
        return null;
    }

    public static void agregarCita(List<Cita> citas, Cita nuevaCita) {
        citas.add(nuevaCita);
    }

    public static boolean eliminarCita(List<Cita> citas, String fecha) {
        Cita cita = buscarCita(citas, fecha);
        if (cita != null) {
            citas.remove(cita);
            return true;
        }
        return false;
    }

    public static boolean actualizarCita(List<Cita> citas, String fecha, Cita citaActualizada) {
        Cita cita = buscarCita(citas, fecha);
        if (cita != null) {
            int index = citas.indexOf(cita);
            citas.set(index, citaActualizada);
            return true;
        }
        return false;
    }
    
}
