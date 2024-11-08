package prog.unidad03.repeticion;
import java.util.Scanner;

public class InvierteNumero {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Titulo del ejercicio
    System.out.println("INVERSIÓN DE NÚMEROS");
    
    //Solicitamos el numero a invertir
    System.out.print("Introduce un número entero positivo: ");
    int numero = Integer.parseInt(sc.nextLine());
    
    //Creamos variables
    int inverso = 0;
    int resto = numero;
    
    while(resto > 0) {
      //Extraemos el último digito y actualizamos el resto
      int digito = resto % 10;
      resto /= 10;
      
      //Añadimos el digito al inverso, multiplicandolo antes por 10 para hacer hueco para el digito
      inverso = inverso * 10 + digito;
    }
    
    //Imprimimos por pantalla el resultado
    System.out.printf("El resultado de invertir el número %d es %d%n", numero, inverso);

  }

}
