/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.sanjose.models;

/**
 * Clase que representa a un empleado operativo.
 * Hereda de la clase Empleado.
 * @author Moral
 */
public class EmpleadoOperativo extends Empleado {
    
    //Atributos
    
    private String departamento;
    
    
    /**
     * Constructor del empleado operativo.
     * @param nombre Nombre del empleado.
     * @param documentoIdentidad Documento de identidad.
     * @param edad Edad del empleado.
     * @param salarioBase Salario base del empleado.
     * @param departamento Departamento al que pertenece.
     */
    public EmpleadoOperativo(String nombre, String documentoIdentidad, int edad, double salarioBase, 
        String departamento) {
        super(nombre, documentoIdentidad, edad, salarioBase);
        this.departamento = departamento;
    }

    public EmpleadoOperativo(String nombre, String numeroDocumento, int edad, double salarioBase) {
        super(nombre, numeroDocumento, edad, salarioBase);
    }

    @Override
    public double calcularSalario() {
          return salarioBase;  
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Departamento: " + departamento;
    }
    
    
}
