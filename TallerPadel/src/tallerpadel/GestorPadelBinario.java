package tallerpadel;
import java.io.*;
public class GestorPadelBinario {

    public void GuardarPartidos(PartidoPadel partido){
        try {
        
            FileOutputStream archivo = new FileOutputStream("partidos.dat");
            
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
        
            escritor.writeObject(partido);
            escritor.close();
            
            System.out.println("Se guardo en binario");
            
        } catch(Exception e){
            System.err.println("!ERROR " + e.getMessage()+"!");
        }
    

    }
        
    public PartidoPadel cargarPartido(){
    
        PartidoPadel partido = null;
            
        try {
        
            FileInputStream archivo = new FileInputStream("partidos.dat");
            
            ObjectInputStream Lector = new ObjectInputStream(archivo);
            
            partido = (PartidoPadel)Lector.readObject();
            
            Lector.close();
            
            System.out.println(partido);
            
        }catch(Exception e){
            System.err.println("!ERROR " + e.getMessage()+"!");
        }
        return partido;
    }
}
