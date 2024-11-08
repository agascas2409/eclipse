package prog.unidad03.repeticion;
import java.util.Scanner;
import java.util.Locale;

public class MediaPositivosApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Titulo del ejercicio
    System.out.println("CÁLCULO DE LA MEDIA");
    
    //Creamos las variables
    double numero;
    double suma = 0;
    int positivos = 0;
    //Pedimos el primer numero
    do {
     System.out.print("Introduce un número entero positivo o cero (negativo para terminar): ");
     numero = Double.parseDouble(sc.nextLine());
     if(numero >= 0) {
       suma += numero;
       positivos++;
     }
    } while (numero >= 0);
    
    //Calculamos la media de los numeros
    double media = suma / positivos;
    System.out.printf(Locale.US, "La media de los %d números introducidos vale %f", positivos, media);

  }

}
