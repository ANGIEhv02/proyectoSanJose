/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.sanjose.models;

/**
 *
 * @author herre
 */
public abstract class Empleado {
   
    protected String nombre;
    protected String numeroDocumento;
    protected int edad;
    protected double salarioBase;

    public Empleado(String nombre, String numeroDocumento, int edad, double salarioBase) {
        this.nombre = nombre;
        this.numeroDocumento = numeroDocumento;
        this.edad = edad;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();
}

class EmpleadoSalud extends Empleado {
    private String especialidad;
    private int horasTrabajadas;

    public EmpleadoSalud(String nombre, String numeroDocumento, int edad, double salarioBase, String especialidad, int horasTrabajadas) {
        super(nombre, numeroDocumento, edad, salarioBase);
        this.especialidad = especialidad;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (salarioBase * 0.012 * horasTrabajadas);
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


  
    