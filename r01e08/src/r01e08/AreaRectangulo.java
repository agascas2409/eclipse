package r01e08;
import java.util.Scanner;
import java.util.Locale;

public class AreaRectangulo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //Pedimos la base y la altura
    System.out.print("Introduce la base del rectangulo: ");
    double base = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce la altura del rectangulo: ");
    double altura = Double.parseDouble(sc.nextLine());
    
    //Calculamos el area
    double area = base * altura; 
    
    //Mostramos el area por pantalla
    System.out.printf(Locale.US, "El area del rectangulo es: %f%n", area);
    
    
  }

}
