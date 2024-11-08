import java.util.Locale;
import java.util.Scanner;


public class CalculoVertical {
  
  public static double GRAVEDAD = 9.8;
  public static double METRO_A_PIES = 3.28;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //Muestro en pantalla mi nombre
    System.out.println("EXAMEN DE ANA GASPAR CASTILLO CALCULO DE LANZAMIENTO VERTICAL");
    
    //Primero pedimos la velocidad inicial
    System.out.print("Introduzca la velocidad inicial del objeto (en m/s): ");
    double velocidadInicial = Double.parseDouble(sc.nextLine());
    
    //Calculamos el tiempo
    double tiempo = velocidadInicial / GRAVEDAD;
    
    //Calculamos la altura máxima
    double alturaMaxima = velocidadInicial * tiempo - ( ( GRAVEDAD * tiempo * tiempo ) / 2 );
    
    //Hacemos la conversion de metros a pies
    double pies = alturaMaxima * METRO_A_PIES;
    int alturaEnPies = (int)pies;
    
    
    //Muetro los resultados por pantalla
    System.out.printf(Locale.US, "La altura máxima en metros es de %f%n", alturaMaxima);
    System.out.printf("Esta altura equivale a %d pies%n", alturaEnPies);
    System.out.printf(Locale.US, "El tiempo necesario es %f segundos%n", tiempo);


  }

}
