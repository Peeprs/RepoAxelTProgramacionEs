package Ejemplos;

import javax.swing.*;
public class CalculadoraSencilla {
    public static void main(String[]args){
     
        //Declaracion de variables
        double numero1 = 0.0, numero2 = 0.0;
        String menu = "";
        String opcion = "", resultado= "";
        
        //Menu
        menu = "MENU PRINCIPAL\n" +
                "1) Suma\n" +
                "2) Resta\n" +
                "3) Multiplicar\n" +
                "4) Dividir\n" +
                "5) Modulo" +
                "Elige la opcion: ";
        
        //opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
        //JOptionPane.showMessageDialog(null, opcion);
        
        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero: "));
        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
        
        //opcion = opcion.toUpperCase();
        
        if(numero2>0.0){
        switch(opcion){
            case "a":
            case "A":
                resultado = "El Modulo es: " + (numero1 + numero2);
                //JOptionPane.showMessageDialog(null, "La Suma es: " + resultado);
                break;
            case "b":
            case "B":
                resultado = "El Modulo es: " + (numero1 - numero2);
                //JOptionPane.showMessageDialog(null, "La Resta es: " + resultado);
                break;
            case "c":
            case "C":
                resultado = "El Modulo es: " + (numero1 * numero2);
                //JOptionPane.showMessageDialog(null, "La Multiplicacion es: " + resultado);
                break;
            case "d":
            case "D":
                //Dividir
                resultado = "El Modulo es: " + (numero1 / numero2);
                //JOptionPane.showMessageDialog(null, "La Division es: " + resultado);
                break;
            case "e":
            case "E":
                //Modulo
                resultado = "El Modulo es: " + (numero1 % numero2);
                //JOptionPane.showMessageDialog(null, "El modulo es: " + resultado);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Vuelve a digitar un numero valido");
        }
        
        JOptionPane.showMessageDialog(null, resultado);
   
        }else{
            JOptionPane.showMessageDialog(null, "El numero 2 no puede ser 0 negativo");
        }    
        
    }
}
