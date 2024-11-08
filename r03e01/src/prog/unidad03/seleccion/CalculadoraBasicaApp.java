package prog.unidad03.seleccion;
import java.util.Locale;
import java.util.Scanner;

public class CalculadoraBasicaApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Titulo del ejercicio
    System.out.println("PROGRAMA CALCULADORA BÁSICA");
    
    //Preguntamos que operación quiere hacer el usuario
    System.out.print("Introduce la operación a realizar (S para suma, R para resta, P para producto y D para división): ");
    String operacion = sc.nextLine();
    
    //Pedimos los operandos
    System.out.print("Introduce el primer operando: ");
    double operando1 = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce el segundo operando: ");
    double operando2 = Double.parseDouble(sc.nextLine());
    
    //Realizamos la operación y la mostramos
    switch(operacion) {
    case "S": 
      double suma = operando1 + operando2;
      System.out.printf(Locale.US, "El resultado de sumar %f y %f vale %f%n", operando1, operando2, suma);
      break;
    case "R":
      double resta = operando1 - operando2;
      System.out.printf(Locale.US, "El resultado de restar %f y %f vale %f%n", operando1, operando2, resta);
      break;
    case "P":
      double producto = operando1 * operando2;
      System.out.printf(Locale.US, "El resultado de multiplicar %f y %f vale %f%n", operando1, operando2, producto);
      break;
    case "D":
      double division = operando1 / operando2;
      System.out.printf(Locale.US, "El resultado de dividir %f y %f vale %f%n", operando1, operando2, division);
      break;
    default:
      System.out.println("No se ha indicado ninguna operación");
      break;
    }

  }

}
