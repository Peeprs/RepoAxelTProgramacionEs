package EstructurasDeControl;
import javax.swing.JOptionPane;
public class PromocionLlantas {
    public static void main(String[] args) {
        // Declaración de variables
        int cantidadLlantas = 0;
        double precioPorLlantas = 0.0, totalCompra = 0.0;

        // Pedir la cantidad de llantas
        cantidadLlantas = Integer.parseInt(JOptionPane.showInputDialog
                ("Ingrese la cantidad de llantas que va a comprar: "));

        // Determinar el precio por llanta
        if (cantidadLlantas < 5) {
            precioPorLlantas = 300;
        } else if (cantidadLlantas >= 5 && cantidadLlantas <= 10) {
            precioPorLlantas = 250;
        } else {
            precioPorLlantas = 200;
        }

        // Calcular el total de la compra
        totalCompra = cantidadLlantas * precioPorLlantas;

        String mensaje = "Resumen de la compra:\n" +
                "Cantidad de llantas: " + cantidadLlantas + "\n" +
                "Precio por llanta: $" + precioPorLlantas + "\n" +
                "Total a pagar: $" + totalCompra;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
