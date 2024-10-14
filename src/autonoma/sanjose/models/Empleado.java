/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.sanjose.models;

/**
 *
 * Clase abstracta que representa a un empleado en el hospital.
 * Los métodos y atributos comunes a los empleados están definidos aquí
 * @author herre
 */
public abstract class Empleado {
   
    //Atributos
    
    protected String nombre;
    protected String numeroDocumento;
    protected int edad;
    protected double salarioBase;
    
    //Constructor

    public Empleado(String nombre, String numeroDocumento, int edad, double salarioBase) {
        this.nombre = nombre;
        this.numeroDocumento = numeroDocumento;
        this.edad = edad;
        this.salarioBase = salarioBase;
    }

    /**
     * Método abstracto que se implementa en subclases para calcular el salario.
     * @return Salario neto del empleado.
     */
    public abstract double calcularSalario();

    @Override
    public String toString() {
        return nombre + " (" + numeroDocumento + "), Edad: " + edad + ", Salario base: " + salarioBase;
    }
}


class EmpleadoOperativo extends Empleado {
    private String areaTrabajo;

    public EmpleadoOperativo(String nombre, String numeroDocumento, int edad, double salarioBase, String areaTrabajo) {
        super(nombre, numeroDocumento, edad, salarioBase);
        this.areaTrabajo = areaTrabajo;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (salarioBase * 0.20);
    }
}


  
    