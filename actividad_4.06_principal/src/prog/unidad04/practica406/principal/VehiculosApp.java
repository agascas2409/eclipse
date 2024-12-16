package prog.unidad04.practica406.principal;
import java.util.Scanner;
import java.time.LocalDate;

public class VehiculosApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Muestro en pantalla mi nombre
    System.out.println("PRÁCTICA DE ANA GASPAR CASTILLO. GESTIÓN DE VEHÍCULOS");
    
    System.out.print("Introduce la matricula del automovil (4 números, 0 o más espacioes y tres letras mayúsculas): ");
    String matricula = sc.nextLine();
    System.out.print("Introduzca el día de la fecha de matriculación del automóvil: ");
    int dia = Integer.parseInt(sc.nextLine());
    System.out.print("Introduzca el mes de la fecha de matriculación del automóvil: ");
    int mes = Integer.parseInt(sc.nextLine());
    System.out.print("Introduzca el año de la fecha de matriculación del automóvil: ");
    int anyo = Integer.parseInt(sc.nextLine());
    System.out.print("Introduzca el color del automóvil (blanco, negro o azul): ");
    String color = sc.nextLine();
    System.out.print("Introduzca el número de plazas del automóvil (1 ó mas): ");
    int plazas = Integer.parseInt(sc.nextLine());
    Automovil automovil = new Automovil(matricula, new Fecha(dia, mes, anyo), color, plazas);
    
    System.out.print("Introduce la matricula del automovil (4 números, 0 o más espacioes y tres letras mayúsculas): ");
    String matricula2 = sc.nextLine();
    System.out.print("Introduzca el día de la fecha de matriculación del automóvil: ");
    int dia2 = Integer.parseInt(sc.nextLine());
    System.out.print("Introduzca el mes de la fecha de matriculación del automóvil: ");
    int mes2 = Integer.parseInt(sc.nextLine());
    System.out.print("Introduzca el año de la fecha de matriculación del automóvil: ");
    int anyo2 = Integer.parseInt(sc.nextLine());
    System.out.print("Introduzca la cilindrada de la motocicleta (50 ó mas): ");
    int cilindradas = Integer.parseInt(sc.nextLine());
    Motocicleta motocicleta = new Motocicleta(matricula, new Fecha(dia, mes, anyo), cilindradas);
    
    System.out.println("Los datos del automóvil son: " + automovil.toString());
    System.out.println("Su distintivo ambiental es: " + automovil.getDistintivo());
    System.out.println("Los datos de la motocicleta son: " + motocicleta.toString());
    System.out.println("Su distintivo ambiental es: " + motocicleta.getDistintivo());
    System.out.println("El automóvil lleva matriculado: " + automovil.getDiasTranscurridos());
    System.out.printlnn("La motocicleta lleva matriculada: " + motocicleta.getDiasTranscurridos());
    System.out.println("Número de vehículos matriculados: " + getVehiculosMatriculados());
  }

}
