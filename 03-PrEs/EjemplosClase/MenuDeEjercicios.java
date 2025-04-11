package Ejercicios;
import javax.swing.*;
public class MenuDeEjercicios {
    public static void main(String[] args) {
        //Declaracion de Variables
        String menu = "";
        String opcion = "";
        boolean sentinel = true;

        //Menu
        menu = "Menu Principal" +
                "\n1) Ejercicios 1, 2 y 3" +
                "\n2) Ejercicios 4, 5 y 6" +
                "\n3) Ejercicios 7, 8 y 9" +
                "\n4) Salir" +
                "\nElegir opcion: ";
        do {

            opcion = JOptionPane.showInputDialog(menu);

            switch (opcion) {
                case "1":
                    String menu1 = "";
                    String opcion1 = "";
                    menu1 = "Menu Principal" +
                            "\n1) Ejercicios 1" +
                            "\n2) Ejercicios 2" +
                            "\n3) Ejercicios 3" +
                            "\n4) Salir" +
                            "\nElegir opcion: ";
                    opcion1 = JOptionPane.showInputDialog(menu1);
                    switch (opcion1) {
                        case "1":
                            break;
                        case "2":
                            break;
                        case "3":
                            break;
                        case "4":
                            JOptionPane.showMessageDialog(null, "Has regresado al Menu Principal");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opcion No Valida");
                    }
                    break;

                case "2":
                    String menu2 = "";
                    String opcion2 = "";
                    menu2 = "Menu Principal" +
                            "\n1) Ejercicios 4," +
                            "\n2) Ejercicios 5" +
                            "\n3) Ejercicios 6" +
                            "\n4) Salir" +
                            "\nElegir opcion: ";
                    opcion2 = JOptionPane.showInputDialog(menu2);
                    switch (opcion2) {
                        case "1":
                            break;
                        case "2":
                            break;
                        case "3":
                            break;
                        case "4":
                            JOptionPane.showMessageDialog(null, "Has regresado al Menu Principal");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opcion No Valida");
                    }
                    break;

                case "3":
                    String menu3 = "";
                    String opcion3 = "";
                    menu3 = "Menu Principal" +
                            "\n1) Ejercicios 7," +
                            "\n2) Ejercicios 8" +
                            "\n3) Ejercicios 9" +
                            "\n4) Salir" +
                            "\nElegir opcion: ";
                    opcion3 = JOptionPane.showInputDialog(menu3);
                    switch (opcion3) {
                        case "1":
                            break;
                        case "2":
                            break;
                        case "3":
                            break;
                        case "4":
                            JOptionPane.showMessageDialog(null, "Has regresado al Menu Principal");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opcion No Valida");
                    }
                    break;

                case "4":
                    JOptionPane.showMessageDialog(null, "Adios, el programa ha terminado");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion No Valida");
            }
        }while (sentinel);
    }
}