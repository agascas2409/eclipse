package r01e18;
import java.util.Locale;
import java.util.Scanner;

public class NotaEvaluacion {
  public static double EXAMENES_DURANTE_TRIMESTRE = 0.55;
  public static double EXAMEN_FINAL = 0.3;
  public static double TRABAJO_EXPUESTO = 0.15;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //Pedimos todas las notas que hacen falta
    System.out.print("Introduce la nota del primer examen del curso: ");
    double notaExamen1 = Double.parseDouble(sc.nextLine());
    
    System.out.print("Introduce la nota del segundo examen del curso: ");
    double notaExamen2 = Double.parseDouble(sc.nextLine());
    
    System.out.print("Introduce la nota del tercer examen del curso: ");
    double notaExamen3 = Double.parseDouble(sc.nextLine());
    
    System.out.print("Introduce la nota del examen final del curso: ");
    double notaExamenFinal = Double.parseDouble(sc.nextLine());
    
    System.out.print("Introduce la nota del trabajo del curso: ");
    double notaTrabajo = Double.parseDouble(sc.nextLine());
    
    //Calculamos la media de los examenes
    double mediaExamenes = (notaExamen1 + notaExamen2 + notaExamen3) / 3;
    
    //Calculamos el porcentaje de cada uno
    double notaFinal = (mediaExamenes * EXAMENES_DURANTE_TRIMESTRE) + (notaExamenFinal * EXAMEN_FINAL) + (notaTrabajo * TRABAJO_EXPUESTO);
    System.out.printf(Locale.US, "La nota del alumno en Programación y Computación es de: %f%n", notaFinal);

  }

}
