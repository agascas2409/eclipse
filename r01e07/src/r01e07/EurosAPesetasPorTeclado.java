package r01e07;
import java.util.Scanner;
import java.util.Locale;

public class EurosAPesetasPorTeclado {
  public static double PESETAS_POR_EURO = 166.386;
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //Pedimos los euros
    System.out.print("Introduce los euros: ");
    double euros = Double.parseDouble(sc.nextLine());
    
    //Calculamos cuantas pesetas serian
    double pesetas = euros * PESETAS_POR_EURO;
    
    //Imprimimos las pesetas
    System.out.printf(Locale.US, "La cantidad %f en euros equivale a %f en pesetas%n", euros, pesetas);

  }

}
