/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosubprogramas;

import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class Ejercicio12 {

public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingresar un numero entero positivo");
        int num1=leer.nextInt();
        System.out.println("Ingresar otro numero entero positivo");
        int num2=leer.nextInt();
        
        multiplo(num1,num2);
    }
    public static void multiplo (int num1,int num2){
        if (num1%num2==0 || num2%num1==0)
            System.out.println("Los números ingresados son múltiplos");
        else
            System.out.println("Los números ingresados no son múltiplos");
    }   }