/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.sanjose.models;

import java.util.List;

/**
 * esta clase es para generar un empleado
 * @author Moral
 */
public abstract class Empleado {
    
    //Atributos 
    
    protected String nombre;
    protected String documento;
    protected int edad;
    protected double salarioBase;

    
    //Constructor
    
    public Empleado(String nombre, String documento, int edad, double salarioBase) {
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.salarioBase = salarioBase;
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

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    // Métodos CRUD genéricos para empleados
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
