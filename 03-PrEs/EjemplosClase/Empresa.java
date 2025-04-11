package EjemplosClase;

import javax.swing.*;

public class Empresa {
    public static void main(String[] args) {
        //Declaracion de variables
        int i = 0, numTrabaja = 0, horasTrabajadas = 0, horasExtra = 0;
        double salarioBase = 0.0, salarioTotal = 0.0;
        String salida = "";

        numTrabaja = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numeros de trabadores: "));

        salida = "Reporte de Salarios Semanales\n" +
                "Empleado      " + "Horas Trabajadas       " +
                "Horas Extra       " + "Salario Total\n";
        i = 1;
        while (i<=numTrabaja){
            horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de Horas Extra: "));

            horasExtra = 0;

            if (horasTrabajadas<=40){
                salarioTotal = horasTrabajadas * 20;
                salida += "Empleado " + i + "  " +horasTrabajadas +
                "  " + horasExtra + "  " + salarioTotal;
            }else{
                horasExtra = horasTrabajadas - 40;
                salarioTotal = 40 * 20 + horasExtra * 25;
                salida += "Empleado " + i + "  " +horasTrabajadas +
                        "  " + horasExtra + "  " + salarioTotal;
            }

            i++;
        }
        JOptionPane.showMessageDialog(null, salida);
    }
}
