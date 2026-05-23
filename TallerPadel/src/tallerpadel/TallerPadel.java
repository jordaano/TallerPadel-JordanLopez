package tallerpadel;
public class TallerPadel {

    public static void main(String[] args) {
        PartidoPadel partido = new PartidoPadel("Jordan/Natalia","Carlos/Julio"
                ,4,5);
        
        GestorPadelBinario Bn = new GestorPadelBinario();
        Bn.GuardarPartidos(partido);
        //BINARIO.  Qué sucede si intentas abrir el archivo .dat con un editor de texto?
        PartidoPadel recuperado = Bn.cargarPartido();
        System.out.println("Desde .dat: ");
        System.out.println(recuperado);
        /*CUANDO SE INTENTA ABRIR DESDE EL BLOC DE NOTAS :
        "¬í sr tallerpadel.PartidoPadelM)$ò™5 Á I 	marcador1I 	
        marcador2L  pareja1t Ljava/lang/String;L  pareja2q ~ xp  
           t Jordan/Nataliat Carlos/Julio"
        
        Lo hace ilegible de leer y comprender ya que esta almcenado mediante la
        serializacion binaria lo que lo codifica de tal manera que cuando lo abres
        en un bloc de notas, te salen estos signos que estan dise;ados para 
        ser interpretados por java
        */
        
        //TEXTO. Cuál es el principal inconveniente de usar .txt frente a 
        //.dat cuando el sistema crece en complejidad (muchos atributos o clases relacionadas)?
        GestorPadelTexto tx = new GestorPadelTexto();
        
        tx.GuardarTexto(partido);
        System.out.println("Desde .txt: ");
        tx.LeerTexto();
        /*
            Se complica por que a diferencia del .dat, te da la extructura de como 
            quiere mostrar el texto, mientras que en .txt te muestra todo directo
            sin indicaciones ni nada, ademas que seria una cantidad de datos extrema
            con los atributos y las clases en exceso, si quieres una estructura 
            definida, tendrias que hacerlo manualmente, lo cual no es flexible a 
            la hora de hacer el trabajo 
        
        */
    }
    
}
