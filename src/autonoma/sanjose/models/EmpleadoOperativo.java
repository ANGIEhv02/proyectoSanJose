/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.sanjose.models;

/**
 *
 * @author Moral
 */
public class EmpleadoOperativo extends Empleado {
    
    //Atributos
    
    private String areaTrabajo;
     
    //Constructor 

    public EmpleadoOperativo(String areaTrabajo, String nombre, String numeroDocumento, int edad, double salarioBase) {
        super(nombre, numeroDocumento, edad, salarioBase);
        this.areaTrabajo = areaTrabajo;
    }
    
    //Getters y Setters

    public String getAreaTrabajo() {
        return areaTrabajo;
    }

    public void setAreaTrabajo(String areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
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
    
    public EmpleadoOperativo(String nombre, String numeroDocumento, int edad, double salarioBase) {
        super(nombre, numeroDocumento, edad, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase * 1.20; // Aumentar el 20% al salario base
    }

    
}
