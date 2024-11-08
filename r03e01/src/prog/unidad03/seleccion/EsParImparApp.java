package prog.unidad03.seleccion;

import java.util.Scanner;

public class EsParImparApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Titulo del ejercicio
    System.out.println("¿PAR O IMPAR?");
    
    //Pedimos el numero por pantalla
    System.out.print("Introduce un número entero: ");
    int numero = Integer.parseInt(sc.nextLine());
    
    //Comprobamos si es par o impar
    if(numero % 2 == 0) {
      System.out.printf("El numero %d es par", numero);
    }else {
      System.out.printf("El numero %d es impar", numero);
    }

  }

}
