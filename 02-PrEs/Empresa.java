package EstructurasDeControl;

import javax.swing.*;

public class Empresa {
    public static void main(String[] args) {
        //Declaracion de variables
        double saldo = 0.0, prestamo = 0.0, equipoComputo = 0.0, moviliario = 2000.0;
        double insumos = 0.0, insetivosPersonal = 0.0;
        String salida = "";
        //Solicitar saldo
        saldo = Double.parseDouble(JOptionPane.showInputDialog("Introduce el saldo"));

        if(saldo<0.0){
            prestamo = 10000.0;
        }else if(saldo>0.0 && saldo<20000){
            prestamo = (20000.0 - saldo);
        }else {
            prestamo = saldo;
        }
        equipoComputo = 5000;
        prestamo -= equipoComputo;
        prestamo -= moviliario;
        insumos = prestamo/2.0;
        prestamo -= prestamo/2.0;
        insetivosPersonal = prestamo;

        salida = "Resultados\n" +
                "Compra de Insumos: " + insumos +
                "\nInsentivos del Personal: " + insetivosPersonal +
                "\nEquipo Computo: " + equipoComputo +
                "\nMobiliario: " + moviliario;

        JOptionPane.showMessageDialog(null, salida);
    }
}
