package CicloWhile;
import javax.swing.*;
public class ValorConjunto1 {
    public static void main(String[] args) {
        // Definir las variables
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de elementos:"));
        double menorValor = 0;
        int i = 1;

        while (i <= n) {
            double numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número " + i + ":"));

            if (i == 1) {
                menorValor = numero;
            } else if (numero < menorValor) {
                menorValor = numero;
            }
            i++;
        }
        JOptionPane.showMessageDialog(null, "El menor valor ingresado es: " + menorValor);
    }
}
