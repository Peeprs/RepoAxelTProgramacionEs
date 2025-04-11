package CiclosLibes;
import javax.swing.*;
public class Impares {
    public static void main(String[] args) {
        String mensaje = "Números impares entre 0 y 100:\n";

        for (int i = 1; i <= 100; i += 2) {
            mensaje += i + "\n";
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
