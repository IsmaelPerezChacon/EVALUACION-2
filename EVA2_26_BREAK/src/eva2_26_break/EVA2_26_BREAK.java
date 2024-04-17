/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_26_break;

import java.util.Scanner;

/**
 *
 * @author Jennis
 */
public class EVA2_26_BREAK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String usr,psw;
        
        String USR = "ADMIN";
        String PSW = "ADMIN";
       Scanner captu = new Scanner(System.in);
       
        //Como es un control de accceso, debemnmos preguntar un numero
        //indeterminado de veces, hasta que el usuario y contraseña 
//sean correctos
while(true){
   
     System.out.println("Introducir Usuario");
        usr = captu.nextLine();
         System.out.println("introducir Contraseña");
        psw = captu.nextLine();
    
if(usr.equals(USR)&&psw.equals(PSW))
     System.out.println("Welcome vato to the system");
else 
     System.out.println("OH, OH");
   break;

    
}
   
    }
 }
