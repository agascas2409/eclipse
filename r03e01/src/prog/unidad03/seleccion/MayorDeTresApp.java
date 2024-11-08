package prog.unidad03.seleccion;
import java.util.Scanner;

public class MayorDeTresApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Titulo del ejercicio
    System.out.println("MAYOR DE DOS NÚMEROS");
    
    //Pedimos los numeros
    System.out.print("Introduce el primer número: ");
    int numero1 = Integer.parseInt(sc.nextLine());
    
    System.out.print("Introduce el segundo número: ");
    int numero2 = Integer.parseInt(sc.nextLine());
    
    System.out.print("Introduce el segundo número: ");
    int numero3 = Integer.parseInt(sc.nextLine());
    
    //Probamos cual es mayor de los tres
    if (numero1 < numero2) {
      if (numero2 < numero3) {
        System.out.printf("El numero mayor es %d%n", numero3);
      } else {
        System.out.printf("El numero mayor es %d%n", numero2);
      }
    } else {
      if(numero1 < numero3) {
        System.out.printf("El numero mayor es %d%n", numero3);
      } else {
        System.out.printf("El numero mayor es %d%n", numero1);
      }
    }

  }

}
