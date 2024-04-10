/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20_for_3;

import java.util.Scanner;

/**
 *
 * @author Jennis
 */
public class EVA2_20_FOR_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int respuesta;
         String  mensaj;
        Scanner captu = new Scanner(System.in);
                 
        System.out.println("Elegir mensaje a presentar");
                       mensaj = captu.nextLine();
        
                 System.out.println("¿Cuantas veces repetiras tu respuesa?");
                 respuesta = captu.nextInt();
    
         for(int i = 1; i <= respuesta; i ++){
             System.out.println(mensaj);
            
             
         }
    }
    
}
