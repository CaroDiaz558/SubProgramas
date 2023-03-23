/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir. 
La aplicación debe tener una función para cada operación matemática y deben devolver sus resultados para imprimirlos en el main. 


*/
package ejerciciosubprogramas;

import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer= new Scanner(System.in);
      int num1, num2;
      
        System.out.println("Ingrese un numero: ");
        num1= leer.nextInt();
        
        System.out.println("Ingrese el otro numero");
        num2= leer.nextInt();
        
        System.out.println("Menu, 1.Sumar, 2.Restar, 3.Multiplicar, 4.Dividir" );
        int opcion = leer.nextInt();

        switch(opcion){
            case 1:
                int sumar =sumar(num1,num2);
                System.out.println("La suma es: " + sumar);
             case 2:
                int restar =restar(num1,num2);
                System.out.println("La resta es: " + restar);
             case 3:
                int multiplicar =multiplicar(num1,num2);
                System.out.println("La multiplicacion es: " + multiplicar);
             case 4:
                double dividir =dividir(num1,num2);
                System.out.println("La division es: " + dividir);
        }
      
    }
    
    public static int sumar(int num1, int num2){
        int suma;
        suma= num1 + num2;
        return suma; 
    }
     public static int restar(int num1, int num2){
        int resta;
        resta= num1 - num2;
        return resta; 
    }
     
     public static int multiplicar(int num1, int num2){
        int multi;
        multi= num1 * num2;
        return multi; 
    }  
     public static double dividir(int num1, int num2){
        double div;
        div= (double)num1 / num2;
        return div; 
    }  
}
