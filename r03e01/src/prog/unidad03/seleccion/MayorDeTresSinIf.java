package prog.unidad03.seleccion;

import java.util.Scanner;

public class MayorDeTresSinIf {

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
    int mayor = (numero1 < numero2) ? numero2 : numero1;
    int valorMayor = (numero3 < mayor) ? mayor : numero3 ;
    System.out.printf("El número mayor es %d%n", valorMayor);

  }

}
