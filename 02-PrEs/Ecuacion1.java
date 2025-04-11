package Ejemplos;
import javax.swing.*;
public class Ecuacion1 {
    public static void main(String[] args) {
        //Declarar variables
        int n = 0;
        int denSup = 0;
        int deno = 0;
        double x = 0.0;
        double s = 0.0;
        String salida = "";

        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("Numero de fracciones: "));
            if (n < 0) {
                JOptionPane.showMessageDialog(null, "Ingrese un numero positivo en n");
            }
            x = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de x: "));
            if (x < 0){
                JOptionPane.showMessageDialog(null, "Ingrese un numero positivo en x");
            }
        } while (n < 0 || x < 0.0);

        //Inicializar variables
        denSup = 3;
        deno = 1;

        for (int i = 1; i <n; i++){
            s = Math.pow(x, 3.0/denSup)/deno;
            denSup += 3;
            deno += 2;
        }
        JOptionPane.showMessageDialog(null, "El valor de S: " + String.format("%.3f", s));
    }
}