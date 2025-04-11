package CicloFor;
import javax.swing.*;
public class TablaMulti {
    public static void main(String[] args) {
        // Definir variables
        int numero = 0, producto = 0;
        String resultado = "";

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número para calcular su tabla de multiplicar:"));

        for (int i = 1; i <= 10; i++) {
            producto = numero * i;
            resultado += numero + " × " + i + " = " + producto + "\n"; // Acumular resultado en un string
        }
        JOptionPane.showMessageDialog(null, "Tabla de multiplicar del " + numero + ":\n\n" + resultado);
    }
}
