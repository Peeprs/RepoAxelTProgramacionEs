package CicloWhile;
import javax.swing.*;
public class PromedioHM {
    public static void main(String[] args) {
        // Definir las variables
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de alumnos:"));
        int hombres = 0, mujeres = 0;
        double sumaHombres = 0, sumaMujeres = 0, sumaTotal = 0;
        int i = 1;

        while (i <= n) {
            String genero = JOptionPane.showInputDialog("Ingrese el género del alumno " + i + " (Hombre/Mujer):").toLowerCase();
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del alumno " + i + ":"));

            if (genero.equals("hombre")) {
                hombres++;
                sumaHombres += edad;
            } else if (genero.equals("mujer")) {
                mujeres++;
                sumaMujeres += edad;
            } else {
                JOptionPane.showMessageDialog(null, "Género no válido. Por favor ingrese 'Hombre' o 'Mujer'.");
                continue;
            }
            sumaTotal += edad;
            i++;
        }
        double promedioHombres = hombres > 0 ? sumaHombres / hombres : 0;
        double promedioMujeres = mujeres > 0 ? sumaMujeres / mujeres : 0;
        double promedioTotal = sumaTotal / n;

        String resultado = "Promedio de edad de los hombres: " + promedioHombres + "\n" +
                "Promedio de edad de las mujeres: " + promedioMujeres + "\n" +
                "Promedio de edad del grupo: " + promedioTotal;

        JOptionPane.showMessageDialog(null, resultado);
    }
}
