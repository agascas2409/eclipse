package r01e09;
import java.util.Scanner;
import java.util.Locale;

public class AreaTriangulo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //Pedimos la base y la altura
    System.out.print("Introduce la base del triangulo: ");
    double base = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce la altura del triangulo: ");
    double altura = Double.parseDouble(sc.nextLine());
    
    //Calculamos el area
    double area = (base * altura) / 2; 
    
    //Mostramos el area por pantalla
    System.out.printf(Locale.US, "El area del triangulo es: %f%n", area);
    
    
  }

}
