/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas por teclado e 
indique si son mayores o menores de edad. 
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir mostrando personas y frenar cuando
el usuario ingrese la palabra “No”.
*/

package ejerciciosubprogramas;

/**
 *
 * @author Martin
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
}


/*
package guiap3eje2;

import java.util.Scanner;

public class Guiap3eje2 {

    public static void main(String[] args) {        
        boolean isSeguir;       
        
        do {            
            isSeguir = ingresarDatos();
        } while (isSeguir);
    }
    
    public static boolean ingresarDatos(){
        String nombre;
        String accion;
        int edad;
        boolean isSeguir = true;
        
        Scanner data = new Scanner(System.in);
        Scanner data1 = new Scanner(System.in);        
        System.out.println("Ingrese su nombre");
        nombre = data.nextLine();
        System.out.println("Ingrese su edad");
        edad = data.nextInt();      
        analizarData(edad, nombre);
        
        System.out.println("Desea seguir ingresando datos?? si/no");
        accion = data1.nextLine();
        if(accion.equals("no")){
            isSeguir = false;
        }
    return isSeguir;
    }
    
     public static void analizarData(int edad, String nombre){
       
         if(edad > 18){
            System.out.println("La persona "+nombre+" es mayor de edad");
         }else{
             System.out.println("La persona "+nombre+" es menor de edad");
         }    
    }
    
}
*/