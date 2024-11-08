package prog.unidad03.repeticion;
import java.util.Scanner;

public class CalculaFactorialApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Titulo del ejercicio
    System.out.println("CÁLCULO DE FACTORIAL");
    
    //Pedimos el numero del que queremos saber su factorial
    System.out.print("Introduce un número entero mayor que cero para calcular su factorial: ");
    int numero = Integer.parseInt(sc.nextLine());
    
    //Multiplicamos todos los valores
    if(numero > 0) {
      long factorial = 1;
      for(int contador = numero; contador >= 1; contador--) {
        factorial *= contador;
      }
      System.out.printf("El factorial de %d vale %d", numero, factorial);
    }

  }

}
