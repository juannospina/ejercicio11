
package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
 Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra o frase terminada en punto:");
        String secuencia = entrada.nextLine();
        
        String codificacion = codificar(secuencia);// se crea la variable de la función para en la siguiente linea usarla.
        System.out.println("Secuencia codificada: " + codificacion + ".");
    }
    
    public static String codificar(String secuencia) {//funcion
        String codificacion = "";//se debe inicializar porque si no nos da error
        
        for (int i = 0; i < secuencia.length(); i++) {
            char caracter = secuencia.charAt(i);// este es el Substring(i,i) de PSeint
            
            switch (Character.toLowerCase(caracter)) {
                case 'a':
                    codificacion = codificacion.concat("@");//se concatena el reemplazo de 'a' por '@'
                    break;
                case 'e':
                    codificacion = codificacion.concat("#");
                    break;
                case 'i':
                    codificacion = codificacion.concat("$");
                    break;
                case 'o':
                    codificacion = codificacion.concat("%");
                    break;
                case 'u':
                    codificacion = codificacion.concat("*");
                    break;
                default:
                    codificacion = codificacion.concat(String.valueOf(caracter));//el default es para imprimir la letra en caso que no sea ninguna vocal, y el método String.valueOf(caracter) en Java se utiliza para convertir un valor de tipo char a su representación en forma de cadena (String).
                    break;
            }
        }
        
        return codificacion;
    }
}
