/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.sanjose.models;

/**
 *
 * @author Moral
 */
public class MedicamentoGenerico extends Medicamento {
    
    //Atributos
    
    private String componenteActivo;
     
    //Constructor 

   public MedicamentoGenerico(String nombre, double precio, int cantidadDisponible, String componenteActivo) {
        super(nombre, precio, cantidadDisponible);
        this.componenteActivo = componenteActivo;
    }
    
    //Getters y Setters 

    public String getComponenteActivo() {
        return componenteActivo;
    }

    public void setComponenteActivo(String componenteActivo) {
        this.componenteActivo = componenteActivo;
    }

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

   
    @Override
    public double calcularValorMedicamento() {
        return precio * cantidadDisponible; // Valor total del medicamento
    }
    
}
