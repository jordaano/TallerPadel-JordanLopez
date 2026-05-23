package tallerpadel;
import java.io.Serializable;
public class PartidoPadel implements Serializable {
    private String pareja1;
    private String pareja2;
    private int marcador1;
    private int marcador2;

    public PartidoPadel(String pareja1, String pareja2, int marcador1, int marcador2) {
        this.pareja1 = pareja1;
        this.pareja2 = pareja2;
        this.marcador1 = marcador1;
        this.marcador2 = marcador2;
    }

    public String getPareja1() {
        return pareja1;
    }

    public void setPareja1(String pareja1) {
        this.pareja1 = pareja1;
    }

    public String getPareja2() {
        return pareja2;
    }

    public void setPareja2(String pareja2) {
        this.pareja2 = pareja2;
    }

    public int getMarcador1() {
        return marcador1;
    }

    public void setMarcador1(int marcador1) {
        this.marcador1 = marcador1;
    }

    public int getMarcador2() {
        return marcador2;
    }

    public void setMarcador2(int marcador2) {
        this.marcador2 = marcador2;
    }
    
    @Override  
    public String toString(){
        return pareja1 +" VS "+ pareja2 + "->" + marcador1 +" ; "+marcador2;
    }
  
}
