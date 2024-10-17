/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.sanjose.models;

import java.util.List;

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

   
    
    // Métodos CRUD
    public static Reporte buscarReporte(List<Reporte> reportes, String titulo) {
        for (Reporte reporte : reportes) {
            if (reporte.getTitulo().equals(titulo)) {
                return reporte;
            }
        }
        return null;
    }

    public static void agregarReporte(List<Reporte> reportes, Reporte nuevoReporte) {
        reportes.add(nuevoReporte);
    }

    public static boolean eliminarReporte(List<Reporte> reportes, String titulo) {
        Reporte reporte = buscarReporte(reportes, titulo);
        if (reporte != null) {
            reportes.remove(reporte);
            return true;
        }
        return false;
    }

    public static boolean actualizarReporte(List<Reporte> reportes, String titulo, Reporte reporteActualizado) {
        Reporte reporte = buscarReporte(reportes, titulo);
        if (reporte != null) {
            int index = reportes.indexOf(reporte);
            reportes.set(index, reporteActualizado);
            return true;
        }
        return false;
    }
    
}
