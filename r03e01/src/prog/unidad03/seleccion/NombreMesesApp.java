package prog.unidad03.seleccion;
import java.util.Scanner;

public class NombreMesesApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Titulo del ejercicio
    System.out.println("NOMBRES DE MES");
    
    //Pedimos el numero que ocupa el mes
    System.out.print("Introduce un número ntero del 1 al 12 y te diré que mes ocupa esa posición: ");
    int mes = Integer.parseInt(sc.nextLine());
    
    //Comprobamos con que mes se corresponde el numero
    switch(mes) {
    case 1: 
      System.out.printf("El mes con posición %d tiene el nombre \"Enero\"", mes);
      break;
    case 2:
      System.out.printf("El mes con posición %d tiene el nombre \"Febrero\"", mes);
      break;
    case 3:
      System.out.printf("El mes con posición %d tiene el nombre \"Marzo\"", mes);
      break;
    case 4:
      System.out.printf("El mes con posición %d tiene el nombre \"Abril\"", mes);
      break;
    case 5: 
      System.out.printf("El mes con posición %d tiene el nombre \"Mayo\"", mes);
      break;
    case 6:
      System.out.printf("El mes con posición %d tiene el nombre \"Junio\"", mes);
      break;
    case 7:
      System.out.printf("El mes con posición %d tiene el nombre \"Julio\"", mes);
      break;
    case 8:
      System.out.printf("El mes con posición %d tiene el nombre \"Agosto\"", mes);
      break;
    case 9: 
      System.out.printf("El mes con posición %d tiene el nombre \"Septiembre\"", mes);
      break;
    case 10:
      System.out.printf("El mes con posición %d tiene el nombre \"Octubre\"", mes);
      break;
    case 11:
      System.out.printf("El mes con posición %d tiene el nombre \"Noviembre\"", mes);
      break;
    case 12:
      System.out.printf("El mes con posición %d tiene el nombre \"Diciembre\"", mes);
      break;
    }

  }

}
