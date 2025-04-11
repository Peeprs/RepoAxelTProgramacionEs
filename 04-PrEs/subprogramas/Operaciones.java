package mx.edu.uttt.subprogramas;

import javax.swing.*;

public class Operaciones {
    public static void main(String[] args) {
        iniciar();
    }
    public static double sumar(double num1, double num2){
        double  suma = num1 + num2;
        return suma;
    }
    public static double restar(double num1, double num2){
        return num1 - num2;
    }
    public static double multiplicar(double num1, double num2){
        return num1 * num2;
    }
    public static double dividir(double num1, double num2){
        double division = 0.0;
        if (num2!=0){
            return num1 / num2;
        }else{
            return 0;
        }
    }
    public  static boolean esMayor(double num1, double num2){

       //Utilizando if else
        //if (num1>=num2){
          //  return true;
        //}else {
          //  return false;
        //}

        //return (num1>num2)?true:false;

        //Retornar directamente sin estructuras de control
        return num1>num2;
    }
    public static long factorial(int n){
        int fact = 1;
        for (int i=1; i<=n; i++) {
            fact*=i;
        }
        return fact;
    }
    public static String menu(){
        return "Menu\n" +
                "1) Suma\n" +
                "2) Resta\n" +
                "3) Multiplicacion\n" +
                "4) Division\n" +
                "5) Factitorial\n" +
                "6) Es Mayor\n" +
                "7) Salir\n" +
                "Elegir opcion: ";
    }
    public static String calcular(String opcion){
        double num1 = 0.0;
        double num2 = 0.0;
        switch (opcion){
            case "1":
                JOptionPane.showMessageDialog(null, sumar(solicitarNumero(), solicitarNumero2()));

                break;
            case "2":
                JOptionPane.showMessageDialog(null, restar(solicitarNumero(), solicitarNumero2()));
                break;
            case "3":
                JOptionPane.showMessageDialog(null, multiplicar(solicitarNumero(), solicitarNumero2()));
                break;
            case "4":
                JOptionPane.showMessageDialog(null, dividir(solicitarNumero(), solicitarNumero2()));
                break;
            case "5":
                JOptionPane.showMessageDialog(null, factorial(solicitarN()));
                break;
            case "6":
                JOptionPane.showMessageDialog(null, esMayor(solicitarNumero(), solicitarNumero2()));
                break;
            case "7":
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion No Valida");
        }
        return opcion;
    }
    public static double solicitarNumero(){
        return  Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero 1: "));
    }
    public static double solicitarNumero2() {
        return Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero 2: "));
    }
    public static int solicitarN() {
        return Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de N: "));
    }
    public static void iniciar(){
        String opcion = "";
        do {
            opcion = JOptionPane.showInputDialog(menu());
            if (opcion.equalsIgnoreCase("7")){
                JOptionPane.showMessageDialog(null, "Adios =)");
                break;
            }

            calcular(opcion);
        }while(true);
    }
}
