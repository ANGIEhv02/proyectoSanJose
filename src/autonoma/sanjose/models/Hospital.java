
package autonoma.sanjose.models;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author herre
 */
public class Hospital {
  
    //Atributos
    private String nombre;
    private String direccion;
    private double presupuesto;
    private double metaVentasAnual;
    private Gerente gerente;
    private Localizacion localizacion;
    private ArrayList<Empleado> empleados;  // Lista dinámica de empleados
    private ArrayList<Paciente> pacientes;  // Lista dinámica de pacientes
    private ArrayList<Medicamento> inventario;  // Lista dinámica de medicamentos
    private boolean enQuiebra;
    
    //Constructor

    public Hospital(String nombre, String direccion, double presupuesto, double metaVentasAnual, Gerente gerente, Localizacion localizacion, ArrayList<Empleado> empleados, ArrayList<Paciente> pacientes, ArrayList<Medicamento> inventario, boolean enQuiebra) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.presupuesto = presupuesto;
        this.metaVentasAnual = metaVentasAnual;
        this.gerente = gerente;
        this.localizacion = localizacion;
        this.empleados = new ArrayList<>();
        this.pacientes = new ArrayList<>();
        this.inventario = new ArrayList<>();
        this.enQuiebra = false;
    }
    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public double getMetaVentasAnual() {
        return metaVentasAnual;
    }

    public void setMetaVentasAnual(double metaVentasAnual) {
        this.metaVentasAnual = metaVentasAnual;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public Localizacion getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(Localizacion localizacion) {
        this.localizacion = localizacion;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public ArrayList<Medicamento> getInventario() {
        return inventario;
    }

    public void setInventario(ArrayList<Medicamento> inventario) {
        this.inventario = inventario;
    }

    public boolean isEnQuiebra() {
        return enQuiebra;
    }

    public void setEnQuiebra(boolean enQuiebra) {
        this.enQuiebra = enQuiebra;
    }
    
        
    /**
     * Método para agregar un empleado al hospital.
     * @param empleado Empleado a ser agregado.
    */
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }
    
    /**
     * Método que genera la nómina del hospital sumando los salarios de todos
     * los empleados y restando del presupuesto. Si el presupuesto es insuficiente,
     * se marca al hospital como en quiebra.
    */
    public void generarNomina() {
        double totalNomina = 0;
        for (Empleado emp : empleados) {
            totalNomina += emp.calcularSalario();  // Uso de polimorfismo
        }
        if (presupuesto >= totalNomina) {
            presupuesto -= totalNomina;
            System.out.println("Nómina generada con éxito. Presupuesto restante: " + presupuesto);
        } else {
            enQuiebra = true;
            System.out.println("El hospital está en quiebra. No se puede generar nómina.");
        }
    }

    /**
     * Método para registrar un patrocinio y restaurar el estado financiero
     * del hospital si está en quiebra.
     * @param monto Monto del patrocinio.
    */
    public void registrarPatrocinio(double monto) {
        if (enQuiebra && monto > -presupuesto) {
            presupuesto += monto;
            enQuiebra = false;
            System.out.println("Patrocinio registrado. El hospital ya no está en quiebra.");
        } else {
            System.out.println("El patrocinio no es suficiente para cubrir la deuda.");
        }
    }

    /**
     * Método para guardar los datos del hospital en un archivo de texto.
    */
    public void guardarDatos() {
        try (FileWriter writer = new FileWriter("hospital_datos.txt")) {
            writer.write("Presupuesto: " + presupuesto + "\n");
            writer.write("Empleados:\n");
            for (Empleado emp : empleados) {
                writer.write(emp.toString() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error guardando datos: " + e.getMessage());
        }
    }

    /**
     * Método para cargar los datos del hospital desde un archivo de texto.
     */
    public void cargarDatos() {
        try (BufferedReader reader = new BufferedReader(new FileReader("hospital_datos.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error cargando datos: " + e.getMessage());
        }
    }
}

    
    
    

