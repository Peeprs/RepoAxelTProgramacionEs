package CicloWhile;
import javax.swing.*;
public class ColorPlaca {
    public static void main(String[] args) {
        // Definir las variables
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de autos que entran a la ciudad:"));
        int amarilla = 0, rosa = 0, roja = 0, verde = 0, azul = 0;
        int i = 1;

        while (i <= n) {
            int ultimoDigito = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el último dígito de la placa del automóvil " + i + ":"));

            if (ultimoDigito == 1 || ultimoDigito == 2) {
                amarilla++;
            } else if (ultimoDigito == 3 || ultimoDigito == 4) {
                rosa++;
            } else if (ultimoDigito == 5 || ultimoDigito == 6) {
                roja++;
            } else if (ultimoDigito == 7 || ultimoDigito == 8) {
                verde++;
            } else if (ultimoDigito == 9 || ultimoDigito == 0) {
                azul++;
            } else {
                JOptionPane.showMessageDialog(null, "Dígito no válido. Debe ser un número entre 0 y 9.");
                continue;
            }
            i++;
        }
        String resultado = "Cantidad de autos con calcomanía amarilla: " + amarilla + "\n" +
                "Cantidad de autos con calcomanía rosa: " + rosa + "\n" +
                "Cantidad de autos con calcomanía roja: " + roja + "\n" +
                "Cantidad de autos con calcomanía verde: " + verde + "\n" +
                "Cantidad de autos con calcomanía azul: " + azul;

        JOptionPane.showMessageDialog(null, resultado);
    }
}
