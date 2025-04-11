package CicloFor;
import javax.swing.*;
public class ExpendioNaranjas {
    public static void main(String[] args) {
        int n = 15;
        double descuento = 0.15;
        double precioPorKilo = 20.0;
        double kilos, totalPorCliente, totalTiendas = 0;
        String resultado = "";

        for (int i = 1; i <= n; i++) {
            kilos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los kilos comprados por el cliente " + i + ":"));

            if (kilos > 10) {
                totalPorCliente = kilos * precioPorKilo * (1 - descuento);
            } else {
                totalPorCliente = kilos * precioPorKilo;
            }
            resultado += "Cliente " + i + ": Kilos: " + kilos + " - Total a pagar: $" + totalPorCliente + "\n";

            totalTiendas += totalPorCliente;
        }

        resultado += "\nTotal recibido por la tienda: $" + totalTiendas;

        JOptionPane.showMessageDialog(null, resultado);
    }
}
