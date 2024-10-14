/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.sanjose.models;

/**
 *
 * @author Moral
 */
public class MedicamentoMarca extends Medicamento{
    
    //Atributos
    
    private String laboratorio;
    private double recargo;
    
    //Constructor
    /**
     * medicamento de marca.
     * @param nombre Nombre del medicamento.
     * @param precio Precio base del medicamento.
     * @param laboratorio Nombre del laboratorio que fabrica el medicamento.
     * @param recargo Recargo aplicado al precio base por ser de marca.
     */
    public MedicamentoMarca(String nombre, double precio, String laboratorio, double recargo) {
        super(nombre, precio);
        this.laboratorio = laboratorio;
        this.recargo = recargo;
    }

    public MedicamentoMarca(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public double calcularPrecio() {
       return precio + recargo;  // El precio incluye un recargo adicional por ser de marca
    }
    
     @Override
    public String toString() {
        return "Medicamento de Marca: " + super.toString() + ", Laboratorio: " + laboratorio + ", Precio final: " + calcularPrecio();
    }
    
}
