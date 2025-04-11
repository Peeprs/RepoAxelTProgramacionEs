package mx.edu.uttt.subprogramas;

import javax.swing.*;

public class Saludo {
    public static void main(String[] args) {
        //saludar();
        //saludar2("Arcadia");
        //saludar2("Artemio");
        //saludarConNombre("Axel", 24300706);
        //saludarConNombre("Leo", 69);

        //Declaracion de variables
        String nombre = "";
        int matricula = 0;

        nombre = JOptionPane.showInputDialog("Introduce tu nombre: ");
        matricula = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu matricula: "));
        saludarConNombre(nombre, matricula);

        int edad2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad: "));
        String saludo = saludarConContestacion(nombre, edad2);
        System.out.println(saludo);
    }
    //Metodo de tipo que no retorna nada y no recibe parametros
    public static void saludar(){
        System.out.println("Hola Mundo ");
    }
    //Metodo Estatico que no retorna nada (void) y recibe un parametro de tipo String
    public static void saludar2(String nombre){
        System.out.println("Hola Mundo " + nombre);
    }
    public static void saludarConNombre(String nombre, int matricula){
        String cadena = "Hola Mundo soy: " + nombre
                + " con matricula: " + matricula;
        System.out.println(cadena);
    }
    public static String saludarConContestacion(String nombre, int edad){
        String saludar = "Hola" + nombre + " estas a punto de reprobar programacion a tus " + edad;
    return saludar;
    }
}