package CicloFor;
import javax.swing.*;
public class EsONoEs {
    public static void main(String[] args) {
        // Definir variables
        int n = 0;
        double suma = 0.0, calificacionMin = 0.0, calificacion = 0.0;

        n = Integer.parseInt(JOptionPane.showInputDialog
                ("Ingrese el número de alumnos:"));

        if (n <= 0) {
            JOptionPane.showMessageDialog
                    (null, "El número de alumnos debe ser mayor que 0.");
            return;
        }

        calificacionMin = Double.parseDouble
                (JOptionPane.showInputDialog("Calificación del alumno 1:"));
        suma = calificacionMin;

        for (int i = 1; i < n; i++) {
            calificacion = Double.parseDouble(JOptionPane.showInputDialog("Calificación del alumno " + (i + 1) + ":"));
            suma += calificacion;

            if (calificacion < calificacionMin) {
                calificacionMin = calificacion;
            }
        }
        double media = suma / n;

        String resultado = "Calificación media: " + media + "\nCalificación más baja: " + calificacionMin;
        JOptionPane.showMessageDialog(null, resultado);
    }
}
