package tallerpadel;
import java.io.*;
public class GestorPadelTexto {

    public void GuardarTexto(PartidoPadel partido){
        try {
        
            FileWriter archivo = new FileWriter("partidos.txt");
            
            PrintWriter escritor = new PrintWriter(archivo);
        
            escritor.println(partido.getPareja1());
            escritor.println(partido.getPareja2());
            escritor.println(partido.getMarcador1());
            escritor.println(partido.getMarcador2());

            escritor.close();
            
            System.out.println("Se guardo en texto");
            
        } catch(Exception e){
            System.err.println("!ERROR " + e.getMessage()+"!");
        }
    

    }
        
    public void LeerTexto(){
                
        try {
        
            BufferedReader Lector = new BufferedReader(new FileReader("partidos.txt"));
            
            String linea;
            while((linea = Lector.readLine()) != null){
                System.out.println(linea);
            }
            
            
            Lector.close();
            
            
        }catch(Exception e){
            System.err.println("!ERROR " + e.getMessage()+"!");
        }
    }

    
    
}
