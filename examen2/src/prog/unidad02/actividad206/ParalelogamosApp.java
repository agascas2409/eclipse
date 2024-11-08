package prog.unidad02.actividad206;
import java.util.Scanner;
import java.util.Locale;
import java.util.random.*;
import es.iespablopicasso.programacion.bloque02.figuras.*;

public class ParalelogamosApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //Muestro en pantalla mi nombre
    System.out.println("EXAMEN DE ANA GASPAR CASTILLO. PROPIEDADES DE LOS PARALELOGRAMOS");
    
    //Solicitar la longitud y los limites
    System.out.print("Introduzca la longitud de los lados horizontales: ");
    double longitud = Double.parseDouble(sc.nextLine());
    
    System.out.print("Introduzca el límite mínimo de los posibles valores de la longitud del lado vertical: ");
    double limiteMinimo = Double.parseDouble(sc.nextLine());
    
    System.out.print("Introduzca el límite maximo de los posibles valores de la longitud del lado vertical: ");
    double limiteMaximo = Double.parseDouble(sc.nextLine());
    
    //No se como generar un numero random
    //double numeroRandom = RandomGenerator(limiteMinimo, limiteMaximo);
    
    //Uso el numero del ejemplo
    double numero = 7.519901;
    System.out.printf(Locale.US, "La longitud del lado vertical obtenida al azar es de: %f%n", numero);
    
    //Creamos el objeto
    Paralelogramo paralelogramo = new Paralelogramo(longitud, numero);
    
    //Obtenemos el area y el perimetro
    String areaYPerimetro = paralelogramo.getAreaPerimetro();
    System.out.println(areaYPerimetro);
    
    //Extraemos el perimetro y el area
    String perimetro = areaYPerimetro.substring(12);
    String area = areaYPerimetro.substring(0, 11);
    System.out.printf("El área del paralelogramo vale %f y el perimetro vale %f%n", area, perimetro);
    
    //Pedimos un factor real positivo
    System.out.print("Introduzca el factor real positivo por el que quiere ampliar (mayor que 1) o reducir (menor que 1) el paralelogramo: ");
    double escala = Double.parseDouble(sc.nextLine());
    
    //Mostramos el paralelogramo con la escala aplicada
    Paralelogramo paralelogramoEscala = new Paralelogramo(longitud, numero); 
    paralelogramoEscala.escala(escala);
    String nuevoParalelogramo = paralelogramoEscala.getAreaPerimetro();
    System.out.println(nuevoParalelogramo);
    
    //Extraemos el perimetro y el area
    String perimetro2 = nuevoParalelogramo.substring(15);
    String area2 = nuevoParalelogramo.substring(0, 14);
    System.out.printf("Después del escalado, el área del paralelogramo vale %f y el perimetro vale %f%n", area2, perimetro2);
    
    //Cambiamos los String a double
    //double area3 = area2;
    
  }

}
