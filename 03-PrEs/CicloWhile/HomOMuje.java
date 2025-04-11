package CicloWhile;
import javax.swing.*;
public class HomOMuje {
    public static void main(String[] args) {
        // Definir variables
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de personas:"));
        int hombres = 0, mujeres = 0;
        int i = 1;

        while (i <= n) {
            String genero = JOptionPane.showInputDialog("Ingrese el género de la persona " + i + " (Hombre/Mujer):").toLowerCase();

            if (genero.equals("hombre")) {
                hombres++;
            } else if (genero.equals("mujer")) {
                mujeres++;
            } else {
                JOptionPane.showMessageDialog(null, "Entrada no válida. Por favor ingrese 'Hombre' o 'Mujer'.");
                continue;
            }
            i++;
        }

        String resultado = "Número de hombres: " + hombres +
                "\nNúmero de mujeres: " + mujeres;
        JOptionPane.showMessageDialog(null, resultado);
    }
}
