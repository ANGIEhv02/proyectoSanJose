/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.sanjose.models;

import java.util.List;

/**
 *
 * @author Moral
 */
public class EmpleadoOperativo extends Empleado {
    
    //Atributos
    
     private String area;
     
    //Constructor 

    public EmpleadoOperativo(String nombre, String documento, int edad, double salarioBase, String area) {
        super(nombre, documento, edad, salarioBase);
        this.area = area;
    }
    
    //Getters y Setters

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

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

    @Override
    public double calcularSalario() {
        return salarioBase + (salarioBase * 0.20);
    }
    
    // Métodos CRUD
    public static EmpleadoOperativo buscarEmpleadoOperativo(List<EmpleadoOperativo> empleados, String documento) {
        for (EmpleadoOperativo empleado : empleados) {
            if (empleado.getDocumento().equals(documento)) {
                return empleado;
            }
        }
        return null;
    }

    public static void agregarEmpleadoOperativo(List<EmpleadoOperativo> empleados, EmpleadoOperativo nuevoEmpleado) {
        empleados.add(nuevoEmpleado);
    }

    public static boolean eliminarEmpleadoOperativo(List<EmpleadoOperativo> empleados, String documento) {
        EmpleadoOperativo empleado = buscarEmpleadoOperativo(empleados, documento);
        if (empleado != null) {
            empleados.remove(empleado);
            return true;
        }
        return false;
    }

    public static boolean actualizarEmpleadoOperativo(List<EmpleadoOperativo> empleados, String documento, EmpleadoOperativo empleadoActualizado) {
        EmpleadoOperativo empleado = buscarEmpleadoOperativo(empleados, documento);
        if (empleado != null) {
            int index = empleados.indexOf(empleado);
            empleados.set(index, empleadoActualizado);
            return true;
        }
        return false;
    }
}
