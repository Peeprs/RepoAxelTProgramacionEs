package EstructurasDeControl;
import javax.swing.JOptionPane;
public class DescuentoProvee {
    public static void main(String[] args) {
        // Declaración de variables
        double precio = 0.0, precioConDescuento = 0.0, precioFinal = 0.0;
        String marca = "";

        // Pedir el precio del aparato
        precio = Double.parseDouble(JOptionPane.showInputDialog
                ("Ingrese el precio del aparato:"));

        // Pedir la marca del aparato
        marca = JOptionPane.showInputDialog
                ("Ingrese la marca del aparato:");

        // Calcular el descuento
        if (precio >= 2000) {
            precioConDescuento = precio * 0.90;
        } else {
            precioConDescuento = precio;
        }

        // Aplicar el descuento
        if (marca.equalsIgnoreCase("NOSY")) {
            precioConDescuento = precioConDescuento * 0.95;
        }

        // Calcular el IVA
        precioFinal = precioConDescuento * 1.16;

        JOptionPane.showMessageDialog(null,
                "El precio final a pagar es: $" + precioFinal);
    }
}
