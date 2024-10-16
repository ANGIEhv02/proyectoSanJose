/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.sanjose.models;

/**
 * esta clase es para crear un empleado salud
 * @author Moral
 */
public class EmpleadoSalud extends Empleado {
    
    // Atributos
    
    private String especialidad;
    private int horasTrabajadas;
    
    //Constructor

    public EmpleadoSalud(String especialidad, String nombre, int horasTrabajadas, int edad, String numeroDocumento, int salarioBase) {
        super(nombre, numeroDocumento, edad, salarioBase);
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
    
    @Override
    public double calcularSalario() {
         return salarioBase + (salarioBase * 0.012 * horasTrabajadas);
    }

}
