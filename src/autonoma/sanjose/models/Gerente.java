/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.sanjose.models;

import java.util.List;

/**
 * Estos es para dar acabo la clase gerente insertar un gerente
 * @author Moral
 */
public class Gerente extends Empleado{
    
    //Atributos
    
    private String departamento;
    private String carrera;
    
    //Constructor

    public Gerente(String nombre, String documento, int edad, double salarioBase, String departamento) {
        super(nombre, documento, edad, salarioBase);
        this.departamento = departamento;
    }
    
    //Getters y Setters 

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
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
        return salarioBase + (salarioBase * 0.30); // Bonus de gerente
    }
    
    
    // Métodos CRUD
    public static Gerente buscarGerente(List<Gerente> gerentes, String documento) {
        for (Gerente gerente : gerentes) {
            if (gerente.getDocumento().equals(documento)) {
                return gerente;
            }
        }
        return null;
    }

    public static void agregarGerente(List<Gerente> gerentes, Gerente nuevoGerente) {
        gerentes.add(nuevoGerente);
    }

    public static boolean eliminarGerente(List<Gerente> gerentes, String documento) {
        Gerente gerente = buscarGerente(gerentes, documento);
        if (gerente != null) {
            gerentes.remove(gerente);
            return true;
        }
        return false;
    }

    public static boolean actualizarGerente(List<Gerente> gerentes, String documento, Gerente gerenteActualizado) {
        Gerente gerente = buscarGerente(gerentes, documento);
        if (gerente != null) {
            int index = gerentes.indexOf(gerente);
            gerentes.set(index, gerenteActualizado);
            return true;
        }
        return false;
    }
}
