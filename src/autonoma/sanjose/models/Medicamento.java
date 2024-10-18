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
public abstract class Medicamento {
    
    //Atributos
    
   protected String nombre;
    protected double precio;
    protected int cantidadDisponible;
    
    //Constructor
     public Medicamento(String nombre, double precio, int cantidadDisponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }
    
    //Getters y Setters 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    // Métodos abstractos
    public abstract double calcularValorMedicamento();
    
     // Métodos CRUD
    public static Medicamento buscarMedicamento(List<Medicamento> medicamentos, String nombre) {
        for (Medicamento medicamento : medicamentos) {
            if (medicamento.getNombre().equals(nombre)) {
                return medicamento;
            }
        }
        return null;
    }

    public static void agregarMedicamento(List<Medicamento> medicamentos, Medicamento nuevoMedicamento) {
        medicamentos.add(nuevoMedicamento);
    }

    public static boolean eliminarMedicamento(List<Medicamento> medicamentos, String nombre) {
        Medicamento medicamento = buscarMedicamento(medicamentos, nombre);
        if (medicamento != null) {
            medicamentos.remove(medicamento);
            return true;
        }
        return false;
    }

    public static boolean actualizarMedicamento(List<Medicamento> medicamentos, String nombre, Medicamento medicamentoActualizado) {
        Medicamento medicamento = buscarMedicamento(medicamentos, nombre);
        if (medicamento != null) {
            int index = medicamentos.indexOf(medicamento);
            medicamentos.set(index, medicamentoActualizado);
            return true;
        }
        return false;
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
