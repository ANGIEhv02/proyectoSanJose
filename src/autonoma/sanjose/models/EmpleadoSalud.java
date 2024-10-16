/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.sanjose.models;

import java.util.List;

/**
 * esta clase es para crear un empleado salud
 * @author Moral
 */
public class EmpleadoSalud extends Empleado {
    
    // Atributos
    
    private String especialidad;
    private int horasTrabajadas;
    
    //Constructor

    public EmpleadoSalud(String nombre, String documento, int edad, double salarioBase, String especialidad, int horasTrabajadas) {
        super(nombre, documento, edad, salarioBase);
        this.especialidad = especialidad;
        this.horasTrabajadas = horasTrabajadas;
    }
    
    // Getters y Setters

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
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
        return salarioBase + (salarioBase * 0.012 * horasTrabajadas);
    }
    
    
    // Métodos CRUD
    public static EmpleadoSalud buscarEmpleadoSalud(List<EmpleadoSalud> empleados, String documento) {
        for (EmpleadoSalud empleado : empleados) {
            if (empleado.getDocumento().equals(documento)) {
                return empleado;
            }
        }
        return null;
    }

    public static void agregarEmpleadoSalud(List<EmpleadoSalud> empleados, EmpleadoSalud nuevoEmpleado) {
        empleados.add(nuevoEmpleado);
    }

    public static boolean eliminarEmpleadoSalud(List<EmpleadoSalud> empleados, String documento) {
        EmpleadoSalud empleado = buscarEmpleadoSalud(empleados, documento);
        if (empleado != null) {
            empleados.remove(empleado);
            return true;
        }
        return false;
    }

    public static boolean actualizarEmpleadoSalud(List<EmpleadoSalud> empleados, String documento, EmpleadoSalud empleadoActualizado) {
        EmpleadoSalud empleado = buscarEmpleadoSalud(empleados, documento);
        if (empleado != null) {
            int index = empleados.indexOf(empleado);
            empleados.set(index, empleadoActualizado);
            return true;
        }
        return false;
    }
}
