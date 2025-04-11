package EstructurasDeControl;/*
*  Calcular el resultado de la expresion n = x + y / y - 1
* para los valores x y y cualesquiera
*
* */

import javax.swing.*;

public class Expresion {
    public static void main(String[] args) {

        //Declaracion de variables
        double x = 0.0;
        double y = 0.0;
        double n = 0.0;
        String salida = "";

        //Solicitud de valores x y y
        x = Double.parseDouble(JOptionPane.showInputDialog
                ("Introduce el valor de x: "));
        y = Double.parseDouble
                (JOptionPane.showInputDialog("Introduce el valor de y: "));

        n = (x + y) / (y - 1);

        //Proceso y ejecucion
        salida =  "El valor de x es: " + String.format("%.3f", n)+
                "\n" + "El valor de y es: " + n ;

        JOptionPane.showMessageDialog(null, salida);
    }
}
