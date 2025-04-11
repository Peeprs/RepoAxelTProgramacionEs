package EstructurasDeControl;
import javax.swing.*;
public class SueldoEmpleados {
    public static void main(String[] args) {
        //Declaracion de variables
        int horasTrabajadas = 0;
        double cuotaPorHora = 0.0;
        double sueldo = 0.0;

        //Pedir valores al usuario
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas (número entero):"));
        cuotaPorHora = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cuota por hora:"));
        sueldo = horasTrabajadas * cuotaPorHora;

        String mensaje = "El empleado " + nombre + "\n" +
                "tiene un sueldo de " + sueldo + " pesos";
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
