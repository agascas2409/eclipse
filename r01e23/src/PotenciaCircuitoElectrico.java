import java.util.Locale;
import java.util.Scanner;

public class PotenciaCircuitoElectrico {
  public static double resistencia = 4;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //Pedimos el voltaje
    System.out.print("Introduce el valor del voltaje: ");
    double voltaje = Double.parseDouble(sc.nextLine());
    
    //Por la ley de ohm calculamos la potencia
    double potencia = resistencia / voltaje;
    System.out.printf(Locale.US, "El valor de la potencia es: %f%n", potencia);

  }

}
