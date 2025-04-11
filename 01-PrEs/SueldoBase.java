package EstructurasDeControl;
import javax.swing.*;
public class SueldoBase {
    public static void main(String[] args) {
        // Declarar las variables a 0.0
        double sueldoBase = 0.0;
        double venta1 = 0.0, venta2 = 0.0, venta3 = 0.0;
        double comision1 = 0.0, comision2 = 0.0, comision3 = 0.0;
        double totalComisiones = 0.0, totalMensual = 0.0;

        String salida = "Comisión de la primera venta: " + comision1 +
        "\nComisión de la segunda venta: " + comision2 +
                "\nComisión de la tercera venta: " + comision3 +
                "\nTotal de comisiones: " + totalComisiones +
                "\nTotal mensual (sueldo base + comisiones): " + totalMensual;

        // Solicitar los datos
        sueldoBase = Double.parseDouble
                (JOptionPane.showInputDialog("Ingrese el sueldo base del vendedor:"));
        venta1 = Double.parseDouble
                (JOptionPane.showInputDialog("Ingrese el valor de la primera venta:"));
        venta2 = Double.parseDouble
                (JOptionPane.showInputDialog("Ingrese el valor de la segunda venta:"));
        venta3 = Double.parseDouble
                (JOptionPane.showInputDialog("Ingrese el valor de la tercera venta:"));

        // Calcular el 10% de cada venta
        comision1 = venta1 * 0.10;
        comision2 = venta2 * 0.10;
        comision3 = venta3 * 0.10;

        totalComisiones = comision1 + comision2 + comision3;
        totalMensual = sueldoBase + totalComisiones;

        JOptionPane.showMessageDialog(null, salida);
    }
}
