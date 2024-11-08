package prog.unidad03.repeticion;
import java.util.Scanner;
import java.util.Locale;

public class MayorMenorMediaApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Titulo del ejercicio
    System.out.println("MAYOR, MENOR Y MEDIA");
    
    //Preguntamos cuantos numeros se van a introducir
    System.out.print("¿Cuántos números deseas introcucir?: ");
    int numeros = Integer.parseInt(sc.nextLine());
    
    if (numeros > 0) {
      //Pedimos el primer numero
      System.out.printf("Introduce el número 1: ");
      double numero = Double.parseDouble(sc.nextLine());
      
      //Declaramos mayor, menor y suma
      double mayor = numero;
      double menor = numero;
      double suma = numero;

      for (int contador = 2; contador <= numeros ; contador++) {

        //Pedimos los demas numeros
        System.out.printf("Introduce el número %d: ", contador);
        double valor = Double.parseDouble(sc.nextLine());
        
        if(mayor < valor) {
          mayor = valor;
        }
        if(menor > valor) {
          menor = valor;
        }
        suma += valor;
      }

      double media = suma / numeros;
      
      //Imprimimos por pantalla
      System.out.printf(Locale.US, "El mayor de los números introducidos ha sido: %f%n", mayor);
      System.out.printf(Locale.US, "El menor de los números introducidos ha sido: %f%n", menor);
      System.out.printf(Locale.US, "La media de todos los números vale: %f%n", media);
      
    } else {
      
      //Mostramos mensaje si hay error
      System.out.println("La cantidad de números a introducir debe ser al menos uno");
    }

    
    

  }

}
