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
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        String frase, nuevaFrase;
        do{
            System.out.println("Ingrese una Frase. debe finalizar con punto");
            frase=leer.next();
        }while(!frase.substring(frase.length()-1, frase.length()).equals("."));
        
       
    
       nuevaFrase = cambiar(frases);
        System.out.println(" ");
           
            
            //frase = frase.concat(nuevaLetra);
          // }while(!letra.equals("."));
        //System.out.println(frase);
        
    }
 /* public static String cambiar(String frases){
     for(int i=0;i<frases.length(); i++){
         
     } 
  
    
}
