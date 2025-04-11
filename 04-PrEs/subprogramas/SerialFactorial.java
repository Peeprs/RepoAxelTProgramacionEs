package mx.edu.uttt.subprogramas;

import javax.swing.*;

public class SerialFactorial {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(factorial());
    }
    public static long factorial(){
        int fact = 1;
        for (int i=1; i<=n; i++) {
            fact*=i;
        }
        return fact;
    }
    public static int pedirNumFact(){
        return Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de N: "));
    }
}
