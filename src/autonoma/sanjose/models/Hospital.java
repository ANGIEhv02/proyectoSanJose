/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.sanjose.models;

import java.util.ArrayList;

/**
 * es para generar un hospital 
 * @author Moral
 */
public class Hospital {
    
    //Atributos 
    
    private String nombre;
    private String direccion;
    private String telefono;
    private double presupuesto;
    private double metaVentasAnual;
    private int fechaFundacion;
    private Coordenadas localizacion;
    private Gerente gerente;
    private ArrayList<Empleado> empleados;
    private ArrayList<Paciente> pacientes;
    private ArrayList<Cita> citas;
    private Nomina nomina;
    private String estado;
    
    //Constructor
    
     public Hospital(String nombre, String direccion, String telefono, double presupuesto, 
                    double metaVentasAnual, int fechaFundacion, Coordenadas localizacion, 
                    Gerente gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.presupuesto = presupuesto;
        this.metaVentasAnual = metaVentasAnual;
        this.fechaFundacion = fechaFundacion;
        this.localizacion = localizacion;
        this.gerente = gerente;
        this.empleados = new ArrayList<>();
        this.pacientes = new ArrayList<>();
        this.citas = new ArrayList<>();
        this.nomina = new Nomina();
        this.estado = "Activo";
    }
     
    //Getters y Setters 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public double getMetaVentasAnual() {
        return metaVentasAnual;
    }

    public void setMetaVentasAnual(double metaVentasAnual) {
        this.metaVentasAnual = metaVentasAnual;
    }

    public int getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(int fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public Coordenadas getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(Coordenadas localizacion) {
        this.localizacion = localizacion;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public ArrayList<Cita> getCitas() {
        return citas;
    }

    public void setCitas(ArrayList<Cita> citas) {
        this.citas = citas;
    }

    public Nomina getNomina() {
        return nomina;
    }

    public void setNomina(Nomina nomina) {
        this.nomina = nomina;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    /**
     * Método para agregar un empleado al hospital.
     */
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        nomina.agregarEmpleado(empleado);
    }

    /**
     * Método para agregar un paciente al hospital.
     */
    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    /**
     * Método para agregar una cita al hospital.
     */
    public void agregarCita(Cita cita) {
        citas.add(cita);
        presupuesto += cita.getValor(); // Incrementar presupuesto con el valor de la cita
    }

    /**
     * Método para procesar la nómina de empleados.
     */
    public void procesarNomina() {
        double totalNomina = nomina.calcularTotalNomina();
        presupuesto -= totalNomina; // Descontar la nómina del presupuesto

        if (presupuesto < 0) {
            estado = "En quiebra"; // Cambiar estado si el presupuesto es negativo
            System.out.println("¡Alerta! El hospital está en quiebra. No se puede procesar más nómina.");
        } else {
            nomina.mostrarNomina();
        }
    }
     
}
