package prog.unidad03.repeticion;
import java.util.Scanner;

public class NumerosParesImparesEntreExtraApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Titulo del ejercicio
    System.out.println("PARES O IMPARES EN UN INTERVALO");
    
    //Declaro las variables
    int limiteInferior;
    int limiteSuperior;
    
    do {
    //Soluicitamos dos numeros
    System.out.print("Introcude el limite inferior: ");
    limiteInferior = Integer.parseInt(sc.nextLine());
    System.out.print("Introcude el limite superior: ");
    limiteSuperior = Integer.parseInt(sc.nextLine());
      if (limiteInferior > limiteSuperior) {
        System.out.printf("Error. El número de inicio (%d) debe ser menor o igual al de final (%d)%n", limiteSuperior, limiteInferior);
      }
    } while(limiteInferior > limiteSuperior);
    
    //Mostramos los valores
    if (limiteInferior <= limiteSuperior) {
      for(; limiteInferior <= limiteSuperior ; limiteInferior++){
        if (limiteInferior % 2 == 0) {
          System.out.printf("El número %d es par%n", limiteInferior);
        } else {
          System.out.printf("El número %d es impar%n", limiteInferior);
        }
        limiteInferior++;
      }
    } else {
      System.out.println("Los valores no son correctos. Terminado");
    }

  }

}
