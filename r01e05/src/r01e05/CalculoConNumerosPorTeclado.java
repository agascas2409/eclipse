package r01e05;
import java.util.Scanner;

public class CalculoConNumerosPorTeclado {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //Pedimos los numeros al usuario
    System.out.print("Introduce un primer numero entero: ");
    int primerNumero = Integer.parseInt(sc.nextLine());
    System.out.print("Introduce un segundo numero entero: ");
    int segundoNumero = Integer.parseInt(sc.nextLine());
    
    //Hacemos los caliculos y los mostramos en pantalla
    System.out.printf("El resultado de la suma es: %s %n", primerNumero + segundoNumero);
    System.out.printf("El resultado de la diferencia es: %s %n", primerNumero - segundoNumero);
    System.out.printf("El resultado del producto es: %s %n", primerNumero * segundoNumero);
    System.out.printf("El resultado del cociente es: %s %n", primerNumero / segundoNumero);
    System.out.printf("El resultado del modulo es: %s %n", primerNumero % segundoNumero);

  }

}
