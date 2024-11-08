package prog.unidad03.seleccion;
import java.util.Scanner;
import java.util.Locale;
import java.lang.Math;

public class EcuacionesSegundoGradoApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Titulo del ejercicio
    System.out.println("PROGRAMA DE CÁLCULO DE ECUACIONES DE SEGUNDO GRADO");
    
    //Pedimos los datos necesarios para tener una ecuación de segundo grado
    System.out.print("Introduce el valor del coeficiente a: ");
    double coeficienteA = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce el valor del coeficiente b: ");
    double coeficienteB = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce el valor del coeficiente c: ");
    double coeficienteC = Double.parseDouble(sc.nextLine());
    
    //Calculamos lo que esta dentro de la raiz
    double raiz = (coeficienteB * coeficienteB) - (4 * coeficienteA * coeficienteC); 
    
    //Mostramos el numero de solucioes que tiene
    if(raiz < 0) {
      System.out.println("La ecuanción no tiene soluciones reales.");
    }else if(raiz == 0) {
      System.out.println("La ecuanción tiene una única solución real.");
      double solucion = - coeficienteB / 2 * coeficienteA;
      System.out.printf(Locale.US, "La solución a esta ecuación es: %f%n", solucion);
    }else {
      System.out.println("La ecuanción tiene dos soluciones reales.");
      double solucion1 = - coeficienteB + Math.sqrt(raiz) / 2 * coeficienteA;
      double solucion2 = - coeficienteB - Math.sqrt(raiz) / 2 * coeficienteA;
      System.out.printf(Locale.US, "La primera solución a esta ecuación es: %f%n", solucion1);
      System.out.printf(Locale.US, "La segunda solución a esta ecuación es: %f%n", solucion2);
    }
    
  }

}
