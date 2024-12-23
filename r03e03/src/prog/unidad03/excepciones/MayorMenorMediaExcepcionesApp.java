package prog.unidad03.excepciones;

import java.util.Locale;
import java.util.Scanner;

public class MayorMenorMediaExcepcionesApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Titulo del ejercicio
    System.out.println("MAYOR, MENOR Y MEDIA (A PRUEBA DE USUARIOS MALICIOSOS)");
    
    boolean terminar = false;
    boolean terminar2 = false;
    boolean terminar3 = false;
    
    do {
      try {
        //Preguntamos cuantos numeros se van a introducir
        System.out.print("¿Cuántos números deseas introcucir?: ");
        int numeros = Integer.parseInt(sc.nextLine());
        
        if (numeros > 0) {
          do {
            try {
              
              //Pedimos el primer numero
              System.out.printf("Introduce el número 1: ");
              double numero = Double.parseDouble(sc.nextLine());

              //Declaramos mayor, menor y suma
              double mayor = numero;
              double menor = numero;
              double suma = numero;
              
              do {
                try {
                  for (int contador = 2; contador <= numeros; contador++) {
                    //Pedimos los demas numeros
                    System.out.printf("Introduce el número %d: ", contador);
                    double valor = Double.parseDouble(sc.nextLine());
                    
                    //Comprobamos si es mayor
                    if (mayor < valor) {
                      mayor = valor;
                    }
                    //Comprobamos si es menor
                    if (menor > valor) {
                      menor = valor;
                    }
                    
                    suma += valor;
                  }

                  double media = suma / numeros;

                  //Imprimimos por pantalla
                  System.out.printf(Locale.US, "El mayor de los números introducidos ha sido: %f%n", mayor);
                  System.out.printf(Locale.US, "El menor de los números introducidos ha sido: %f%n", menor);
                  System.out.printf(Locale.US, "La media de todos los números vale: %f%n", media);
                  terminar3 = true;
                  
                } catch (NumberFormatException e) {
                  System.out.println("El valor introducido no es un número real correcto. Intentelo de nuevo");
                }
                
              } while(!terminar3);
              terminar2 = true;
              
            } catch (NumberFormatException e) {
              System.out.println("El valor introducido no es un número real correcto. Intentelo de nuevo");
            } 
            
          } while (!terminar2);
          terminar = true;

        } else {
          //Mostramos mensaje si hay error
          System.out.println("La cantidad de números a introducir debe ser al menos uno");
        }
        
      } catch (NumberFormatException e) {
        System.out.println("El valor introducido no es un número entero correcto. Intentelo de nuevo");
      } 
      
    } while (!terminar);

  }

}
