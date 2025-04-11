package EstructurasDeControl;
import javax.swing.*;
public class PromedioDeCalif {
    public static void main(String[] args) {
        // Declaración de variables
        double calificacion1 = 0.0, calificacion2= 0.0, calificacion3= 0.0, calificacion4= 0.0, promedio= 0.0;

        // Pedir las calificaciones al usuario
        calificacion1 = Double.parseDouble(JOptionPane.showInputDialog
                ("Ingrese la primera calificación: "));
        calificacion2 = Double.parseDouble(JOptionPane.showInputDialog
                ("Ingrese la segunda calificación: "));
        calificacion3 = Double.parseDouble(JOptionPane.showInputDialog
                ("Ingrese la tercera calificación: "));
        calificacion4 = Double.parseDouble(JOptionPane.showInputDialog
                ("Ingrese la cuarta calificación: "));

        // Calcular el promedio
        promedio = (calificacion1 + calificacion2 + calificacion3 + calificacion4) / 4;

        JOptionPane.showMessageDialog(null,
                "El promedio de las calificaciones es: " + promedio);
    }
}
