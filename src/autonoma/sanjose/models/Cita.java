/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.sanjose.models;

import java.util.Date;

/**
 * este modulo es para agendar una cita
 * @author Moral
 */
public class Cita {
    
    //Atributos
    
    private Paciente paciente;
    private Date fecha;
    private double valor;
    
    //Constructor
    
    public Cita(Paciente paciente, Date fecha, double valor) {
        this.paciente = paciente;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
