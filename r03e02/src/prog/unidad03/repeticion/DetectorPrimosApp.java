package prog.unidad03.repeticion;

import java.util.Scanner;

public class DetectorPrimosApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Titulo del ejercicio
    System.out.println("DIVISORES DE NUMEROS PRIMOS");
    
    //Pedimos el numero que queremos saber si es primo o no
    System.out.print("Introduce un número entero mayor que 1 para ver si es primo o no: ");
    int numero = Integer.parseInt(sc.nextLine());
    
    int primo = 0;
    
    //Comprobamos si es primo
    if(numero > 1) {
      for(int divisores = numero - 1; divisores > 1 ; divisores--) {
        if(numero % divisores == 0) {
          primo += 1;
        }
      }
      if(primo != 0) {
        System.out.printf("El número %d NO es primo", numero);
      } else {
        System.out.printf("El número %d es primo", numero);
      }
    } else {
      System.out.println("El numero debe ser mayor que 1");
    }

  }

}
