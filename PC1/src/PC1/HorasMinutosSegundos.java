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
public class HorasMinutosSegundos {
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        int horas, minutos, segundos;
        System.out.println("Ingrese horas: ");
        horas=leer.nextInt();
        System.out.println("Ingrese minutos: ");
        minutos=leer.nextInt();
        System.out.println("Ingrese segundos: ");
        segundos=leer.nextInt();
        
        if (horas < 0 || horas > 23 || minutos < 0 || minutos > 59 || segundos < 0 || segundos > 59){
            System.out.println("Error: Hora invalida");
            return;
        }
        segundos++;
        if(segundos == 60){
            segundos = 0;
            minutos++;
        }
        if(minutos == 60){
            minutos = 0;
            horas++;
        }
        if(horas == 24){
            horas = 0;
        }
        System.out.printf("Hora siguiente: %02d:%02d:%02d", horas, minutos, segundos);
    }
}
