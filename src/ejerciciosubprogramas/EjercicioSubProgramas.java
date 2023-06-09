/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto, y luego codifique la palabra o
frase ingresada de la siguiente manera: cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres .
(incluyendo a las vocales acentuadas) se mantienen sin cambios.
a
e
i
o
u
@
#
$
%
*

Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación correspondiente. 
Utilice la estructura “según” para la transformación. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

*/

package ejerciciosubprogramas;

import java.util.Scanner;

/**
 * escanear.useDelimiter( "/" );
 * @author Martin
 */
public class EjercicioSubProgramas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        String letra;
        String frase="";
        String nuevaLetra;
        System.out.println("Ingrese una Frase");
        
        do{
            letra=leer.next();
            nuevaLetra = cambiar(letra);
            frase = frase.concat(nuevaLetra);
           }while(!letra.equals("."));
        System.out.println(frase);
        
    }
    public static String cambiar(String letra){
        String nuevaLetra;
        letra=letra.toLowerCase();
        switch(letra){
            case "a":
                nuevaLetra = "@";
                break;
            case "e":
                nuevaLetra = "#";
                break;
            case "i":
                nuevaLetra = "$";
                break;
            case "o":
                nuevaLetra = "%";
                break;
            case "u":
                nuevaLetra = "*";
                break;
            default:
                nuevaLetra=letra;
                break;
        }
        return nuevaLetra;
    }
}


/*
public class Ejercicio1 {

    /**
     * @param args the command line arguments

    public static void main(String[] args) {
        Scanner ingrese = new Scanner(System.in);
        String igualar = " ";
        String frase = "";
        int largo = 0;
        do {
            System.out.println("Ingrese una frase que termine en punto");
            frase = ingrese.nextLine();
            largo = frase.length();
            igualar = frase.substring((largo - 1), largo);
        } while (!igualar.equals("."));
        
        String retorno = cambiar(frase, largo);
        System.out.println(retorno);
    }

    public static String cambiar(String frase, int largo) {
        String frase2 = "";
        for (int i = 0; i < (largo - 1); i++) {
            String letra = frase.substring(i, i + 1);
            letra.equalsIgnoreCase(letra);
            switch (letra) {
                case "a":
                    letra = "@";
                    break;
                case "e":
                    letra = "#";
                    break;
                case "i":
                    letra = "$";
                    break;
                case "o":
                    letra = "%";
                    break;
                case "u":
                    letra = "*";
                    break;
            }
            frase2 = frase2.concat(letra);
        }
        return frase2;
    }

}
*/