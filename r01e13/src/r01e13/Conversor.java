package r01e13;
import java.util.Locale;
import java.util.Scanner;

public class Conversor {
  public static double CONVERSION = 1000;
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //Pedimos cuantos Megabytes quieren convertir
    System.out.print("Introduce el numero de MB: ");
    double megabyte = Double.parseDouble(sc.nextLine());
    
    //Hacemos la conversion Y LO MOSTRAMOS
    double kilobyte = megabyte * CONVERSION;
    System.out.printf(Locale.US,"%f MB son %f KB %n", megabyte, kilobyte);

  }

}
