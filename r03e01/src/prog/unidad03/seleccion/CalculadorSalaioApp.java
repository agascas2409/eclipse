package prog.unidad03.seleccion;
import java.util.Scanner;

public class CalculadorSalaioApp {
  public static int EUROS_POR_HORA = 16;
  public static int EUROS_POR_HORA_EXTRA = 20;
  public static int HORAS_POR_SEMANA = 40;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Titulo del ejercicio
    System.out.println("PROGRAMA CALCULADOR DE SALARIOS");
    
    //Pedimos las horas trabajadas esta semana
    System.out.print("Introduce las horas trabajadas esta semana: ");
    int horas = Integer.parseInt(sc.nextLine());
    
    if(horas > HORAS_POR_SEMANA) {
      //Calculamos las horas extras que se ha hecho esta semana
      int horasExtras = horas - HORAS_POR_SEMANA;
      //Calculamos el salario
      int salario = (HORAS_POR_SEMANA * EUROS_POR_HORA) + (horasExtras * EUROS_POR_HORA_EXTRA);
      System.out.printf("El salario por trabajar 40 horas normales y %d horas extra es de %d%n", horasExtras, salario);
    }else {
      //Calculamos el salario
      int salarioSinHorasExtras = horas * EUROS_POR_HORA;
      System.out.printf("El salario por trabajar %d horas es de %d%n", horas, salarioSinHorasExtras);
    }

  }

}
