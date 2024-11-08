import java.util.Scanner;
import java.util.Locale;

public class NumerosComplejos {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    //Pedimos el primer numero complejo
    System.out.print("Introduce la parte real del primer numero: ");
    double parteReal1 = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce la parte imaginaria del primer numero: ");
    double parteImaginaria1 = Double.parseDouble(sc.nextLine());
    
    //Creamos el primer número complejo
    Complejo complejo1 = new Complejo(parteReal1, parteImaginaria1);
    
    //Pedimos el segundo numero complejo
    System.out.print("Introduce la parte real del segundo numero: ");
    double parteReal2 = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce la parte imaginaria del segundo numero: ");
    double parteImaginaria2 = Double.parseDouble(sc.nextLine());
    
    //Creamos el segundo número complejo
    Complejo complejo2 = new Complejo(parteReal2, parteImaginaria2);
    System.out.println();
    
    //Hacemos la suma, resta, multiplicación y división
    Complejo suma = complejo1.sumar(complejo2);
    Complejo resta = complejo1.restar(complejo2);
    Complejo multiplicacion = complejo1.multiplicar(complejo2);
    Complejo division = complejo1.dividir(complejo2);
    
    
    //Imprimimos los resultados
    System.out.printf(Locale.US, "La suma de los numeros complejos es: ", suma);
    System.out.printf(Locale.US, "La resta de los numeros complejos es: ", resta);
    System.out.printf(Locale.US, "La multiplicación de los numeros complejos es: ", multiplicacion);
    System.out.printf(Locale.US, "La división de los numeros complejos es: ", division);

  }

}
