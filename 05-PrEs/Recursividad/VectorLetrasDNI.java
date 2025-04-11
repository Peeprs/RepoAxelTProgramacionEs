import javax.swing.JOptionPane;

public class VectorLetrasDNI {

    public static void main(String[] args) {
        char[] abecedario = crearAbecedario();
        pedirLetrasPorPosicion(abecedario);
        calcularLetraDNI();
    }

    // Parte 1: Crear vector de A-Z
    public static char[] crearAbecedario() {
        char[] letras = new char[26];
        for (int i = 0; i < letras.length; i++) {
            letras[i] = (char) ('A' + i);
        }
        return letras;
    }

    // Parte 1: Pedir posiciones y formar cadena
    public static void pedirLetrasPorPosicion(char[] abecedario) {
        String resultado = "";
        while (true) {
            String entrada = JOptionPane.showInputDialog("Ingrese una posición (0 a 25) o 1 para salir:");
            int pos = Integer.parseInt(entrada);
            if (pos == 1) {
                break;
            }
            if (pos >= 0 && pos < abecedario.length) {
                resultado = resultado + abecedario[pos];
            } else {
                JOptionPane.showMessageDialog(null, "Posición inválida");
            }
        }
        JOptionPane.showMessageDialog(null, "Cadena final: " + resultado);
    }

    // Parte 2: Calcular letra del DNI
    public static void calcularLetraDNI() {
        // Tabla de letras (23 letras)
        char[] letrasDNI = {
            'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 
            'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 
            'C', 'K', 'E'
        };

        int dni = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su número de DNI (sin letra):"));
        int resto = dni % 23;

        if (resto >= 0 && resto < letrasDNI.length) {
            char letra = letrasDNI[resto];
            JOptionPane.showMessageDialog(null, "DNI completo: " + dni + letra);
        } else {
            JOptionPane.showMessageDialog(null, "Error al calcular la letra del DNI.");
        }
    }
}