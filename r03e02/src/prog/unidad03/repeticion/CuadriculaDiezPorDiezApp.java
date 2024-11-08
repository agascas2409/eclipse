package prog.unidad03.repeticion;
import java.util.Scanner;

public class CuadriculaDiezPorDiezApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Titulo del ejercicio
    System.out.println("NÚMEROS DEL 1 AL 100");
    
    //Imprimimos los numeros
    for(int numero = 1; numero <= 100; numero++) {
      System.out.printf("%d\t", numero); 
      if(numero % 10 == 0) {
        System.out.println();
      }
    }

  }

}
