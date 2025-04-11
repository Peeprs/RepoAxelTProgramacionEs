package CiclosLibes;

import javax.swing.*;

public class SumaOrden {
    public static void main(String[] args) {
        int suma = 0;

        for (int i = 100; i >= 0; i-= 2) {
            suma += i;
        }
        JOptionPane.showMessageDialog
                (null, "La suma total de los numeros es " + suma);
    }
}
