
import java.util.Scanner;

public class NumeroPar {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //Declaramos el numero que nos pide
    System.out.print("Introduce un numero entero: ");
    int numero = Integer.parseInt(sc.nextLine());
    
    //Calculamos si es par
    boolean par = (numero % 2) == 0;
    
    //Imprimimos el resultado
    System.out.printf("¿El numero %d es par?: %b%n", numero, par);

  }

}
