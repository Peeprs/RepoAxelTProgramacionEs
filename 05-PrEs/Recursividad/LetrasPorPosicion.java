import javax.swing.JOptionPane;

public class LetrasPorPosicion {

    public static void main(String[] args) {
        char[] abecedario = crearAbecedario();
        construirCadena(abecedario);
    }

    public static char[] crearAbecedario() {
        char[] letras = new char[26];
        for (int i = 0; i < letras.length; i++) {
            letras[i] = (char) ('A' + i);
        }
        return letras;
    }

    public static void construirCadena(char[] letras) {
        String resultado = "";

        while (true) {
            String input = JOptionPane.showInputDialog("Ingrese una posición (0-25), o 1 para salir:");
            int posicion = Integer.parseInt(input);

            if (posicion == 1) {
                break;
            }

            if (posicion >= 0 && posicion < letras.length) {
                resultado = resultado + letras[posicion];
            } else {
                JOptionPane.showMessageDialog(null, "Posición inválida");
            }
        }

        JOptionPane.showMessageDialog(null, "Cadena final: " + resultado);
    }
}