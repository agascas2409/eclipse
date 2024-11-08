package r01e10;
import java.util.Locale;
import java.util.Scanner;

public class TotalFacturaPorTeclado {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //Pedimos el valor de la base y del iva
    System.out.print("Introduce la base imponible: ");
    double base = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce el iva: ");
    double iva = Double.parseDouble(sc.nextLine());
    iva = iva / 100; 
    
    //Calculamos la factura total
    double facturaTotal = base * ( 1 + iva);
    
    //Imprimimos el valor de la factura
    System.out.printf(Locale.US, "El valor da la factura con el IVA es de: %f%n", facturaTotal);
    
  }

}
