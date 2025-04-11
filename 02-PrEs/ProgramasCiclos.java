package Ejemplos;

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
                    double v1 = 0.0, v2 = 0.0, v3 = 0.0;
                    double sueldoTotal = 0.0;
                    String salida = "";
                    numeroVendedores = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numero de vendedores: "));
                    sueldoBase = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el sueldo base: "));

                    salida = "Nombre \t \t \t \tComision \t \t \t Sueldo Total\n";

                    int i = 1;
                    while(i<=numeroVendedores){
                        nombre = JOptionPane.showInputDialog("Introduce el nombre del vendedor " + i);
                        v2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce la venta 1: "));
                        v2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce la venta 2: "));
                        v3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce la venta 3: "));

                        comision = (v1 + v2 + v3) * .10;
                        sueldoTotal = sueldoBase + comision;
                        salida+= nombre + "      " + comision + "      " + sueldoTotal + "\n          ";
                        i++;
                    }
                    JOptionPane.showMessageDialog(null, salida);

                    break;
                case "3":
                    //Tienda de bolitas
                    String respuesta = "", resultado = "", tipoBolita = "";
                    double totalCompra = 0.0, descuento = 0.0, total = 0.0, importe = 0.0;
                    boolean sentinel2 = true;
                    String menuBolitas = "Tombola\n" +
                            "a) Bola Roja\n" +
                            "b) Bola Amarilla\n" +
                            "c) Bolita Blanca\n" +
                            "Elegir opcion";
                    resultado = "Total de Ventas\n" +
                            "Total de Ventas\n" +
                            "Total a Pagar                  " + "Descuento               " + "Importe          \n";
                    do {
                        totalCompra = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el valor de la compra: "));
                        tipoBolita = JOptionPane.showInputDialog(menuBolitas);
                        if (tipoBolita.equalsIgnoreCase("a")
                                || tipoBolita.equalsIgnoreCase("b")
                                || tipoBolita.equalsIgnoreCase("c")
                        )
                        {
                            if (tipoBolita.equalsIgnoreCase("a")){
                                descuento = totalCompra * .40;
                            } else if (tipoBolita.equalsIgnoreCase("b")) {
                                descuento = totalCompra * .25;
                            }else {
                                descuento = totalCompra * 0.0;
                            }
                            importe = totalCompra - descuento;
                            total+=importe;

                            resultado+= totalCompra + "              " +  descuento + "               " + importe + "\n";
                        }else {
                            JOptionPane.showMessageDialog(null, "Bolita No Valida");
                        }
                        salida = JOptionPane.showInputDialog("Desea cerrar la caja Si/No");
                        if(salida.equalsIgnoreCase("Si")){
                            sentinel2 = false;
                        }
                    }while (sentinel2);
                    resultado+= "Total: " + total;
                    JOptionPane.showMessageDialog(null, resultado);
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