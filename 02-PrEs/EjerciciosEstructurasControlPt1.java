package EstructurasDeControl;
//En este codigo se encuentra el ejercicio de la unidad II numero 3, 5 y 7
import javax.swing.*;
public class EjerciciosEstructurasControlPt1 {
    public static void main(String[]args){
        //Declaracion de variables
        String opcion = "";
        String menu = 
                "a) Juego\n" +
                "b) Fruteria\n" +
                "c) Laboratorio\n" +
                "d) Salir\n" +
                "Eliga una opcion: ";
        
        opcion = JOptionPane.showInputDialog(menu);
        opcion = opcion.toUpperCase();
        
        switch(opcion){
            case "a":
                jugar();
                break;
            case "b":
                double precio = 0.0;
                double cantKilos = 0.0;
                String resultado = "";
                precio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio de las manzanas"));
                cantKilos = Double.parseDouble(JOptionPane.showInputDialog("Introduce el total de kilo de las manzanas"));
                
                if(cantKilos>=0.0 && cantKilos<=2.0){
                    resultado = "El total a pagar es: " + (cantKilos * precio);
                    
                }else if(cantKilos>=2.01 && cantKilos<=5.0){
                    double descuento = (cantKilos * precio) * 0.10;
                resultado = "El total a pgar con un descuento(10%) " + descuento + " es: " + (cantKilos * precio - descuento);
                
                }else if(cantKilos>=5.01 && cantKilos<=10.0){
                    double descuento = (cantKilos * precio) * 0.15;
                resultado = "El total a pgar con un descuento(15%) " + descuento + " es: " + (cantKilos * precio - descuento);
                }else{
                    double descuento = (cantKilos * precio) * 0.20;
                resultado = "El total a pgar con un descuento(20%) " + descuento + " es: " + (cantKilos * precio - descuento);
                
                }{
                        if(cantKilos<=0.0){
                        JOptionPane.showMessageDialog(null, "La cantidad de kilos son: ");
                        }
                        if(precio<0.0){
                        JOptionPane.showMessageDialog(null, "El precio no puede ser negativo");
                        }
                        }
                
                break;
            case "c":
                //resultado = "El Modulo es: " + (numero1 * numero2);
                JOptionPane.showMessageDialog(null, "Laboratorio");
                break;
            case "d":
                //Dividir
                //resultado = "El Modulo es: " + (numero1 / numero2);
                JOptionPane.showMessageDialog(null, "Hasta la vista, el programa termino");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Vuelve a digitar un numero valido");
        }
        
    }
    public static void jugar(){ String pregunta = "¿Colon descubrio america?";
               String resp = JOptionPane.showInputDialog(" Si/No");
               if(resp.equalsIgnoreCase("Si")){
                   resp = JOptionPane.showInputDialog("¿La independencia de mexico fue en 1810?");
                   if(resp.equalsIgnoreCase("Si")){
                       resp = JOptionPane.showInputDialog("");
                   }
            }else{
                    JOptionPane.showMessageDialog(null, "Respuesta Incorrecta, has perdido....");
               }
    }
    public static double calcularTotal(double precio){
        return precio;
    }
}
