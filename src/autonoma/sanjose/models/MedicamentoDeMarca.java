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
    
    private String marca;
    private String laboratorio;
    
    //Constructor
    
   public MedicamentoDeMarca (String nombre, double precio, int cantidadDisponible,
           String marca, String laboratorio) {
        super(nombre, precio, cantidadDisponible);
        this.marca = marca;
        this.laboratorio = laboratorio;
    }
   
   //Getters y Setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
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
   
   
    
    //Metodos
     @Override
    public double calcularValorMedicamento() {
        return precio * cantidadDisponible; // Valor total del medicamento
    }
    
}

   