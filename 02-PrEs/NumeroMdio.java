package EstructurasDeControl;
import javax.swing.JOptionPane;
public class NumeroMdio {
    public static void main(String[] args) {
        // Declaración de variables
        int num1 = 0, num2 = 0, num3 = 0;

        while (true) {
            // Leer tres números diferentes
            num1 = Integer.parseInt(JOptionPane.showInputDialog
                    ("Ingrese el primer número:"));
            num2 = Integer.parseInt(JOptionPane.showInputDialog
                    ("Ingrese el segundo número:"));
            num3 = Integer.parseInt(JOptionPane.showInputDialog
                    ("Ingrese el tercer número:"));

            // Comprobar si los números son diferentes
            if (num1==num2 || num1==num3 || num2==num3) {
                JOptionPane.showMessageDialog(null, "Los números deben ser diferentes.");
            } else {
                // Determinar el número medio
                int medio;

                // Comparaciones
                if ((num1>=num2 && num1<=num3) || (num1<=num2 && num1>=num3)) {
                    medio = num1;
                } else if ((num2>=num1 && num2<=num3) || (num2<=num1 && num2>=num3)) {
                    medio = num2;
                } else {
                    medio = num3;
                }

                JOptionPane.showMessageDialog
                        (null, "El número medio es: " + medio);
            }
        }
    }
}