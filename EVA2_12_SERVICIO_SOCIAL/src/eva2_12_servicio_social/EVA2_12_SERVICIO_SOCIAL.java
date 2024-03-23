/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_servicio_social;

import java.util.Scanner;

/**
 *
 * @author Jennis
 */
public class EVA2_12_SERVICIO_SOCIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int creditos, semestre;
        Scanner captu = new Scanner (System.in);
        System.out.println("¿Que semestre cursas?");
        semestre = captu.nextInt();
        System.out.println("¿Cuantos creditos llevas?");
        creditos = captu.nextInt();
        //INDICAR SI PUEDE O NO REALIZAR EL SERVICIO SOCIAL
        //IR EN 6TO SEMESTRE O SUPERIOR(semestre >=6)
        //TENER ALMENOS 150 CREDITOS (creditos >=150)
        if((semestre >= 6)&&(creditos >= 150))
            System.out.println("Puedes hacer tu servicio social");
        else
            System.out.println("No puedes realizar tu servicio social");
        
    }
    
}
