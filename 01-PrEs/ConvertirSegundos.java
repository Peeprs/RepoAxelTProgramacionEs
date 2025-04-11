package EstructurasDeControl;
import javax.swing.*;
public class ConvertirSegundos {
    public static void main(String[] args) {
        // Declaración de variables
        int segundos= 0, minutos= 0, segundosRestantes= 0;

        // Pedir el número de segundos
        segundos = Integer.parseInt(JOptionPane.showInputDialog
                ("Ingrese el número de segundos:"));

        // Calcular los minutos y segundos
        minutos = segundos / 60; // Dividir
        segundosRestantes = segundos % 60;

        JOptionPane.showMessageDialog(null,
                segundos + " segundos son equivalentes a " +
                        minutos + " minutos y " + segundosRestantes + " segundos.");
    }
}
