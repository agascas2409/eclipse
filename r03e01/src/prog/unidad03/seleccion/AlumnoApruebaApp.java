package prog.unidad03.seleccion;
import java.util.Scanner;

public class AlumnoApruebaApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Titulo del ejercicio
    System.out.println("APROBADOS Y SUSPENSOS");
    
    //Pedimos todas las notas de los trimestres
    System.out.print("Introduce la calificación de la primera evaluación: ");
    double notaTrimestre1 = Double.parseDouble(sc.nextLine());
    
    System.out.print("Introduce la calificación de la segunda evaluación: ");
    double notaTrimestre2 = Double.parseDouble(sc.nextLine());
    
    System.out.print("Introduce la calificación de la tercera evaluación: ");
    double notaTrimestre3 = Double.parseDouble(sc.nextLine());
    
    //Calculamos la media de los trimestres
    double mediaDelCurso = (notaTrimestre1 + notaTrimestre2 + notaTrimestre3) / 3;
    
    //Comprobamos si ha aprobado o suspendido
    if (mediaDelCurso < 5) {
      System.out.printf("El alumno ha suspendido con una media de %f%n", mediaDelCurso);
    } else {
      System.out.printf("El alumno ha aprobado con una media de %f%n", mediaDelCurso);
    }

  }

}
