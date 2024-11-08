package r01e17;
import java.util.Locale;
import java.util.Scanner;

public class PresupuestoHospital {
  public static double GINECOLOGIA = 0.4;
  public static double TRAUMATOLOGIA = 0.35;
  public static double PEDIATRIA = 0.25;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //Preguntar cuanto presupuesto tiene el hospital
    System.out.print("Cual es el presupuesto anual que tiene el hospital: ");
    double presupuestoAnual = Double.parseDouble(sc.nextLine());
    
    //Calcular cuanto le cuesta a cada departamento
    double presupuestoGinecologia = presupuestoAnual * GINECOLOGIA;
    double presupuestoTraumatologia = presupuestoAnual * TRAUMATOLOGIA;
    double presupuestoPediatria = presupuestoAnual * PEDIATRIA;
    
    //Mostramos el resultado en pantalla
    System.out.printf(Locale.US, "El presupuesto para Ginecologia es %f%n", presupuestoGinecologia);
    System.out.printf(Locale.US, "El presupuesto para Traumatologia es %f%n", presupuestoTraumatologia);
    System.out.printf(Locale.US, "El presupuesto para Pediatria es %f%n", presupuestoPediatria);
    
    

  }

}
