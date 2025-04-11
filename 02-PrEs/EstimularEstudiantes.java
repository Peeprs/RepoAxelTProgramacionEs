package EstructurasDeControl;
import javax.swing.JOptionPane;
public class EstimularEstudiantes {
    public static void main(String[] args) {
        // Declaración de variables
        double promedio, totalPagar = 0.0;
        int materiasReprobadas = 0, unidades= 0, nivelEducativo = 0;
        String mensaje = "";

        // Pedir datos
        promedio = Double.parseDouble(JOptionPane.showInputDialog
                ("Ingrese el promedio del alumno: "));
        nivelEducativo = Integer.parseInt(JOptionPane.showInputDialog
                ("Ingrese el nivel educativo del alumno: "));
        materiasReprobadas = Integer.parseInt(JOptionPane.showInputDialog
                ("Ingrese el número de materias reprobadas: "));

        // Evaluar condiciones
        if (nivelEducativo == 1) {
            if (promedio >= 9.5) {
                unidades = 55;
                totalPagar = unidades / 5 * 180;
                totalPagar *= 0.75;
            } else if (promedio >= 9) {
                unidades = 50;
                totalPagar = unidades / 5 * 180;
                totalPagar *= 0.90;
            } else if (promedio > 7) {
                unidades = 50;
                totalPagar = unidades / 5 * 180;
            } else if (promedio <= 7 && materiasReprobadas <= 3) {
                unidades = 45;
                totalPagar = unidades / 5 * 180;
            } else {
                unidades = 40;
                totalPagar = unidades / 5 * 180;
            }
        } else if (nivelEducativo == 2) {
            if (promedio >= 9.5) {
                unidades = 55;
                totalPagar = unidades / 5 * 300;
                totalPagar *= 0.80;
            } else {
                unidades = 55;
                totalPagar = unidades / 5 * 300;
            }
        }

        mensaje = "El alumno podrá cursar " + unidades + " unidades.\n" +
                "El total a pagar es: " + totalPagar;
        JOptionPane.showMessageDialog
                (null, mensaje);
    }
}
