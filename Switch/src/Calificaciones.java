import java.util.Scanner;
public class Calificaciones {
    public static void main (String args[]){
        
        var consola = new Scanner(System.in);
        System.out.println("Ingrese Calificacion (0 al 10): ");
        double calificacion = Double.parseDouble(consola.nextLine());
        var calificacionTexto = "No se encontro calificacion";
        
        if (calificacion >= 0 && calificacion < 6){
           calificacionTexto = "Obtuviste una F";
        }
            else if (calificacion >= 6 && calificacion < 7){
                calificacionTexto = "Obtuviste una D";
        }
            else if (calificacion >= 7 && calificacion < 8){
               calificacionTexto = "Obtuviste una C";
            }
            else if (calificacion >= 8 && calificacion < 9){
                calificacionTexto = "Obtuviste una B";
            }
            else if (calificacion >= 9 && calificacion <= 10){
                calificacionTexto = "Obtuviste una A";
            }
            else{
                calificacionTexto = "Valor desconocido";
            }
        System.out.println("calificacionTexto = " + calificacionTexto);
    }
}
