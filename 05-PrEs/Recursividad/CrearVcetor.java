package mx.edu.uttt.arreglos;

import javax.swing.*;

//crear un programa que imprima un vector de tamaño n, el vector solo imprimira valores primos
// nos debe de indicar cual es el amyor de todos y hay que imprimir el vector y comprobar
public class CrearVcetor {
    public static void main(String[] args) {

        llenarArreglo(vector);
        imprimir(vector);
        System.out.println("El numero mayor es: " +  esMayor(vector));
    }
    public static int solicitarTamanio() {
        int n = 0;

        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del arreglo: "));
            if (n <= 0) {
                JOptionPane.showMessageDialog(null, "El tamaño no puede ser cero ni negativo");
            }
        } while (n <= 0);
        return n;
    }
    public static boolean esPrimo(int valor){
        boolean primo = false;
        int contador = 0;
        for (int i = 1; i <= valor; i++) {
            if (valor%i == 0){
                contador++;
            }
        }
        if (contador == 2){
            primo = true;
        }
        return primo;
    }
    public static void llenarArreglo(int []v){
        boolean primo = false;
        int valor = 0;
        for (int i = 0; i < v.length ; i++) {
            do {
                valor = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor"));
                primo = esPrimo(valor);
                if(!primo){
                    JOptionPane.showMessageDialog(null,"El valor no es primo");
                }
            }while (!primo);
            v[i] = valor;
        }
    }
    public static int esMayor(int []v){
        int mayor = v[0];
        for (int i = 0; i < v.length; i++) {
            if(mayor<v[i]){
                mayor = v[i];
            }
        }
        return mayor;
    }
    public static void imprimir(int [] v){
        for(int valor : v){
            System.out.print("|" + valor + "|");
        }
    }
}
