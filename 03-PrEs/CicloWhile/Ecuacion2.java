package CicloWhile;

import javax.swing.*;

public class Ecuacion2 {
    public static void main(String[] args) {
        //Declaracion de variables
        double s = 0.0;
        double x = 0.0;
        double deno = 0;
        double subdeno = 0;
        int n = 0;
        int i = 0;

        n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de vueltas: "));

        i = 1;
        deno = 1.0;
        subdeno = 3.0;
        while(i<=n) {
            x = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de x: "));
            if (i % 2 == 0) {
                s -= Math.pow(x, 3.0/subdeno)/deno;
            } else {
                s += Math.pow(x, 3.0/subdeno)/deno;
            }
            subdeno += 3;
            deno += 2;
            i++;
        }
        JOptionPane.showMessageDialog(null, "El resultado es: " + s);
    }
}
