package CicloFor;

import javax.swing.JOptionPane;
public class CalifAcumuladas {
    public static void main(String[] args) {
        double acumCalif = 0.0;
        int numCalif = 0;

        numCalif = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de calificaciones: "));

        for (int i=0; i<numCalif; i++){
            acumCalif = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion: " + (i + 1)));
            acumCalif = acumCalif + numCalif;
        }
        JOptionPane.showMessageDialog(null, "La sumatoria es: " + numCalif);
    }
}
