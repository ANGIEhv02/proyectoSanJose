/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.sanjose.models;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/**
 *
 * @author Moral
 */
public class LectorArchivoTextoPlano implements Lector {
    
    private ArrayList<String>archivo;
    
    private Charset charset = Charset.forName("UTF-8");
    
    
    public LectorArchivoTextoPlano(){
        this.archivo = new ArrayList<>();
    
    }

    @Override
    public ArrayList<String> leer(String localizacionArchivo) throws IOException {
       archivo.clear();
        File file =  null;
        FileReader reader = null;
        BufferedReader buffer = null;
        
        file = new File(localizacionArchivo);
        reader = new FileReader(file);
        buffer = new BufferedReader(reader);
        
        String linea;
        while ((linea= buffer.readLine())!=null ) { 
            agregarLinea(linea);
        }
        
        reader.close();
        return this.archivo;
    }
    
    public void agregarLinea(String linea){
        archivo.add(linea);
    }
    
    public void limpiarTexto(ArrayList<String> texto){
        for (int i = 0; i < texto.size(); i++) {
            
            if(texto.get(i).length()==0)
            {
                texto.remove(i);
            }
            
        }
        
    }
    
}
