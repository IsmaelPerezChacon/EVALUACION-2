/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_adivinar_con_while;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author Jennis
 */
public class EVA2_24_ADIVINAR_CON_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int nume = 5;
        int valor= 0;
        Scanner captu = new Scanner(System.in);
       
        
        while(nume != valor) {
       System.out.println("¿Cual es el numero? Entre 1 y 10");
            valor = captu.nextInt();
    }
        System.out.println("CAPOO !!Adivinaste!!");
            
    }
    
}
