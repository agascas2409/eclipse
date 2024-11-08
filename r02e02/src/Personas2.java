import java.util.Locale;

public class Personas2 {

  public static void main(String[] args) {
    
    //Creamos a las personas con su información
    Persona persona1 = new Persona();
    persona1.edad = 33;
    persona1.numeroHijos = 1;
    persona1.peso = 80.43;
    Persona persona2 = persona1;
    persona2.peso = 79.65;
    
    //Imprimimos por pantalla
    System.out.printf(Locale.US, "La primera persona tiene %d años, pesa %f kilos y tiene %d hijos.%n", persona1.edad, persona1.peso, persona1.numeroHijos);
    System.out.printf(Locale.US, "La segunda persona tiene %d años, pesa %f kilos y tiene %d hijos.%n", persona2.edad, persona2.peso, persona2.numeroHijos);
    System.out.println("Al tener la referencia de persona1 en persona2 cualquier cambio que se haga en persona2 afecta a persona1");
    
    //Repetimos el ejercicio 2
    System.out.printf("¿Las dos personas son iguales?: %b%n", persona1 == persona2);
    
  }

}
