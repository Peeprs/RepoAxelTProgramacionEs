package Ejemplos;
import javax.swing.JOptionPane;
public class JuegoPreguntas {
    public static void main(String[] args) {
        // Declaración de variables
        String respuesta1 = "", respuesta2 = "", respuesta3 = "";

        // Primera pregunta
        respuesta1 = JOptionPane.showInputDialog
                ("¿Colón descubrió América? (Si/No)").toLowerCase();
        if (!respuesta1.equals("si")) {
            JOptionPane.showMessageDialog(null,
                    "Respuesta incorrecta. El juego termina.");
            return;
        }

        // Segunda pregunta
        respuesta2 = JOptionPane.showInputDialog("¿La independencia de México fue en el año 1810? (Si/No)").toLowerCase();
        if (!respuesta2.equals("si")) {
            JOptionPane.showMessageDialog(null,
                    "Respuesta incorrecta. El juego termina.");
            return;
        }

        // Tercera pregunta
        respuesta3 = JOptionPane.showInputDialog("¿The Doors fue un grupo de rock americano? (Si/No)").toLowerCase();
        if (!respuesta3.equals("si")) {
            JOptionPane.showMessageDialog(null,
                    "Respuesta incorrecta. El juego termina.");
            return;
        }

        JOptionPane.showMessageDialog(null,
                "¡Felicidades! Respondiste correctamente todas las preguntas.");
    }
}
