package r01e14;
import java.util.Locale;
import java.util.Scanner;

public class NotaSegundoExamen {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //Pedimos la nota del primer examen y la notadeseada
    System.out.print("Introduce la nota del primer examen: ");
    double primerExamen = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce la nota que deseas tener entre 0-10: ");
    double notaDeseada = Double.parseDouble(sc.nextLine());
    
    //Segunda nota y la mostramos en pantalla
    double segundaNota = ( 2 * notaDeseada ) - primerExamen;
    System.out.printf(Locale.US, "La nota que debe sacar en el segundo examen es %f para tener %f en la nota final%n", segundaNota, notaDeseada);

  }

}
