package prog.unidad04.practica406.principal;
import java.time.LocalDate;
import java.util.Scanner;
import prog.unidad04.practica406.libreria.*;

public class VehiculosApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Muestro en pantalla mi nombre
    System.out.println("PRÁCTICA DE ANA GASPAR CASTILLO. GESTIÓN DE VEHÍCULOS");
    
    //Creamos las variables que usaremos a continuación
    Fecha fechaAutomovil = null;
    Automovil automovil = null;
    boolean salida = false;
    do {
      try {
        // Le pedimos al usario que introduzca la matricula del automovil 
        System.out.print("Introduce la matrícula del automóvil (4 números, 0 ó más espacios y tres letras mayúsculas):");
        String matricula = sc.nextLine();
        // Pedimos el dia de la fecha de matriculacion 
        System.out.print("Introduzca el día de la fecha de matriculación del automóvil: ");
        int dia = Integer.parseInt(sc.nextLine());
        // Pedimos el mes de la fecha de matr1iculacion 
        System.out.print("Introduzca el mes de la fecha de matriculación del automóvil: ");
        int mes = Integer.parseInt(sc.nextLine());
        // Pedimos el año de la fecha de matriculacion 
        System.out.print("Introduzca el año de la fecha de matriculación del automóvil: ");
        int anyo = Integer.parseInt(sc.nextLine());
        //Creamos la fecha de matriculacion del automovil
        fechaAutomovil = new Fecha(dia, mes, anyo);
        // Pedimos el color 
        System.out.print("Introduzca el color del automóvil (blanco, negro o azul): ");
        String color = sc.next();
        // Pedimos el numero de plazas del vehiculo
        System.out.print("Introduzca el número de plazas del vehículo (1 ó mas): ");
        int plazas = Integer.parseInt(sc.nextLine());
        //Creamos el automovil
        automovil = new Automovil(matricula, fechaAutomovil, color, plazas);
        salida = true;
      }catch (IllegalArgumentException e) {
        System.out.println("No se pudo crear el automovil. Revise los datos para comprobar que todos son correctos");
      } catch (NullPointerException e) {
        System.out.println("No se pudo crear el automovil. Revise los datos para comprobar que todos son correctos");
      } 
    } while (!salida);
    
    //Creamos las variables que usaremos a continuación
    Fecha fechaMotocicleta = null;
    Motocicleta motocicleta = null;
    boolean salida2 = false;
    do {
      try {
        // Pedimos la matricula de la moto 
        System.out.print("Introduce la matrícula del motocicleta (4 números, 0 ó más espacios " + "y tres letras mayúsculas): ");
        String matricula2 = sc.next();
        // Pedimos el dia de la fecha de matriculacion0
        System.out.print("Introduzca el día de la fecha de matriculación de la motocicleta: ");
        int dia2 = Integer.parseInt(sc.nextLine());
        // Pedimos el mes de la fecha de matriculacion
        System.out.print("Introduzca el mes de la fecha de matriculación de la motocicleta: ");
        int mes2 = Integer.parseInt(sc.nextLine());
        // Pedimos el año de la fecha de matriculacion
        System.out.print("Introduzca el año de la fecha de matriculación de la motocicleta: ");
        int anyo2 = Integer.parseInt(sc.nextLine());
        //Creamos la fecha de matriculacion del automovil
        fechaMotocicleta = new Fecha(dia2, mes2, anyo2);
        // Pedimos las cilindradas
        System.out.print("Introduzca la cilindrada de la motocicleta (50 ó mas): ");
        int cilindrada = Integer.parseInt(sc.nextLine());
        //Creamos el automovil
        motocicleta = new Motocicleta(matricula2, fechaMotocicleta, cilindrada);
        salida2 = true;
      } catch (NullPointerException e) {
        System.out.println("No se pudo crear el automovil. Revise los datos para comprobar que todos son correctos");
      } catch (IllegalArgumentException e) {
        System.out.println("No se pudo crear el automovil. Revise los datos para comprobar que todos son correctos");
      } 
    } while (!salida2);
  
    //Creamos los objetos necesarios
    // Con la clase LocalDate obtenemos la fecha actual
    LocalDate fechaActual = LocalDate.now();
    // Extraemos el año, mes y día de la fecha actual
    int anyoActual = fechaActual.getYear();
    int mesActual = fechaActual.getMonthValue();
    int diaActual = fechaActual.getDayOfMonth();
    
    //Creamos un nuevo objeto
    Fecha fechaComparar = new Fecha(diaActual, mesActual, anyoActual);
    
    // Imprimimos los datos del automovil
    System.out.printf("Los datos del automovil son %s%n", automovil.toString());
    System.out.printf("Su distintivo ambiental es %s%n", automovil.getDistintivo());

    // Imprimos los datos de la motocicleta
    System.out.printf("Los datos de la moto son %s%n", motocicleta.toString());
    System.out.printf("Su distintivo ambiental es %s%n", motocicleta.getDistintivo());
         
    // Imprimimos cuanto llevan matriculados
    System.out.printf("El automóvil lleva matriculado %d %n", fechaAutomovil.diasEntre(fechaComparar));
    System.out.printf("El motocicleta lleva matriculado %d %n", fechaMotocicleta.diasEntre(fechaComparar));

    //Comparar fechas
    int resultado = fechaAutomovil.compara(fechaMotocicleta);
    System.out.printf("%s%n", comparaVehiculos(resultado));
 
    // Imprimimos los vehiculos existentes
    System.out.printf("Número de vehículos matriculados: %d ", Vehiculo.getVehiculosMatriculados());
    
  }
  
  private static String comparaVehiculos(int resultado) {   
   if (resultado < 0) {
       return "El automovil se matriculo antes que la motocicleta";
   } else if (resultado > 0) {
      return "La motocicleta se matriculo antes que el vehiculo";
   } else {
       return "Son iguales";
   }
 }

}
