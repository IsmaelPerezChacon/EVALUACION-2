/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_7_volado;

/**
 *
 * @author Jennis
 */
public class EVA2_7_VOLADO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //numero aleatorio en java;
        //valores entre 0 y 1
        //0.313534354354
        //0.635345345
      double  moneda;
        moneda = Math.random();
        System.out.println("La moneda dio=" + moneda);
        //0.5 es la mitad del rango
        if(moneda > 0.5)
            System.out.println("CARA");
        else
            System.out.println("CRUZ");
    }
    
}
