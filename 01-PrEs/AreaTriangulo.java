package EstructurasDeControl;
import javax.swing.*;
public class AreaTriangulo {
    public static void main(String[] args) {
        // Declaración de variables
        double base = 0.0, altura = 0.0, area= 0.0;

        // Pedir datos al usuario
        base = Double.parseDouble(JOptionPane.showInputDialog
                ("Ingrese la base del triángulo: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog
                        ("Ingrese la altura del triángulo: "));

        // Calcular el área
        area = (base * altura) / 2;

        JOptionPane.showMessageDialog
                (null,
                        "El área del triángulo es: " + area);
    }
}
