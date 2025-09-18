import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bucles {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // bucle que lee x palabras y muestra solo las que tengan mas de 6 letras y empiecen o acaben por a
        // acaba cunado lee todas las palabras o lea fin 
        Scanner teclado= new Scanner (System.in);

    int numpal=0;
    String palabra="";

       
    System.out.println("numero de palabras: ");
    numpal= teclado.nextInt();

    teclado.next();
    System.out.println("palabra 1: ");
    palabra= teclado.nextLine();
   
    int i =2;
    //el bucle acaba cuando no quedan palabras por leer
    while (numpal!=0 && !palabra.equalsIgnoreCase("fin")) {
        

        //si tiene mas de 6 palabras o empeiza o acaba por a

        if (palabra.length() >=6 && (palabra.toUpperCase().charAt(0) == 'A'  || palabra.toUpperCase().endsWith( "A"))) {
            
        }
    }


    //leemos la siguiente palabra
    System.out.println("palabra  " +i + ":");
    palabra= teclado.nextLine();
    i++;
    numpal--;

    teclado.close();

    
    /*agora con bucle for recorremos  un putisimo array list de string 
     * yb mostramos las q tengan las letras p y que tenga alguna
     * letra en posición simetrica
     */

     List<String> listapalabras = new ArrayList<String>();

    listapalabras.add("pepe");
    listapalabras.add("perrit");
    listapalabras.add("apalabrado");
    listapalabras.add("aseso");

    //recorremos con un bucle for todos los elementos
    for(int j=0; j< listapalabras.size();j++) {
       palabra=(String) listapalabras.get(j);

       //comprobamos si tiene una p
       if(palabra.toLowerCase().contains("p")){
         //vamos a comprobar si tiene letras siemtricas
    
        int mitad= palabra.length()/2;

        /*recorremos las primera mitad de los caracteres de la plalabara 
        y los comparaaos si son igiuales que los caracteres en su posicion simetrica */
        for (int z=0; z<mitad;z++){
            if(palabra.charAt(z)==palabra.charAt(palabra.length()-z-1))
            {
                System.out.println(palabra);
            }
           }
          }
         }
        }
       }
