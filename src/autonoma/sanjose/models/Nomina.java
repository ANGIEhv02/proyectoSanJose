/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.sanjose.models;

import java.util.ArrayList;

/**
 * esto es para ver la nomina de el hospital
 * @author Moral
 */
public class Nomina {
    
    //Atributos
    
    private ArrayList<Empleado> empleados;
    private double totalNomina;
    
    //Constructor

    public Nomina() {
        this.empleados = new ArrayList<>();
        this.totalNomina = 0.0;
    }
    
    //Getters y Setters 

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public double getTotalNomina() {
        return totalNomina;
    }

    public void setTotalNomina(double totalNomina) {
        this.totalNomina = totalNomina;
    }
    
    /**
     * Método para agregar un empleado a la nómina.
     */
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        totalNomina += empleado.calcularSalario();
    }

    /**
     * Método para calcular el total de la nómina.
     */
    public double calcularTotalNomina() {
        return totalNomina;
    }

    /**
     * Método para mostrar la nómina de los empleados.
     */
    public void mostrarNomina() {
        for (Empleado empleado : empleados) {
            System.out.println("Empleado: " + empleado.getNombre() + " - Salario: " + empleado.calcularSalario());
        }
        System.out.println("Total Nómina: " + calcularTotalNomina());
    }
    
}
