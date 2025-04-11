package CiclosLibes;
import javax.swing.*;
public class SumaMulti {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de números:"));
        int sumaPositivos = 0;
        int multiplicacionNegativos = 1;
        boolean hayNegativos = false;

        for (int i = 1; i <= n; i++) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número " + i + ":"));

            if (numero > 0) {
                sumaPositivos += numero;
            } else if (numero < 0) {
                multiplicacionNegativos *= numero;
                hayNegativos = true;
            }
        }

        if (hayNegativos) {
            JOptionPane.showMessageDialog(null, "La multiplicación de los números negativos es: " + multiplicacionNegativos);
        } else {
            JOptionPane.showMessageDialog(null, "No se ingresaron números negativos.");
        }

        JOptionPane.showMessageDialog(null, "La suma de los números positivos es: " + sumaPositivos);
    }
}
