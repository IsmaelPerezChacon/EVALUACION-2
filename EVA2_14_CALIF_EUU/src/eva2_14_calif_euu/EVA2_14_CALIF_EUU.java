/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_calif_euu;

import java.util.Scanner;

/**
 *
 * @author Jennis
 */
public class EVA2_14_CALIF_EUU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int calif;
       Scanner captu = new Scanner(System.in);
        System.out.println("Introduce tu calificacion (0-100)");
        calif = captu.nextInt();
               if(calif >=90 && calif <=100)
            System.out.println("Felicidades obtuviste: A");
        else if(calif >=80  && calif <=89)
            System.out.println("Obtuviste: B");
        else if(calif >= 70 && calif <=79)
            System.out.println("Obtuviste: C");
        else if (calif >= 60 && calif  <=69)
            System.out.println("Esfuerzate mas obtuviste: D");
        else if(calif  >= 50 && calif  <=59 )
            System.out.println("Obtuviste : F:(");
               else
            System.out.println("No es una calificacion valida");
         
    }
    
}
