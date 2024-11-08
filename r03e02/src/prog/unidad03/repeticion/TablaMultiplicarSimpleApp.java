package prog.unidad03.repeticion;
import java.util.Scanner;

public class TablaMultiplicarSimpleApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Titulo del ejercicio
    System.out.println("TABLA DE MULTIPLICAR DE.....");
    
    //Pedimos que tabla de multiplicar queremos mostrar
    System.out.print("¿De qué número entero quieres mostrar su tabla de multiplicar?: ");
    int numero = Integer.parseInt(sc.nextLine());
    
    //Mostramos la tabla
    System.out.printf("Tabla del %d%n", numero);
    for (int contador = 1; contador <= 10; contador++){
      int producto = numero * contador;
      System.out.printf("%d X %d = %d%n", numero, contador, producto);
      
    }

  }

}
