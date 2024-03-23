/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_operadores_logicos;

/**
 *
 * @author Jennis
 */
public class EVA2_11_OPERADORES_LOGICOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean hayMoney, DiaChido;
        //para hacer la carne asada se necesita;
        //qur haya dinero y un buen clima
        hayMoney = false;
                DiaChido = false;
                System.out.println("1.NO HAY DINERO Y  NO HAY BUEN CLIMA");
                if((hayMoney == true) && (DiaChido == true))
            System.out.println("Se armo la carnita asada");
                else
                    System.out.println("Nimodo tortilla con sal");
              
        //OPCION 2
        hayMoney = false;
                DiaChido = true;
                System.out.println("2. NO HAY DINERO Y  HAY BUEN CLIMA");
                if((hayMoney == true) && (DiaChido == true))
            System.out.println("Se armo la carnita asada");
                else
                    System.out.println("Nimodo tortilla con sal");
              
      //OPCION 3
        hayMoney = true;
                DiaChido = false;
                System.out.println("3. HAY DINERO Y NO HAY BUEN CLIMA");
                if((hayMoney == true) && (DiaChido == true))
            System.out.println("Se armo la carnita asada");
                else
                    System.out.println("Nimodo tortilla con sal");
                //OPCION 4
        
        hayMoney = true;
                DiaChido = true;
                System.out.println("4.HAY DINERO Y HAY BUEN CLIMA");
                if((hayMoney == true) && (DiaChido == true))
            System.out.println("Se armo la carnita asada");
                else
                    System.out.println("Nimodo tortilla con sal");
    }
    
}
