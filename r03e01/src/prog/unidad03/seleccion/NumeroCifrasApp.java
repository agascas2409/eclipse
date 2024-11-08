package prog.unidad03.seleccion;

import java.util.Scanner;

public class NumeroCifrasApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Titulo del ejercicio
    System.out.println("CIFRAS DE UN NÚMERO");
    
    //Pedimos el numero
    System.out.print("Introduce un número entero y te diré cuantas cifras tiene: ");
    int numero = Integer.parseInt(sc.nextLine());
    
    //Comprobamos cuantos numeros tiene
    if(numero < 10) {
      System.out.printf("El numero %d tiene una cifra", numero);
    }else if(numero < 100) {
      System.out.printf("El numero %d tiene dos cifras", numero);
    }else if(numero < 1000) {
      System.out.printf("El numero %d tiene tres cifras", numero);
    }else{
      System.out.printf("El numero %d tiene más de tres cifras", numero);
    }

  }

}
