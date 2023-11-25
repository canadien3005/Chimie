package Interface;

import element.*;

public class Commande {

    private static double AVOGADRO = (int) (6.022* Math.pow(10, 23));

    public static void main(String[] args) {
        getElement(52);
        getCharge(-2);
        getQuantity("5.984E25");
    }

    public static void getElement(int numero) {
        
    }

    public static void getCharge(int charge) {
        
    }

    public static void getQuantity(String quantity){

        getNombreElectron();
    }

    public static void getNombreElectron(){
        
    }

    public static String getResult(){
        return "";
    }

}
