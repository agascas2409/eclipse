package prog.unidad03.repeticion;
import java.util.Scanner;

public class FactoresPrimosApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Titulo del ejercicio
    System.out.println("CÁLCULO DE FACTORES PRIMOS");
    
    //Pedimos el numero del que queremos saber sus factores
    System.out.print("Introduce un número entero mayor que 1 para descomponerlo en factores primos: ");
    int numero = Integer.parseInt(sc.nextLine());
    
    //Comprobamos si es primo
    if(numero > 1) {
      for(int primo = 2; primo <= numero ;) {
        if(numero % primo == 0) {
          System.out.printf("%d es un factor primo%n", primo);
          numero = numero / primo;
        } else {
          primo++;
        }
      }
    } else {
      System.out.println("El numero debe ser mayor que 1");
    }

  }

}
