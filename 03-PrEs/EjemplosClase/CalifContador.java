package EjemplosClase;

import javax.swing.*;

public class CalifContador {
    public static void main(String[] args) {
        //Delcaracion de variables
        int numAprobados = 0;
        int numReprobados = 0;
        int numeroDeCalif = 0;
        double calif = 0.0;


        numeroDeCalif = Integer.parseInt(JOptionPane.showInputDialog("Cuantas Calificaciones se van a evaluar: "));

        for(int i=1; i <=numeroDeCalif; i++){
            calif = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion: " + i));

            if (calif>=7.0){
                //Contador de numero de Aprobados
                numAprobados++;
            }else{
                numReprobados++;
            }

        }
        JOptionPane.showMessageDialog(null, "El numero de Aprobados: " + numAprobados +
                "\nEl numero de Reprobados es: " + numReprobados);
        int i = 0;
        numAprobados = 0;
        numReprobados = 0;

        while (i<=numeroDeCalif) {
            calif = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion: " + i));
            if (calif >= 7.0) {
                numAprobados++;
            } else {
                numReprobados++;
            }
            i++;
        }
        JOptionPane.showMessageDialog(null, "El numero de Aprobados: " + numAprobados +
                "\nEl numero de Reprobados es: " + numReprobados);

        numAprobados = 0;
        numReprobados = 0;
        do{
            calif = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion: " + i));
            if (calif>=7.0){
                numAprobados++;
            }else{
                numReprobados++;
            }
            i++;
        }while(i<=numeroDeCalif);
        JOptionPane.showMessageDialog(null, "El numero de Aprobados: " + numAprobados +
                "\nEl numero de Reprobados es: " + numReprobados);
    }
}
