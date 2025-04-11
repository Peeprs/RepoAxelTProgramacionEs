package CiclosLibes;
import javax.swing.*;
public class TodoConjunto {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de números a ingresar:"));

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número 1:"));
        int mayor = numero;
        int menor = numero;

        for (int i = 2; i <= n; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número " + i + ":"));

            if (numero > mayor) {
                mayor = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        JOptionPane.showMessageDialog(null, "El número mayor es: " + mayor + "\nEl número menor es: " + menor);
    }
}
