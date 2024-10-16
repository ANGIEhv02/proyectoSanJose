/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.sanjose.models;

/**
 *
 * @author Moral
 */
public class MedicamentoDeMarca  extends Medicamento{
    
    //Atributos
    
    private String nombreMarca;
    
    //Constructor
    
    
    public MedicamentoDeMarca(String nombreMarca, String nombre, String laboratorio, double precio) {
        super(nombre, laboratorio, precio);
        this.nombreMarca = nombreMarca;
    }
    
    //Metodos

    public MedicamentoDeMarca(String nombre, String laboratorio, double precio) {
        super(nombre, laboratorio, precio);
    }

    @Override
    public String obtenerDetalles() {
        return "Medicamento de Marca: " + nombre + ", Laboratorio: " + laboratorio + ", Precio: " + precio + 
               ", Marca: " + nombreMarca;
    }
    
}
