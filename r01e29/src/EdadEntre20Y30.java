import java.util.Scanner;

public class EdadEntre20Y30 {
  public static int VALOR_MINIMO = 20;
  public static int VALOR_MAXIMO = 30;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //Pedimos la edad
    System.out.print("Introduce tu edad: ");
    int edad = Integer.parseInt(sc.nextLine());
    
    //Comprobamos con los valores
    boolean edadComprendida = (edad >= VALOR_MINIMO) && (edad < VALOR_MAXIMO);
    System.out.printf("¿La edad es igual o mayor que 20 pero menor que 30? %b%n", edadComprendida);

  }

}
