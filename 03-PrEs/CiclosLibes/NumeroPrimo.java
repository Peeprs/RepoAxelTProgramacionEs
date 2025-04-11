package CiclosLibes;
import javax.swing.*;
public class NumeroPrimo {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));

        boolean esPrimo = true;

        if (numero <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }
        if (esPrimo) {
            JOptionPane.showMessageDialog(null, numero + " es un número primo.");
        } else {
            JOptionPane.showMessageDialog(null, numero + " no es un número primo.");
        }
    }
}
