package r01e15;
import java.util.Locale;
import java.util.Scanner;

public class SalarioDelMes {
  public static  double COMISION = 0.1;
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //Salario base
    double salarioBase = 1000;
    
    //Pedirle cuanto ha vendido en cada venta
    System.out.print("Cuanto vendio en la primera venta: ");
    double primerVenta = Double.parseDouble(sc.nextLine());
    System.out.print("Cuanto vendio en la segunda venta: ");
    double segundaVenta = Double.parseDouble(sc.nextLine());
    System.out.print("Cuanto vendio en la tercera venta: ");
    double tercerVenta = Double.parseDouble(sc.nextLine());
    
    //Calcular la comisión
    double comision1 = primerVenta * COMISION;
    double comision2 = segundaVenta * COMISION;
    double comision3 = tercerVenta * COMISION;
    
    //Calculamos el salario final
    double salarioFinal = salarioBase + comision1 + comision2 + comision3;
    
    //Mostramos el salario final
    System.out.printf(Locale.US, "El salario final del vendedor seria de: %f%n", salarioFinal);

  }

}
