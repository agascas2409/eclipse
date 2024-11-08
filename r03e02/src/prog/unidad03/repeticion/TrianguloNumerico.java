package prog.unidad03.repeticion;

import java.util.Scanner;

public class TrianguloNumerico {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Titulo del ejercicio
    System.out.println("TRIÁNGULO DE NÚMEROS");
    
    //Pedimos la altura del triángulo
    System.out.print("Introduce la altura del triángulo (entero mayor que cero): ");
    int altura = Integer.parseInt(sc.nextLine());
    
    //Cuando la altura es valida
    if (altura > 0) {
      //Cada piso del triángulo
      for (int piso = 1; piso <= altura; piso++) {
        /*Primero imprimimos los espacios tantos como altura menos piso, 
         * después imprimimos la secuencia hacia arriba incluyendo el número del piso
         * despues imprimimos hacia abajo sin el piso
         * por ultimo completamos con espacios
         * y despues de cada piso un salto*/
        for(int i = 0; i < altura - piso; i++) {
          System.out.print(" ");
        }
        for(int j = 1; j <= piso; j++) {
          System.out.print(j);
        }
        for(int k = piso - 1; k > 0; k--) {
          System.out.print(k);
        }
        for(int l = 0; l < altura - piso; l++) {
          System.out.print(" ");
        }
        System.out.println();
      }
    } else {
      System.out.println("El número debe ser mayor que 0");
    }

  }

}
