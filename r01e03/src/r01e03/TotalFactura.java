package r01e03;

import java.util.Locale;

public class TotalFactura {
  
  //Porcentaje de IVA
  public static double IVA = 0.21;
  
  public static void main(String[] args) {
    //Pedimos el valor de la base
    double base = 165; 
    
    //Calculamos la factura total
    double facturaTotal = base * ( 1 + IVA);
    
    //Imprimimos el valor de la factura
    System.out.printf(Locale.US, "El valor da la factura con el IVA es de: %f%n", facturaTotal);
    
  }

}
