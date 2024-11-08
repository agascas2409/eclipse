package prog.unidad03.repeticion;
import java.util.Scanner;

public class CuentaParesApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Titulo del ejercicio
    System.out.println("CUENTA PARES");
    
    //Preguntamos cuantos numeros se van a introducir
    System.out.print("¿Cuántos números pares deseas introcucir?: ");
    int numeros = Integer.parseInt(sc.nextLine());

    //Pedimos los numeros
    for (int contador = numeros; contador > 0 ;) {
      System.out.printf("Introduce un número entero: ");
      int par = Integer.parseInt(sc.nextLine());
      if (par % 2 == 0) {
        contador--;
        System.out.printf("Te quedan %d números pares por introducir%n", contador);
      }
    }
    
    System.out.printf("¡Ya has introducido %d números pares!", numeros);

  }

}
