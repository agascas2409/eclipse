import java.util.Scanner;

public class EdadConducir {
  public static int EDAD_MINIMA = 18;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
      //Preguntamos la edad
      System.out.print("Introduce tu edad: ");
      int edad = Integer.parseInt(sc.nextLine());
      
      //Calculamos la media y comprobamos si esta aprobado
      boolean mayorDeEdad = edad >= EDAD_MINIMA;
      
      //Mostramos en patalla
      System.out.printf("¿Esta persona puede tener carnet de conducir?: %b%n", mayorDeEdad);

    }

  }
