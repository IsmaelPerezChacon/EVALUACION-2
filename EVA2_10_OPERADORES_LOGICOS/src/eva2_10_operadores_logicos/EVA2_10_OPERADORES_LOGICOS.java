/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_operadores_logicos;

import java.util.Scanner;

/**
 *
 * @author Jennis
 */
public class EVA2_10_OPERADORES_LOGICOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           double moneda;
          int elec;
        Scanner captu = new Scanner (System.in);
        System.out.println("Eliga su preferencia 1 = CARA 0 = CRUZ");
        elec = captu.nextInt();
       
        moneda = Math.random();
        System.out.println("El valor de la moneda es " + moneda);
        //O,5 ES LA MITAD DE RANGO, MAYOR QUE 0.5 CARA, MENOR ES CRUZ
        if(moneda > 0.5 && elec == 0)
            System.out.println("Adivinanste, es cara");
        else
            if(moneda <= 0.5 && elec== 1)
                System.out.println("Adivinaste, ez cruz");
        else
                System.out.println("Sigue intentando!!");
        
    }
    
}
