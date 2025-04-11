package EstructurasDeControl;
import javax.swing.*;
public class Ecuacion {
    public static void main(String[] args) {
        // Declaración de variables
        int x = 0;
        double y = 0;

        // Pedir el valor de X
        x = Integer.parseInt(JOptionPane.showInputDialog
                ("Ingrese el valor de X:"));

        // Calcular el valor de Y
        y = 3 * Math.pow(x, 2) + 7 * x - 15;

        JOptionPane.showMessageDialog(null,
                "El valor de X es: " + x +
                         "\nEl valor de Y es: " + y);
    }
}
