package prog.unidad03.seleccion;
import java.util.Locale;
import java.util.Scanner;

public class CalculaImporteApp {
  public static double DESCUENTO = 0.2;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Titulo del ejercicio
    System.out.println("DESCUENTOS AL COMPRAR");
    
    //Pedimos el coste de la compra
    System.out.print("Introduce el importe de la compra en euros: ");
    double importe = Double.parseDouble(sc.nextLine());
    
    //Saber si se le hace descuento
    if(importe > 100) {
      double cantidadDescuento = importe * DESCUENTO;
      double importeFinal = importe - cantidadDescuento;
      System.out.printf(Locale.US, "Como la compra es superior a 100 euros la compra tiene un 20%% de descuento. El importe a pagar es de %f%n", importeFinal);
    } else {
      System.out.printf(Locale.US, "El importe a pagar es de %f%n", importe);
    }

  }

}
