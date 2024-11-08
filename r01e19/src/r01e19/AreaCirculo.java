package r01e19;
import java.util.Locale;
import java.util.Scanner;

public class AreaCirculo {
  public static double PI = 3.141592;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //Pedir el radio de la circunferencia
    System.out.print("Introduce el radio de la circunferencia: ");
    double radio = Double.parseDouble(sc.nextLine());
    
    //Calculamos la longitud de la circunferencia y lo mostramos
    double longitud = 2 * radio * PI;
    System.out.printf(Locale.US, "La longitud de la circunferencia es: %f%n", longitud);
    
    //Calculamos el area del circulo y lo mostramos
    double area = radio * radio * PI;
    System.out.printf(Locale.US, "El area del circulo que encierra la circunferencia es: %f%n", area);

  }

}
