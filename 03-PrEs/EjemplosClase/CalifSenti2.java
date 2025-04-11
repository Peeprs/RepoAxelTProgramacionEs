package EjemplosClase;

import javax.swing.*;

public class CalifSenti2 {
    public static void main(String[] args) {
        final int SENTINEL = -1;
        double calif = 0.0;
        int numAprobados = 0;
        int numReprobados = 0;

        JOptionPane.showMessageDialog(null, "Este Programa cuenta el numero de calificaciones" +
                " aprobatorias y reprobatorias" +
                "\nPara terminar introduce una calificacion con -1");
        int x = 1;
        while(calif>=SENTINEL){
            calif = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion: " + x));
            if (calif!=-1){
                if(calif>=7.0){
                    numAprobados++;
                }else{
                    numReprobados++;
                }
                x++;
            }else{
            }
        }
        JOptionPane.showMessageDialog(null, "El numero de Aprobados: " + numAprobados +
                "\nEl numero de Reprobados es: " + numReprobados);
    }
}