/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PC1;

import java.util.Scanner;

/**
 *
 * @author Loreley
 */
public class CasadeCambio {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double soles, resultado=0;
        int opcion;
        System.out.println("Ingrese la cantidad en soles (PEN): ");
        soles=leer.nextDouble();
        System.out.println("\nSeleccione la moneda de destino");
        System.out.println("1. Dolares (USD)");
        System.out.println("2. Euros (EUR)");
        System.out.println("3. Libras (GPB)");
        System.out.println("4. Pesos Mexicanos (MXN)");
        
        System.out.println("Opcion: ");
        opcion = leer.nextInt();
        
        switch(opcion){
            case 1:
                resultado = soles * 0.28;
                System.out.printf("Resultado: %.2f soles = %.2f USD\n", soles, resultado);
                break;
            case 2:
                resultado=soles * 0.23;
                System.out.printf("Resultado: %.2f soles = %.2f EUR\n", soles, resultado);
                break;
            case 3:
                resultado = soles * 0.20;
                System.out.printf("Resultado: %.2f soles = %.2f GBP\n", soles, resultado);
                break;
            case 4:
                resultado = soles * 5.03;
                System.out.printf("Resultado: %.2f soles = %.2f MXNN\n", soles, resultado);
                break;
            default:
                System.out.println("Moneda no disponible");
        }
    }
    
}
