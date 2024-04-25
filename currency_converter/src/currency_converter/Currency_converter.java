/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package currency_converter;

import java.util.Scanner;

class USD{
    public static void convertUSD(double idr){
        Scanner myScanner = new Scanner(System.in);
        double convert = idr / 16173;
        System.out.println("Conversion result to USD is " + convert);
    }
}

class SGD{
    public static void convertSGD(double idr){
        Scanner myScanner = new Scanner(System.in);
        double convert = idr / 11905;
        System.out.println("Conversion result to SGD is " + convert);
    }
}

class JPY{
    public static void convertJPY(double idr){
        Scanner myScanner = new Scanner(System.in);
        double convert = idr / 104;
        System.out.println("Conversion result to JPY is " + convert);
    }
}


/**
 *
 * @author ANNISA D YANSAF
 */
public class Currency_converter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("WELCOME TO CURRENCY CONVERSION APP!!");
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Input amount (in IDR) ");
        double idr = myScanner.nextInt();
        myScanner.nextLine();
        System.out.println("Choose your conversion currency\nA. USD\nB. SGD\nC. JPY");
        String choice = myScanner.nextLine();
        if (choice.equalsIgnoreCase("a")){
                    USD.convertUSD(idr);
        }else if (choice.equalsIgnoreCase("b")){
                    SGD.convertSGD(idr);
        }else if (choice.equalsIgnoreCase("c")){
                    JPY.convertJPY(idr);
        }
        
    }
    
}
