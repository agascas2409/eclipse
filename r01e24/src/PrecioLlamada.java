import java.util.Locale;
import java.util.Scanner;

public class PrecioLlamada {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //Pedir los datos necesarios
    System.out.print("Introduce el tiempo en minutos que ha estado en llamada: ");
    double minutos = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce el precio de establecimiento de la llamada: ");
    double costeEstablecimiento = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce el coste por minuto de la llamada: ");
    double costeMinuto = Double.parseDouble(sc.nextLine());
    
    //Calcular el precio
    double precio = minutos * costeMinuto;
    double precioFinal = precio + costeEstablecimiento;
    
    //Mostrar en pantalla
    System.out.printf(Locale.US, "El precio de la llamada es de: %f euros%n", precioFinal);

  }

}
