import java.util.Locale;
import java.util.Scanner;

public class LitrosAGalon {
  public static double GALON_LITROS = 3.785;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //Pedimos el numero de litros que produce
    System.out.print("Introduce el numero de litros producidos: ");
    double litros = Double.parseDouble(sc.nextLine());
    
    //Pedimos el precio por galon
    System.out.print("Introduce lo que pagan por galon: ");
    double precioGalon = Double.parseDouble(sc.nextLine());
    
    //Calculamos cuanto seria por litro
    double precioLitros = (litros / GALON_LITROS) * precioGalon;
    System.out.printf(Locale.US, "Las ganancias por ese dia seran: %f%n", precioLitros);
    

  }

}
