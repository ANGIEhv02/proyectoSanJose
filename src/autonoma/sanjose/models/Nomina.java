/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.sanjose.models;

import java.util.ArrayList;
import java.util.List;

/**
 * esto es para ver la nomina de el hospital
 * @author Moral
 */
public class Nomina {
    
    //Atributos
    
    private List<Empleado> empleados;
    
    //Constructor

  public Nomina(List<Empleado> empleados) {
        this.empleados = empleados;
    }
    
    //Getters y Setters 

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

  public double calcularTotalSalarios() {
        double total = 0;
        for (Empleado empleado : empleados) {
            total += empleado.calcularSalario();
        }
        return total;
    }

    // Métodos CRUD para la nómina
    public static Empleado buscarEmpleado(List<Empleado> empleados, String documento) {
        for (Empleado empleado : empleados) {
            if (empleado.getDocumento().equals(documento)) {
                return empleado;
            }
        }
        return null;
    }

    public static void agregarEmpleado(List<Empleado> empleados, Empleado nuevoEmpleado) {
        empleados.add(nuevoEmpleado);
    }

    public static boolean eliminarEmpleado(List<Empleado> empleados, String documento) {
        Empleado empleado = buscarEmpleado(empleados, documento);
        if (empleado != null) {
            empleados.remove(empleado);
            return true;
        }
        return false;
    }

    public static boolean actualizarEmpleado(List<Empleado> empleados, String documento, Empleado empleadoActualizado) {
        Empleado empleado = buscarEmpleado(empleados, documento);
        if (empleado != null) {
            int index = empleados.indexOf(empleado);
            empleados.set(index, empleadoActualizado);
            return true;
        }
        return false;
    }
    
}
