/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.sanjose.main;

import autonoma.sanjose.models.*;
import java.util.Scanner;

/**
 *
 * @author herre
 */
public class HospitalMain {

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HospitalMain hospital = new HospitalMain(
                "Hospital San José St. Bonaventure", 
                "2425 Samaritan Dr, San Jose, CA 95124",
                1000000, // Presupuesto inicial de 1,000,000
                2000000, // Meta anual de ventas
                new Localizacion(37.25157313140872, -121.94667417922749),
                new Gerente("Aaron Glassman", "84.941.564", 69, "Neurocirujano")
        );
        
        boolean sistemaActivo = true;
        
        // Ciclo principal del sistema
        while (sistemaActivo) {
            System.out.println("==== Sistema de Gestión Hospitalaria ====");
            System.out.println("1. Gestión de Empleados");
            System.out.println("2. Gestión de Pacientes");
            System.out.println("3. Gestión de Farmacia");
            System.out.println("4. Generar Nómina");
            System.out.println("5. Registrar Patrocinio");
            System.out.println("6. Generar Reportes");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de línea
            
            switch (opcion) {
                case 1:
                    gestionarEmpleados(scanner, hospital);
                    break;
                case 2:
                    gestionarPacientes(scanner, hospital);
                    break;
                case 3:
                    gestionarFarmacia(scanner, hospital);
                    break;
                case 4:
                    generarNomina(hospital);
                    break;
                case 5:
                    registrarPatrocinio(scanner, hospital);
                    break;
                case 6:
                    hospital.generarReportes();
                    break;
                case 7:
                    sistemaActivo = false;
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
        
        scanner.close();
    }
    
    // Método para gestionar empleados
    public static void gestionarEmpleados(Scanner scanner, HospitalMain hospital) {
        System.out.println("=== Gestión de Empleados ===");
        System.out.println("1. Agregar Empleado de Salud");
        System.out.println("2. Agregar Empleado Operativo");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();  // Consumir el salto de línea
        
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el documento de identidad: ");
        String documento = scanner.nextLine();
        System.out.print("Ingrese la edad del empleado: ");
        int edad = scanner.nextInt();
        System.out.print("Ingrese el salario base del empleado: ");
        double salarioBase = scanner.nextDouble();
        scanner.nextLine();  // Consumir el salto de línea
        
        if (opcion == 1) {
            System.out.print("Ingrese la especialidad del empleado: ");
            String especialidad = scanner.nextLine();
            System.out.print("Ingrese el número de horas trabajadas: ");
            int horasTrabajadas = scanner.nextInt();
            EmpleadoSalud empleadoSalud = new EmpleadoSalud(nombre, documento, edad, salarioBase, especialidad, horasTrabajadas);
            hospital.agregarEmpleado(empleadoSalud);
        } else if (opcion == 2) {
            System.out.print("Ingrese el área operativa del empleado: ");
            String area = scanner.nextLine();
            EmpleadoOperativo empleadoOperativo = new EmpleadoOperativo(nombre, documento, edad, salarioBase, area);
            hospital.agregarEmpleado(empleadoOperativo);
        } else {
            System.out.println("Opción no válida.");
        }
    }
    
    // Método para gestionar pacientes
    public static void gestionarPacientes(Scanner scanner, HospitalMain hospital) {
        System.out.println("=== Gestión de Pacientes ===");
        System.out.print("Ingrese el nombre del paciente: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el documento de identidad: ");
        String documento = scanner.nextLine();
        System.out.print("Ingrese la edad del paciente: ");
        int edad = scanner.nextInt();
        scanner.nextLine();  // Consumir el salto de línea
        
        Paciente paciente = new Paciente(nombre, documento, edad);
        hospital.agregarPaciente(paciente);
        
        System.out.println("Paciente agregado exitosamente.");
    }
    
    // Método para gestionar farmacia
    public static void gestionarFarmacia(Scanner scanner, HospitalMain hospital) {
        System.out.println("=== Gestión de Farmacia ===");
        System.out.println("1. Agregar Medicamento Genérico");
        System.out.println("2. Agregar Medicamento de Marca");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();  // Consumir el salto de línea
        
        System.out.print("Ingrese el nombre del medicamento: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el costo del medicamento: ");
        double costo = scanner.nextDouble();
        scanner.nextLine();  // Consumir el salto de línea
        
        if (opcion == 1) {
            MedicamentoGenerico medicamentoGenerico = new MedicamentoGenerico(nombre, costo);
            hospital.agregarMedicamento(medicamentoGenerico);
        } else if (opcion == 2) {
            System.out.print("Ingrese el nombre del laboratorio: ");
            String laboratorio = scanner.nextLine();
            System.out.print("Ingrese el recargo de marca: ");
            double recargo = scanner.nextDouble();
            MedicamentoMarca medicamentoMarca = new MedicamentoMarca(nombre, costo, laboratorio, recargo);
            hospital.agregarMedicamento(medicamentoMarca);
        } else {
            System.out.println("Opción no válida.");
        }
    }
    
    // Método para generar la nómina
    public static void generarNomina(HospitalMain hospital) {
        try {
            hospital.generarNomina();
        } catch (HospitalQuiebraException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    // Método para registrar un patrocinio
    public static void registrarPatrocinio(Scanner scanner, HospitalMain hospital) {
        System.out.print("Ingrese el valor del patrocinio: ");
        double valorPatrocinio = scanner.nextDouble();
        scanner.nextLine();  // Consumir el salto de línea
        
        hospital.registrarPatrocinio(valorPatrocinio);
    }

    private HospitalMain(String hospital_San_José_St_Bonaventure, String _Samaritan_Dr_San_Jose_CA_95124, int i, int i0, Localizacion localizacion, Gerente gerente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
