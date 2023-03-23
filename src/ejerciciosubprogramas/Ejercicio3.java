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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingrese = new Scanner(System.in);
        String moneda = "";
        float euro = 0;
        System.out.println("Ingrese la cantidad de Euros a convertir");
        euro = ingrese.nextFloat();
        do {

            System.out.println("A que moneda desea convertir?(libras/yenes/dolares)");
            moneda = ingrese.next();

        } while (!moneda.equalsIgnoreCase("yenes") && !moneda.equalsIgnoreCase("libras") && !moneda.equalsIgnoreCase("dolares"));

        cambio(euro, moneda);
    }

    public static void cambio(float euro, String moneda) {
        double cambio;

        switch (moneda) {
            case "libras":
                cambio = euro * 0.86;
                System.out.println("Equivale a: " + cambio + " libras");
                break;
            case "yenes":
                cambio = euro * 129.852;
                System.out.println("Equivale a: " + cambio + " yenes");
                break;
            case "dolares":
                cambio = euro * 1.28611;
                System.out.println("Equivale a: " + cambio + " dolares");
                break;

        }
    }
}