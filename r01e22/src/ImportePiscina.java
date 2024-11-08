import java.util.Locale;
import java.util.Scanner;

public class ImportePiscina {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //Pedimos las medidas de la piscina y el precio por litro
    System.out.print("Introduce el largo de la piscina: ");
    double largo = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce el ancho de la piscina: ");
    double ancho = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce el fondo de la piscina: ");
    double fondo = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce el precio por litro: ");
    double precioPorLitro = Double.parseDouble(sc.nextLine());
    
    //Calculamos el volumen de la piscina
    double areaBase = largo * ancho;
    double volumenPiscina = areaBase * fondo;
    
    //Calculamos el precio y lo mostramos
    double precioFinal = volumenPiscina * precioPorLitro;
    System.out.printf(Locale.US, "Elprecio por llenar la piscina es: %f%n", precioFinal);

  }

}
