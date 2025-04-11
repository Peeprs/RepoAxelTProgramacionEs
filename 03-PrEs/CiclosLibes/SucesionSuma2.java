package CiclosLibes;
import javax.swing.*;
public class SucesionSuma2 {
    public static void main(String[] args) {
        int N = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de N:"));
        int suma = 0;

        System.out.println("Sucesión:");
        for (int i = 1; i <= N; i++) {
            int cuadrado = i * i;
            System.out.print(cuadrado + " ");
            suma += cuadrado;
        }

        JOptionPane.showMessageDialog(null,
                "La suma de la sucesión es: " + suma);
    }
}
