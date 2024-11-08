package prog.unidad03.repeticion;

import java.util.Scanner;

public class CalculaDivisoresApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Titulo del ejercicio
    System.out.println("DIVISORES DE UN NÚMERO");
    
    //Pedimos el numero del que queremos saber sus divisores
    System.out.print("Introduce un número entero para que calcule sus divisores: ");
    int numero = Integer.parseInt(sc.nextLine());
    
    //Calculamos por que numeros es divisible
    if(numero > 0) {
      for(int divisores = 1; divisores <= numero; divisores++) {
        if(numero % divisores == 0) {
          System.out.printf("Es divisible por %d%n", divisores);
        }
      }
    } else {
      System.out.println("El numero debe ser mayor que 0");
    }

  }

}
