package CicloFor;
import javax.swing.JOptionPane;
public class DiezCantidades {
    public static void main(String[] args) {
        // Definir variables e inicializarlas en 0
        double suma = 0;
        double cantidad = 0;

        for (int i = 1; i <= 10; i++) {
            cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad " + i + ":"));
            suma += cantidad;
        }

        JOptionPane.showMessageDialog(null, "La suma de las 10 cantidades es: " + suma);
    }
}
