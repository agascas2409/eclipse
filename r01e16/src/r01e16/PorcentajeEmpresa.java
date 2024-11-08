package r01e16;
import java.util.Locale;
import java.util.Scanner;

public class PorcentajeEmpresa {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //Pedir el dinero que ha aportado cada persona
    System.out.print("Cuanto ha aportado la primera persona: ");
    double primeraPersona = Double.parseDouble(sc.nextLine());
    System.out.print("Cuanto ha aportado la segunda perosna: ");
    double segundaPersona = Double.parseDouble(sc.nextLine());
    System.out.print("Cuanto ha aportado la tercera persona: ");
    double terceraPersona = Double.parseDouble(sc.nextLine());
    
    //Calculamos el total que se ha invertido
    double invertido = primeraPersona + segundaPersona + terceraPersona;
    
    //Calculamos el porcentaje de cada uno
    double porcentaje1 = (primeraPersona / invertido) * 100;
    double porcentaje2 = (segundaPersona / invertido) * 100;
    double porcentaje3 = (terceraPersona / invertido) * 100;
    
    //Imprimir cuanto porcentaje invierte cada persona
    System.out.printf(Locale.US, "La primera persona ha invertido %f %% %n", porcentaje1);
    System.out.printf(Locale.US, "La segunda persona ha invertido %f %% %n", porcentaje2);
    System.out.printf(Locale.US, "La tercera persona ha invertido %f %% %n", porcentaje3);
    

  }

}
