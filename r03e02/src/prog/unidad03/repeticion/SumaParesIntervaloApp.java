package prog.unidad03.repeticion;
import java.util.Scanner;

public class SumaParesIntervaloApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Titulo del ejercicio
    System.out.println("SUMA DE UN INTERVALO");
    
    //Pedimos cual sera el intervalo
    System.out.print("Introduce el número de comienzo del intervado: ");
    int comienzoIntervalo = Integer.parseInt(sc.nextLine());
    System.out.print("Introduce el número de fin del intervado: ");
    int finIntervalo = Integer.parseInt(sc.nextLine());
    
    do {
      System.out.printf("Error. El número de inicio (%d) debe ser menor o igual al de final (%d). Intentalo de nuevo.%n", comienzoIntervalo, finIntervalo);
      System.out.print("Introduce el número de comienzo del intervado: ");
      comienzoIntervalo = Integer.parseInt(sc.nextLine());
      System.out.print("Introduce el número de fin del intervado: ");
      finIntervalo = Integer.parseInt(sc.nextLine());
    } while (comienzoIntervalo > finIntervalo);
    
    //Calculamos la suma
    if (comienzoIntervalo % 2 == 0) {
      int suma = comienzoIntervalo;
      for(int numeros = comienzoIntervalo + 1; numeros <= finIntervalo; numeros++) {
        if (numeros % 2 == 0) {
          suma += numeros;
        }
      }
    System.out.printf("La suma de los números pares comprendidos entre %d y %d vale %d", comienzoIntervalo, finIntervalo, suma);  
    } else {
      int suma = comienzoIntervalo + 1;
      for(int numeros = suma + 1; numeros <= finIntervalo; numeros++) {
        if (numeros % 2 == 0) {
          suma += numeros;
        }
      }
      System.out.printf("La suma de los números pares comprendidos entre %d y %d vale %d", comienzoIntervalo, finIntervalo, suma);
    }

  }

}
