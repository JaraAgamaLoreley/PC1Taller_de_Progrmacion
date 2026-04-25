/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PC1;

import java.util.Scanner;

/**
 *
 * @author Loreley
 */
public class EjercicioDescuentoPensión {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double pensionbase, promedio, descuento, montodescuento, bono, montofinal;
        int pagocontado;
        System.out.println("Ingrese la pension base: ");
        pensionbase = leer.nextDouble();
        System.out.println("Ingrese promedio ponderado: ");
        promedio = leer.nextDouble();
        System.out.println("Pagara al contado? (1: si / 2: no)");
        pagocontado = leer.nextInt();
        
        if(promedio >= 18 && promedio <= 20){
            descuento = 0.20;
        }else if(promedio >=15 && promedio < 18){
            descuento = 0.10;
        }else if(promedio >=13 && promedio < 15){
            descuento = 0.05;
        }else{
            descuento = 0.0;
        }
        montodescuento = pensionbase * descuento;
        bono = (pagocontado == 1)? 50 : 0;
        montofinal =pensionbase - montodescuento - bono;
        
        System.out.println("\n---DESGLOSE DE MATRICULA---");
        System.out.printf("Pension base: S/ %.2f\n", pensionbase);
        System.out.printf("Descuento por promedio ponderado (%.0f%%): S/ %.2f\n", descuento * 100, montodescuento);
        System.out.printf("Bono pago al contado: S/ %.2f\n", bono);
        System.out.printf("Monto final a pagar: S/ %.2f\n", montofinal);
        System.out.println("-----------------------------");
        
        leer.close();
    }
    
}
