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
    
    private String principioActivo;
     
    //Constructor 

    public MedicamentoGenerico(String principioActivo, String nombre, String laboratorio, double precio) {
        super(nombre, laboratorio, precio);
        this.principioActivo = principioActivo;
    }
    
    //Getters y Setters 

    public String getPrincipioActivo() {
        return principioActivo;
    }

    public void setPrincipioActivo(String principioActivo) {
        this.principioActivo = principioActivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    //Metodos
    
    public MedicamentoGenerico(String nombre, String laboratorio, double precio) {
        super(nombre, laboratorio, precio);
    }

    @Override
    public String obtenerDetalles() {
         return "Medicamento Genérico: " + nombre + ", Laboratorio: " + laboratorio + ", Precio: " + precio + 
               ", Principio Activo: " + principioActivo;
    }
    
}
