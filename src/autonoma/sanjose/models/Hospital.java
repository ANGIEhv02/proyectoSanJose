/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.sanjose.models;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;






/**
 *
 * @author herre
 */
public class Hospital {
    private String nombre;
    private String direccion;
    private String telefono;
    private String logo;
    private double presupuesto;
    private double metaVentasAnual;
    private Date fechaFundacion;
    private String estado;  // "activo" o "en quiebra"
    private double latitud;
    private double longitud;
    private Gerente gerente;
    private List<Empleado> empleados = new ArrayList<>();
    private List<Paciente> pacientes = new ArrayList<>();
    private Farmacia farmacia = new Farmacia();
    
    public Hospital(String nombre, String direccion, String telefono, double presupuesto, double metaVentasAnual, 
                    Date fechaFundacion, double latitud, double longitud, Gerente gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.presupuesto = presupuesto;
        this.metaVentasAnual = metaVentasAnual;
        this.fechaFundacion = fechaFundacion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.gerente = gerente;
        this.estado = "activo";
    }

    public void actualizarPresupuesto(double monto) {
        this.presupuesto += monto;
        if (this.presupuesto < 0) {
            this.estado = "en quiebra";
            System.out.println("El hospital está en quiebra. Se debe registrar un patrocinio.");
        }
    }

    public void registrarPatrocinio(double monto) {
        if (this.estado.equals("en quiebra")) {
            this.presupuesto += monto;
            if (this.presupuesto > 0) {
                this.estado = "activo";
                System.out.println("El hospital ha vuelto a estar activo.");
            }
        }
    }

    public void añadirEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void añadirPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

   
}

    
    
    

