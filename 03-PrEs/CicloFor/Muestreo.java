package CicloFor;
import javax.swing.*;
public class Muestreo {
    public static void main(String[] args) {
        // Definir variables
        int n, edad;
        double peso;
        int contNinos = 0, contJovenes = 0, contAdultos = 0, contViejos = 0;
        double sumaNinos = 0, sumaJovenes = 0, sumaAdultos = 0, sumaViejos = 0;

        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de personas a encuestar:"));

        if (n <= 0) {
            JOptionPane.showMessageDialog(null, "El número de personas debe ser mayor que 0.");
            return;
        }

        for (int i = 1; i <= n; i++) {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la persona " + i + ":"));
            peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso (kg) de la persona " + i + ":"));

            if (edad >= 0 && edad <= 12) {
                sumaNinos += peso;
                contNinos++;
            } else if (edad >= 13 && edad <= 29) {
                sumaJovenes += peso;
                contJovenes++;
            } else if (edad >= 30 && edad <= 59) {
                sumaAdultos += peso;
                contAdultos++;
            } else if (edad >= 60) {
                sumaViejos += peso;
                contViejos++;
            }
        }

        double promedioNinos = (contNinos > 0) ? sumaNinos / contNinos : 0;
        double promedioJovenes = (contJovenes > 0) ? sumaJovenes / contJovenes : 0;
        double promedioAdultos = (contAdultos > 0) ? sumaAdultos / contAdultos : 0;
        double promedioViejos = (contViejos > 0) ? sumaViejos / contViejos : 0;

        String resultado = "Promedio de peso por categoría:\n";
        resultado += "Niños (0-12 años): " + (contNinos > 0 ? promedioNinos + " kg" : "No hay datos") + "\n";
        resultado += "Jóvenes (13-29 años): " + (contJovenes > 0 ? promedioJovenes + " kg" : "No hay datos") + "\n";
        resultado += "Adultos (30-59 años): " + (contAdultos > 0 ? promedioAdultos + " kg" : "No hay datos") + "\n";
        resultado += "Viejos (60+ años): " + (contViejos > 0 ? promedioViejos + " kg" : "No hay datos");

        JOptionPane.showMessageDialog(null, resultado);
    }
}
