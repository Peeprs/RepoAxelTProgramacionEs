package CicloWhile;
import javax.swing.*;
public class nCalificaciones {
    public static void main(String[] args) {
        // Definir variables
        int n = Integer.parseInt(JOptionPane.showInputDialog
                ("Ingrese el número de alumnos:"));
        double sumaCalificaciones = 0, promedio;
        int i = 1;

        while (i <= n) {
            double calificacion = Double.parseDouble
                    (JOptionPane.showInputDialog("Ingrese la calificación del alumno " + i + ":"));

            sumaCalificaciones += calificacion;
            i++;
        }
        promedio = sumaCalificaciones / n;

        JOptionPane.showMessageDialog(null, "El promedio de calificaciones es: " + promedio);
    }
}
