package prog.unidad04.actividad402.ejercicio03;
import java.util.Scanner;

public class PruebaPersona {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Titulo del ejercicio
    System.out.println("PERSONAS");
    
    //Creamos a tres personas
    Persona persona1 = new Persona();
    Persona persona2 = new Persona("Paco", 17, 'H');
    Persona persona3 = new Persona("Paqui", 26, 'M', 76.6, 1.67);
    
    //Imprimimos a las personas
    System.out.println("Imprimimos las tres personas");
    System.out.println(persona1.toString());
    System.out.println(persona2.toString());
    System.out.println(persona3.toString());

    //Imprimimos los IMCs
    System.out.println("Imprimimos los IMCs de las tres personas");
    System.out.println("IMC Persona 1 = " + persona1.getIMC());
    System.out.println("IMC Persona 2 = " + persona2.getIMC());
    System.out.println("IMC Persona 3 = " + persona3.getIMC());
    
    //Imprimimos si los pesos son correctos
    System.out.println("Imprimimos si los pesos de las personas es correcto o no");
    System.out.println("Peso correcto Persona 1 = " + persona1.getPesoCorrecto());
    System.out.println("Peso correcto Persona 2 = " + persona2.getPesoCorrecto());
    System.out.println("Peso correcto Persona 3 = " + persona3.getPesoCorrecto());
    
    //Imprimimos si las personas son mayores de edad
    System.out.println("¿Son las personas mayores de edad?");
    System.out.println("Persona 1 = " + persona1.esMayorEdad());
    System.out.println("Persona 2 = " + persona2.esMayorEdad());
    System.out.println("Persona 3 = " + persona3.esMayorEdad());
    
  }

}
