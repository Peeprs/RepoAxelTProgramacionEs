package EstructurasDeControl;

import javax.swing.*;

public class AreaCircular {
    public static void main(String[] args) {
        final double PI = 3.1416;
        double r = 0.0;
        double area = 0.0;
        String salida = "";

        r = Double.parseDouble(JOptionPane.showInputDialog
                ("Introduce el radio del circulo: "));
        area = PI * r * r;
        JOptionPane.showMessageDialog
                (null,
                        "El area del circulo es: " + area + " cm");
    }
}