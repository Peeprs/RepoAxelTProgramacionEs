package EstructurasDeControl;
import javax.swing.*;
public class ConversionLongitudes {
    public static void main(String[] args) {
        // Declaración de variables
        double pies = 0.0, yardas= 0.0, pulgadas= 0.0, centimetros= 0.0, metros= 0;

        // Pedir el número de pies
        pies = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número de pies:"));

        // Realizar las conversiones
        yardas = pies / 3;
        pulgadas = pies * 12;
        centimetros = pulgadas * 2.54;
        metros = centimetros / 100;

        String mensaje = pies + " pies equivalen a:\n" +
                yardas + " yardas\n" +
                pulgadas + " pulgadas\n" +
                centimetros + " centímetros\n" +
                metros + " metros";

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
