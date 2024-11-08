package r01e12;
import java.util.Locale;
import java.util.Scanner;

public class VolumenCono {
  public static double PI = 3.141592;
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //Pedimos el radio y la altura
    System.out.print("Introduce el radio del cono: ");
    double radio = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce la altura del cono: ");
    double altura = Double.parseDouble(sc.nextLine());
    
    //Calculamos el volumen del cono y lo mostramos
    double volumen = ( PI * radio * radio * altura ) / 3;
    System.out.printf(Locale.US, "El volumen del cono es: %f%n", volumen);

  }

}
