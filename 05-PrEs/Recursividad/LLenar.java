package mx.edu.uttt.arreglos;

import javax.swing.*;

//Llenar un vector de n elemntos, se debe de imprimir la posicion almacenada en, debn de imprimir el vector original deben de verificar que sea negativo o 0, y no repetidos
public class LLenar {
    public static void main(String[] args) {
        int [] vector = new int [solicitarTamanio()];
        llenarArreglo(vector);
        imprimir(vector);
        System.out.println(numeroMayor(vector));
    }
    public static int solicitarTamanio(){
        int  n = 0;

        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del arreglo: "));
            if(n<=0){
                JOptionPane.showMessageDialog(null, "El tamaño no puede ser cero ni negativo");
            }
        }while (n<=0);
        return n;
    }
    public static void llenarArreglo(int [] v){
        int numero = 0;
        boolean existe = false;
        for (int i = 0; i < v.length; i++) {
            do {
                numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero: "));
                existe = estaRepetido(v, numero);
                if (existe){
                    JOptionPane.showMessageDialog(null, "El valor esta repetido");
                }
            }while (existe);
            v [i] = numero;
        }
    }
    public static boolean estaRepetido(int [] v, int valor){
        boolean existe = false;

        for (int i = 0; i < v.length; i++) {
            if (valor==v[i]){
                existe = true;
                break;
            }
        }
        return existe;
    }
    public static String numeroMayor(int v []){
        int mayor = v[0];
        int posicion = 0;
        for (int i = 0; i <v.length ; i++) {
            if (mayor<v[i]){
                mayor = v[i];
                posicion = 1;
            }
        }
        return "\nEl Numero Mayor es: " + mayor
                + "\nLa Posocion es: " + posicion;
    }
    public static void imprimir(int []v){
        for (int valor : v){{
            System.out.println("|" + valor + "|");
            }
        }
    }
}
