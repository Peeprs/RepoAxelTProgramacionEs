package CicloWhile;
import javax.swing.*;
public class ValorConjunto2 {
    public static void main(String[] args) {
        // Definir las variables
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de elementos:"));
        double mayorValor = 0;
        int i = 1;

        while (i <= n) {

            double numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número " + i + ":"));

            if (i == 1) {
                mayorValor = numero;
            } else if (numero > mayorValor) {
                mayorValor = numero;
            }
            i++;
        }
        JOptionPane.showMessageDialog(null, "El mayor valor ingresado es: " + mayorValor);
    }
}
