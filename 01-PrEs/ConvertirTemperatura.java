package EstructurasDeControl;
import javax.swing.*;
public class ConvertirTemperatura {
    public static void main(String[] args) {
        // Declaración de variables
        double celsius= 0.0, fahrenheit= 0.0;

        // Pedir la temperatura
        celsius = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura en grados centígrados:"));

        // Calcular la temperatura
        fahrenheit = (9.0 / 5.0) * celsius + 32;

        JOptionPane.showMessageDialog(null,
                celsius + " grados centígrados son equivalentes a " +
                        fahrenheit + " grados Fahrenheit.");
    }
}
