/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.sanjose.models;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;

/**
 *
 * @author Moral
 */
public class EscritorArchivoTextoPlano implements Escritor {
    
    private final Charset charset = Charset.forName("UTF-8");
    private String filePath;
    
    public EscritorArchivoTextoPlano(String filePath){
        this.filePath = filePath;
    }
            
       //Sobre escribe el archivo de texto 
    @Override
    public void escribir(ArrayList<String> archivo) throws IOException {
    
        File fichero = new File(this.filePath);
        FileWriter writer = new FileWriter(fichero,false);
        PrintWriter pw = new PrintWriter (writer);
        
        for(String linea : archivo){
            pw.println(linea);
        }
        writer.close();
    }
    
}
