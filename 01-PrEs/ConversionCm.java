package EstructurasDeControl;

import javax.swing.*;

public class ConversionCm {
    public static void main(String[] args) {

        final double ML_X_PULGA = 25.4;
        double pulgadas1 = 2;
        double pulgadas2 = 5;
        double pulgadas3 = 10;

        String salida = "Conversión de pulgadas a milímetros:\n" +
                "2 pulgadas = " + pulgadas1 + " mm\n" +
                "5 pulgadas = " + pulgadas2 + " mm\n" +
                "10 pulgadas = " + pulgadas3 + " mm";

        JOptionPane.showMessageDialog(null, salida);
    }
}
