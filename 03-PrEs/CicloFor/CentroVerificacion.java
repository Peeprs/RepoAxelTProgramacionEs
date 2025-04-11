package CicloFor;
import javax.swing.*;
public class CentroVerificacion {
    public static void main(String[] args) {
        // Definir las variables
        int n = 25; // Número de automóviles
        double puntosContaminantes, totalPuntos = 0;
        double maxContaminacion, minContaminacion;
        String resultado = "";


        puntosContaminantes = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los puntos de contaminantes del automóvil 1:"));
        maxContaminacion = puntosContaminantes;
        minContaminacion = puntosContaminantes;

        totalPuntos += puntosContaminantes;

        for (int i = 2; i <= n; i++) {
            puntosContaminantes = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los puntos de contaminantes del automóvil " + i + ":"));

            totalPuntos += puntosContaminantes;


            if (puntosContaminantes > maxContaminacion) {
                maxContaminacion = puntosContaminantes;
            }

            if (puntosContaminantes < minContaminacion) {
                minContaminacion = puntosContaminantes;
            }
        }
        double promedio = totalPuntos / n;

        resultado += "Promedio de puntos de contaminación: " + promedio + "\n" +
                "Automóvil con más contaminación: " + maxContaminacion + " puntos\n" +
                "Automóvil con menos contaminación: " + minContaminacion + " puntos\n";

        JOptionPane.showMessageDialog(null, resultado);
    }
}
