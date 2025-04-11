package CiclosLibes;
import javax.swing.*;
public class Antecesor {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));

        int suma = 0;
        for (int i = 1; i < numero; i++) {
            suma += i;
        }
        JOptionPane.showMessageDialog(null, "La suma de los números que anteceden a " + numero + " es: " + suma);
    }
}
