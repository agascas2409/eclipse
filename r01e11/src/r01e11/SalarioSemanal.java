package r01e11;
import java.util.Locale;
import java.util.Scanner;

public class SalarioSemanal {
  public static double EUROS_POR_HORA = 12;
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //Le pedimos el numero de horas
    System.out.print("Introduce el numero de horas que ha trabajado esta semana: ");
    double horas = Double.parseDouble(sc.nextLine());
    
    //Calculamos el salario semanal
    double salario = horas * EUROS_POR_HORA;
    
    //Mostramos el salario semanal
    System.out.printf(Locale.US, "Su salario de esta semana es: %f%n", salario);

  }

}
