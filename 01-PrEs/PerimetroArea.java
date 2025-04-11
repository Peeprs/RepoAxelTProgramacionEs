package EstructurasDeControl;

import javax.swing.*;

public class PerimetroArea {
    public static void main(String[] args) {
        final double PI = 3.1416;
        double radio = 3.2;
        double perimetro = 2 * PI * radio;
        double area = PI * radio * radio;
        String salida = "El radio es: " + radio + " pulgadas\n" +
                "El Perimetro es: " + perimetro + " pulgadas\n" +
                "El Area es: " + area;;

        JOptionPane.showMessageDialog(null, salida);
    }
}
