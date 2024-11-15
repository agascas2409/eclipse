package prog.unidad03.examen;
import java.util.Scanner;
import java.util.Locale;

public class SuperEstadisticaApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Muestro en pantalla mi nombre
    System.out.println("EXAMEN DE ANA GASPAR CASTILLO. CALCULO DE MEDIA");
    
    //Declaramos las variables necesarias
    int numero;
    int impar = 0;
    double media;
    double suma = 0;
    boolean termina = false;
    
    do {
      try {
      
        //Se pide un número por pantalla
        System.out.print("Introduce un número entero (0 para terminar): ");
        numero = Integer.parseInt(sc.nextLine());
      
        //Si el número es cero se termina el programa
        if (numero == 0) {  
          termina = true;
        } else {
          
          //Comprobamos si es positivo o negativo y lo mostramos por pantalla
          if (numero > 0){
            System.out.printf("El número %d es positivo.%n", numero);
          } else {
            System.out.printf("El número %d es negativo.%n", numero);
          }
          
          //Comprobamos si es par o impar y lo mostramos por pantalla
          if (numero % 2 == 0){
            System.out.printf("El número %d es par.%n", numero);
          } else {
            System.out.printf("El número %d es impar.%n", numero);
            //Comprobamos si lo contamos para la media
            if (numero > -11 && numero <= 20) {
              if (numero == -1 || numero == 3) {
                System.out.printf("El número %d entra en el cálculo%n", numero);
                //Vamos sumando los valores para después calcular la media
                suma = suma + numero;
                impar++;
              }
            } else {
              System.out.printf("El número %d entra en el cálculo%n", numero);
              //Vamos sumando los valores para después calcular la media
              suma = suma + numero;
              impar++;
            }
          }
          
        }
        
      } catch (NumberFormatException e) {
        //Mostramos si el valor introducido no es correcto
        System.out.println("El dato introducido no es un número entero válido.");
      }
    } while(!termina);

    //Mostramos por pantalla la media
    if (impar == 0) {
      System.out.println("La media es 0.");
    } else {
      media = suma / impar;
      System.out.printf(Locale.US, "La media de los números que cumplen la condición vale %f%n", media);
      //Mostramos el número de impares 
      System.out.printf("La cantidad de números que cumplen la condición es de %d%n", impar);
    }
    
    
  }

}
