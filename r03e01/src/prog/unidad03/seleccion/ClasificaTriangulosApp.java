package prog.unidad03.seleccion;

import java.util.Scanner;

public class ClasificaTriangulosApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Titulo del ejercicio
    System.out.println("PROGRAMA CLASIFICADOR DE TRIÁNGULOS");
    
    //Pedimos los lados del triangulo
    System.out.print("Introduce la longitud del primer lado: ");
    double lado1 = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce la longitud del segundo lado: ");
    double lado2 = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce la longitud del tercer lado: ");
    double lado3 = Double.parseDouble(sc.nextLine());
    
    //Comprobamos que tipo de triánulo es
    if(lado1 == lado2) {
      if(lado1 == lado3) {
        System.out.println("El triángulo es equilátero");
      }else {
        System.out.println("El triángulo es isósceles");
      }
    }else{
      if(lado1 == lado3) {
        System.out.println("El triángulo es isósceles");
      }else if(lado2 == lado3){
        System.out.println("El triángulo es isósceles");
      }else {
        System.out.println("El triángulo es escaleno");
      }
    }

  }

}
