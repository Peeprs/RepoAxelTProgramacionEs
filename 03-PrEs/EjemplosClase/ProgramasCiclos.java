package EjemplosClase;

import javax.swing.*;

public class ProgramasCiclos {
    public static void main(String[] args) {
        //Declaraciones de variables
        String menu = "";
        String opcion = "";
        boolean sentinel = true;
        //Crecion del menu
        menu = "Menu Principal" +
                "\n1) Promedio Calificaciones (for)" +
                "\n2) Vendedores (while)" +
                "\n3) Tienda (for-while)" +
                "\n4) Salir" +
                "\nElegir opcion: ";
        do {
            opcion = JOptionPane.showInputDialog(menu);

            switch (opcion) {
                case "1":
                    int numCalif = 0;
                    double calif = 0.0;
                    double promedio = 0.0;

                    //Solicitar el numero de calificaciones
                    numCalif = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de calificaciones: "));
                    for (int i = 1; i<=numCalif; i++){
                        //Solicitar calificicion
                        calif = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion: " + i));

                        //Acumular Calificaciones
                        promedio+=calif;
                    }
                    promedio/=numCalif;
                    JOptionPane.showMessageDialog(null, "El Promedio del alumno es: " + promedio);
                    break;
                case "2":
                    String nombre = "";
                    int numeroVendedores = 0;
                    double sueldoBase = 0.0;
                    double comision = 0.0;
                    double sueldoTotal = 0.0;
                    String salida = "";
                    numeroVendedores = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numero de vendedores: "));
                    sueldoBase = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el sueldo base: "));

                    salida = "Nombre\t\t\t\tComision\t\t\tSueldo Total\n";

                    int i = 1;
                    while(i<=numeroVendedores){
                        nombre = JOptionPane.showInputDialog("Introduce el nombre del vendedor " + i);
                        salida+= nombre + "     " + comision + "     " + sueldoTotal + "\n";
                        i++;
                    }
                    JOptionPane.showMessageDialog(null, salida);

                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Opcion 3");
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "Adios, el programa ha terminado");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion No Valida");
            }
        }while(sentinel);
    }
}