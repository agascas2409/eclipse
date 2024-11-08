import java.util.Scanner;
import java.util.Locale;

public class CrearPersonaPidiendoDatos {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
  //Creamos una persona
    Persona persona = new Persona();
    
    //Solicitamos los datos de la persona
    System.out.print("Introduce la edad de la persona: ");
    persona.edad = Integer.parseInt(sc.nextLine());
    System.out.print("Introduce el peso de la persona: ");
    persona.peso = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce el numero de hijos de la persona: ");
    persona.numeroHijos = Integer.parseInt(sc.nextLine());
    
    //Mostramos en pantalla
    System.out.printf(Locale.US, "La persona tiene %d años, pesa %f kilos y tiene %d hijos.%n", persona.edad, persona.peso, persona.numeroHijos);
    
  }

}
