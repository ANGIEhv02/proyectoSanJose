/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.sanjose.models;

/**
 * este modulo es para generar reportes de cita 
 * @author Moral
 */
public class Reporte {
    
    //Atributos
    
    private String titulo;
    private String contenido;

    //Constructor

    public Reporte(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
    }
    
    //Getters y Setters 

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    /**
     * Método para generar un resumen del reporte.
     */
    public String generarResumen() {
        return "Título: " + titulo + "\nContenido: " + contenido;
    }
    
}
