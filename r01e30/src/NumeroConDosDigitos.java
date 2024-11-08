import java.util.Scanner;

public class NumeroConDosDigitos {
  public static int VALOR_MAXIMO = 99;
  public static int VALOR_MINIMO = 10;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //Pedimos el numero por pantalla
    System.out.print("Introduce un numero: ");
    double numero = Double.parseDouble(sc.nextLine());
    
    //Comprobamos si tiene dos digitos
    boolean dosDigitos = (numero <= VALOR_MAXIMO) && (numero >= VALOR_MINIMO);
    System.out.printf("¿El numero no tiene dos digitos? %b%n", !dosDigitos);

  }

}
