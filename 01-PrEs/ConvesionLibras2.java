package EstructurasDeControl;

import javax.swing.*;

public class ConvesionLibras2 {
    public static void main(String[] args) {
        //Declaracion de constantes
        final double FACTOR_CONVERSION = 0.454;

        //Declaracion de variables de 3 numeros enteros a convertir
        double numero1 = 10.0;
        double numero2 = 50.0;
        double numero3 = 100.0;
        String salida = "";

        //Solicitar los 3 numeros a calcular
        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce algun numero: "));
        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce algun numero: "));
        numero3 = Double.parseDouble(JOptionPane.showInputDialog("Introduce algun numero: "));

        salida = numero1 + " kg" + " en Libras es: " + String.format("%.3f", numero1 / FACTOR_CONVERSION) +
                "\n" + numero2 + " kg" + " en Libras es: " + String.format("%.3f", numero2 / FACTOR_CONVERSION) +
                "\n" + numero3 + " kg" + " en Libras es: " + String.format("%.3f", numero3 / FACTOR_CONVERSION);

        JOptionPane.showMessageDialog(null, salida);
    }
}
