/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.sanjose.main;

import autonoma.sanjose.models.Hospital;
import autonoma.sanjose.models.*;
import autonoma.sanjose.views.VentanaPrincipal;
import java.util.Date;
import javax.swing.SwingUtilities;

/**
 *
 * @author herre
 */
public class HospitalMain {
    
    public static void main (String[] args){
        
              
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Crear e inicializar la ventana principal
                VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
                ventanaPrincipal.setVisible(true);
            }
        });
   
    }

}
  

