/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_7_par_impar;

import java.util.Scanner;

/**
 *
 * @author Jennis
 */
public class EVA2_7_PAR_IMPAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, divi, resi;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introducir un numero entero:");
        num = captu.nextInt();
        divi = num / 2;
        System.out.println("Division entera de " + num +  "/ 2 =  "+ divi);
        resi = num % 2;
        System.out.println("Division entera de " + num +  "% 2 =  "+ resi);
        if(resi == 1)
        System.out.println("Es impar");
        else
            System.out.println("El numero es par");
           
    }
    
}
