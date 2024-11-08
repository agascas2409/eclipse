import java.util.Scanner;


public class EdadMayorQueOtraEdad {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //Pedimos la tres edades
    System.out.print("Introduce la primera edad: ");
    int edad1 = Integer.parseInt(sc.nextLine());
    System.out.print("Introduce la segunda edad: ");
    int edad2 = Integer.parseInt(sc.nextLine());
    System.out.print("Introduce la tercera edad: ");
    int edad3 = Integer.parseInt(sc.nextLine());
    
    //Comprobamos lo que nos piden
    boolean masEdad = (edad1 > edad2) && (edad2 > edad3);
    System.out.printf("¿Es la primera edad mayor que la segunda y la segunda mayor que tercera? %b%n", masEdad);
   

  }

}
