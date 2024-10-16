/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.sanjose.main;

import autonoma.sanjose.models.Hospital;
import autonoma.sanjose.models.*;
import autonoma.sanjose.views.VentanaPrincipal;
import java.util.Date;

/**
 *
 * @author herre
 */
public class HospitalMain {
    
    public static void main (String[] args, Hospital hospital){
        
//        //Crear Coordenadas de el hospital
//        
//        Coordenadas coordenadas = new Coordenadas(37.267809,-234.787467);
//        
//        //Crear gerente
//        
//        Gerente gerente = new Gerente ("Geron nieto","75.667.789",54,"cirujano");
//        
//        // Crear hospital 
//        
//        Hospital hospital = new Hospital ("Hospital San José", "3456 Samaritan Dr, San Jose, CA 95124", 
//                                          "123-4567", 1000000, 200000, 1965, coordenadas, gerente);
//        
//        // Crear empleado
//        
//        EmpleadoSalud doctor = new EmpleadoSalud("Dr. Ana Torres", "87654321", 35, 50000, "Cardiología", 160);
//        hospital.agregarEmpleado(doctor);
//
//        // Crear paciente
//        
//        Paciente paciente = new Paciente("Carlos López", "13579246", 30, "carlos@correo.com", "987-6543");
//        hospital.agregarPaciente(paciente);
//
//        // Crear enfermedad y agregar al paciente
//        
//        Enfermedad enfermedad = new Enfermedad("Gripe", "Infección viral del tracto respiratorio");
//        paciente.agregarEnfermedad(enfermedad);
//
//        // Crear cita
//        
//        Cita cita = new Cita(paciente, new Date(), 200);
//        hospital.agregarCita(cita);
//
//        // Crear un reporte
//        
//        Reporte reporte = new Reporte("Reporte de Ingresos", "Los ingresos del hospital aumentaron en un 15% este mes.");
//        System.out.println(reporte.generarResumen());
//
//        // Calcular nómina
//        
//        hospital.procesarNomina();
//
//        // Mostrar estado del hospital
//        
//        System.out.println("Estado del hospital: " + hospital.getEstado());
//        
//            

    VentanaPrincipal ventana = new VentanaPrincipal(hospital);
     
    }

}
  

