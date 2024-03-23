/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_else_if;

import java.util.Scanner;

/**
 *
 * @author Jennis
 */
public class EVA2_13_ELSE_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce el numero de la semana en numero (1-7)");
        dia = captu.nextInt();
        
        if(dia == 1)
            System.out.println("Dormingo");
        else if (dia == 2)
            System.out.println("San Lunes");
        if(dia == 3)
            System.out.println("Mamartes");
        else if (dia == 4)
            System.out.println("Miercolitors");
        if(dia == 5)
            System.out.println("Juevebes");
        else if (dia == 6)
            System.out.println("Veviernes");
        if(dia == 7)
            System.out.println("Sabadrink");
        else 
            System.out.println("El numero seleccionado no es un dia valido.");
        
        
            
            
        
    }
    
}
