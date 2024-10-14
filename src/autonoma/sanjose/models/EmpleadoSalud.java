/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.sanjose.models;

/**
 ** Clase que representa a un empleado del área de salud.
 *  Hereda de la clase Empleado.
 * @author Moral
 */
public class EmpleadoSalud extends Empleado {
    
    //Atributos
    
    private String especialidad;
    private int horasTrabajadas;
    
    //Constructo
     /**
     * Constructor del empleado de salud.
     * @param nombre Nombre del empleado.
     * @param numeroDocumento Documento de identidad.
     * @param edad Edad del empleado.
     * @param salarioBase Salario base del empleado.
     * @param especialidad Especialidad médica.
     * @param horasTrabajadas Número de horas trabajadas.
     */
    public EmpleadoSalud(String especialidad, int horasTrabajadas, String nombre, String numeroDocumento, int edad, double salarioBase) {
        super(nombre, numeroDocumento, edad, salarioBase);
        this.especialidad = especialidad;
        this.horasTrabajadas = horasTrabajadas;
    }
    
    public EmpleadoSalud(String nombre, String numeroDocumento, int edad, double salarioBase) {
        super(nombre, numeroDocumento, edad, salarioBase);
    }

    @Override
    public double calcularSalario() {
         return salarioBase + (salarioBase * 0.012 * horasTrabajadas);
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Especialidad: " + especialidad + ", Horas trabajadas: " + horasTrabajadas;
    }
}
