package prog.unidad03.repeticion;
import java.util.Scanner;

public class CuentaParesImparesApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Titulo del ejercicio
    System.out.println("CUENTA PARES O IMPARES");
    
    //Preguntamos cuantos numeros se van a introducir
    System.out.print("¿Cuántos números deseas introcucir?: ");
    int numeros = Integer.parseInt(sc.nextLine());
    
    //Creamos los contadores
    int contadorPar = 0;
    int contadorImpar = 0;
    
    //Pedimos los numeros
    for (; numeros > 0 ; numeros--) {
      System.out.printf("Introduce el número: ");
      int parImpar = Integer.parseInt(sc.nextLine());
      if (parImpar % 2 == 0) {
        System.out.printf("El número %d es par%n", parImpar);
        contadorPar++;
      } else {
        System.out.printf("El número %d es impar%n", parImpar);
        contadorImpar++;
      }
    }
    
    System.out.printf("Se han introducido %d números pares y %d números impares%n", contadorPar, contadorImpar);
    System.out.println("Fin del programa");

  }

}
