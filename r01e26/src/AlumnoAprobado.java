
import java.util.Scanner;

public class AlumnoAprobado {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    
  //Pedimos todas las notas que hacen falta
    System.out.print("Introduce la nota del primer Trimestre: ");
    double notaTrimestre1 = Double.parseDouble(sc.nextLine());
    
    System.out.print("Introduce la nota del segundo Trimestre: ");
    double notaTrimestre2 = Double.parseDouble(sc.nextLine());
    
    System.out.print("Introduce la nota del tercer Trimestre: ");
    double notaTrimestre3 = Double.parseDouble(sc.nextLine());
    
    //Calculamos la media y comprobamos si esta aprobado
    double media = (notaTrimestre1 + notaTrimestre2 + notaTrimestre3) / 3;
    boolean aprobado = media >= 5;
    
    //Mostramos en patalla
    System.out.printf("¿El alumno esta aprobado?: %b%n", aprobado);

  }

}
