package EstructurasDeControl;
import javax.swing.JOptionPane;
public class DescuentoComputadoras {
    public static void main(String[] args) {
        //Declaracion de variables
        int cantidadComputadoras;
        double precioUnidad = 11000; //
        double totalCompra = 0.0, descuento = 0.0, totalConDescuento= 0.0;

        // Pedir la cantidad de computadoras a comprar
        cantidadComputadoras = Integer.parseInt(JOptionPane.showInputDialog
                ("Ingrese la cantidad de computadoras que va a comprar: "));

        // Calcular el total
        totalCompra = cantidadComputadoras * precioUnidad;

        // Determinar el descuento de computadoras
        if (cantidadComputadoras < 5) {
            descuento = totalCompra * 0.10; // 10% de descuento
        } else if (cantidadComputadoras >= 5 && cantidadComputadoras < 10) {
            descuento = totalCompra * 0.20; // 20% de descuento
        } else {
            descuento = totalCompra * 0.40; // 40% de descuento
        }

        // Calcular el total con descuento
        totalConDescuento = totalCompra - descuento;

        String mensaje = "Resumen de la compra:\n" +
                "Cantidad de computadoras: " + cantidadComputadoras + "\n" +
                "Total sin descuento: " + totalCompra + "\n" +
                "Descuento aplicado: " + descuento + "\n" +
                "Total con descuento: " + totalConDescuento;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
