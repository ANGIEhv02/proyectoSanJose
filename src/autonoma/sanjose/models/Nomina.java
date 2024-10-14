/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.sanjose.models;
import java.util.ArrayList;

/**
 * Clase que gestiona la nómina del hospital.
 * Contiene una lista de empleados y calcula el total de salarios a pagar.
 *
 * @author Moral
 */
public class Nomina {
    
    //Atributos
    
    private ArrayList<Empleado> empleados;
    
    /**
     * Constructor de la clase Nómina.
     */
    
    public Nomina() {
        this.empleados = new ArrayList<>();
    }

    /**
     * Método para agregar un empleado a la nómina.
     * @param empleado Empleado a agregar.
     */
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    /**
     * Método que calcula el total de salarios a pagar.
     * @return Total de la nómina.
     */
    public double calcularTotalSalarios() {
        double total = 0;
        for (Empleado emp : empleados) {
            total += emp.calcularSalario();  // Uso de polimorfismo
        }
        return total;
    }

    /**
     * Método que genera el reporte de nómina.
     */
    public void generarReporteNomina() {
        System.out.println("---- Reporte de Nómina ----");
        for (Empleado emp : empleados) {
            System.out.println(emp.toString() + " - Salario: " + emp.calcularSalario());
        }
        System.out.println("Total de la nómina: " + calcularTotalSalarios());
    }
}
