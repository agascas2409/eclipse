package prog.unidad03.excepciones;

import java.util.Scanner;

public class NumeroSeguroApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Titulo del ejercicio
    System.out.println("INTRODUCCIÓN DE NÚMERO SEGURA");
    
    int numero = 0;
    try {
      //Solicitamos un entero
      System.out.print("Introduce un número entero: ");
      numero = Integer.parseInt(sc.nextLine());
      
      //Se imprime
      System.out.printf("El número introducido es %d%n", numero);
      
    } catch (NumberFormatException e) {
      System.out.println("El dato introducido no es un número valido");
    }



  }

}
