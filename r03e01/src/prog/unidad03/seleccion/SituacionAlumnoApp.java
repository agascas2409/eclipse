package prog.unidad03.seleccion;

import java.util.Scanner;

public class SituacionAlumnoApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Titulo del ejercicio
    System.out.println("PROMOCIONA O NO PROMOCIONA");
    
    //Pedimos todas las notas de los trimestres
    System.out.print("Introduce la calificación de Matemáticas: ");
    double matematicas = Double.parseDouble(sc.nextLine());
    
    System.out.print("Introduce la calificación de Lengua: ");
    double lengua = Double.parseDouble(sc.nextLine());
    
    //Comprobamos si ha aprobado o suspendido
    if (matematicas < 5) {
      if(lengua < 5) {
        System.out.println("El alumno no promociona");
      } else {
        System.out.println("El alumno promociona con una asignatura pendiente");
      }
    } else {
      if(lengua < 5) {
        System.out.println("El alumno promociona con una asignatura pendiente");
      } else {
        System.out.println("El alumno promociona");
      }
      
    }

  }

}
