package Interface;

import element.*;

public class Commande {

    private static double AVOGADRO = (6.022* Math.pow(10, 23));
    private static double IONS;
    private static double NbElectron; 
    private static Element element; 

    public static void main(String[] args) {
    	setElement(52);
        setCharge(-2);
        setQuantity("5.984E25");
        System.out.println(getResult());
    }

    public static void setElement(int numero) {
    	element = Elements.getElement(numero);
        
    }

    public static void setCharge(int charge) {
    	element.Ion(charge);
        
    }

    public static void setQuantity(String quantity){
        IONS = Double.parseDouble(quantity)* AVOGADRO;
        getNombreElectron();
       
        
    }

    public static void getNombreElectron(){
    	
        NbElectron = IONS*element.getNombreElectrons();
    }

    public static String getResult(){
        return "Nombre d'électron:"+ NbElectron ;
    }

}