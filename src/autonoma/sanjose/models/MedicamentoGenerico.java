
package autonoma.sanjose.models;

/**
 * Clase que representa un medicamento genérico.
 * Hereda de la clase Medicamento.
 * @author Moral
 */
public class MedicamentoGenerico extends Medicamento{
    //Constructor 
    /**
     *  medicamento genérico.
     * @param nombre Nombre del medicamento.
     * @param precio Precio base del medicamento.
     */
    public MedicamentoGenerico(String nombre, double precio) {
        super(nombre, precio);
    }

  

    @Override
    public double calcularPrecio() {
        return precio;  // El precio del medicamento genérico no tiene recargos
    }
    
      @Override
    public String toString() {
        return "Medicamento Genérico: " + super.toString();
    }
    
}
