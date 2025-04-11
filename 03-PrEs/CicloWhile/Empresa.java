package CicloWhile;
import javax.swing.JOptionPane;
public class Empresa {
    public static void main(String[] args) {
        // Definir las variables
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de vendedores:"));
        double sueldoBase, comisionPorVenta = 0.10;
        double totalComisiones, totalSueldo, totalEmpresa = 0;
        String resultado = "";

        for (int i = 1; i <= n; i++) {
            sueldoBase = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo base del vendedor " + i + ":"));
            double ventasTotales = 0;

            for (int j = 1; j <= 3; j++) {
                ventasTotales += Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la venta " + j + " del vendedor " + i + ":"));
            }

            totalComisiones = ventasTotales * comisionPorVenta;
            totalSueldo = sueldoBase + totalComisiones;
            totalEmpresa += totalSueldo;

            resultado += "Vendedor " + i + ":\n" +
                    "Sueldo base: $" + sueldoBase + "\n" +
                    "Ventas totales: $" + ventasTotales + "\n" +
                    "Comisiones: $" + totalComisiones + "\n" +
                    "Total a pagar: $" + totalSueldo + "\n\n" +
                    "Total que pagará la empresa: $" + totalEmpresa;
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}
