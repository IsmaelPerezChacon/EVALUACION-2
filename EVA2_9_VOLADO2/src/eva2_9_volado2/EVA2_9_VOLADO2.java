/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_volado2;

import java.util.Scanner;

/**
 *
 * @author Jennis
 */
public class EVA2_9_VOLADO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double moneda;
        int elec;
      
        
     Scanner captu = new Scanner (System.in);
        System.out.println("Eliga su preferencia 1 = CARA 2 = CRUZ");
        elec = captu.nextInt();
        moneda = Math.random();
        System.out.println("El valor de la moneda es " + moneda);
        if (moneda > 0.5)
            System.out.println("Cara");
        else
            System.out.println("Cruz");
        if (moneda > 0.5 && elec ==2)
            System.out.println("You are a winner!!");
        else{
            if(moneda < 0.5 && elec == 1)
                System.out.println("You are a winner!!");
            else
                System.out.println("WASTED");
                
        }
     
        
    }
    
}
