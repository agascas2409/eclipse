package prog.unidad03.repeticion;
import java.util.Scanner;

public class CuentaPositivosApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Titulo del ejercicio
    System.out.println("CONTADOR DE POSITIVOS");
    
    int numero;
    int positivo = 0;
    //Pedimos el primer numero
    do {
     System.out.print("Introduce un número entero positivo o cero (negativo para terminar): ");
     numero = Integer.parseInt(sc.nextLine());
     if(numero >= 0) {
       positivo++;
     }
    } while (numero >= 0);
    
    //Imprimimos por pantalla cuantos positivos se han introducido
    System.out.printf("Has introducido %d números positivos", positivo);

  }

}
