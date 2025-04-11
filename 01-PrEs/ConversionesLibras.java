package EstructurasDeControl;/*
* Escribit un programa que convierte tres numeros
* de kilogramos a libras ( 1 Libra = 0.454)
*
* */

import javax.swing.*;

public class ConversionesLibras {
    public static void main(String[] args) {
        //Declaracion de constantes
        final double FACTOR_CONVERSION = 0.454;

        //Declaracion de variables de 3 numeros enteros a convertir
        double numero1 = 10.0;
        double numero2 = 50.0;
        double numero3 = 100.0;
        double c1 = 0.0;
        double c2 = 0.0;
        double c3 = 0.0;
        String salida = "";

        //Solicitar los 3 numeros a calcular
        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce algun numero: "));
        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce algun numero: "));
        numero3 = Double.parseDouble(JOptionPane.showInputDialog("Introduce algun numero: "));

        //Proceso de conversion
        c1 = numero1 / FACTOR_CONVERSION;
        c2 = numero2 / FACTOR_CONVERSION;
        c3 = numero3 / FACTOR_CONVERSION;

        salida = numero1 + "kg" + " en Libras es: " + String.format("%.3f", c1) +
                "\n" + numero2 + "kg" + " en Libras es: " + String.format("%.3f", c2) +
                "\n" + numero3 + "kg" + " en Libras es: " + String.format("%.3f", c3);

        JOptionPane.showMessageDialog(null, salida);
    }
}
