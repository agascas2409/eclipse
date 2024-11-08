package r01e06;
import java.util.Scanner;
import java.util.Locale;

public class PesetasAEurosPorTeclado {
  
  public static double PESETAS_POR_EURO = 166.386;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //Pedimos las pesetas
    System.out.print("Introduce las pesetas: ");
    double pesetas = Double.parseDouble(sc.nextLine());
    
    //Calculamos cuantos euros serian
    double euros = pesetas / PESETAS_POR_EURO;
    
    //Imprimimos los euros
    System.out.printf(Locale.US, "La cantidad %f en pesetas equivale a %f en euros%n", pesetas, euros);

  }

}
