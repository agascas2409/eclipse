import java.util.Locale;

public class Personas {

  public static void main(String[] args) {
    
    //Creamos a las personas con su información
    Persona persona1 = new Persona();
    persona1.edad = 25;
    persona1.numeroHijos = 0;
    persona1.peso = 75.4;
    Persona persona2 = new Persona();
    persona2.edad = 65;
    persona2.numeroHijos = 3;
    persona2.peso = 65;
    
    //Imprimimos por pantalla
    System.out.printf(Locale.US, "La primera persona tiene %d años, pesa %f kilos y tiene %d hijos.%n", persona1.edad, persona1.peso, persona1.numeroHijos);
    System.out.printf(Locale.US, "La segunda persona tiene %d años, pesa %f kilos y tiene %d hijos.%n", persona2.edad, persona2.peso, persona2.numeroHijos);
    
    //Añadimos el segundo ejercicio, que nos diga true o false
    System.out.printf("¿Las dos personas son iguales?: %b%n", persona1 == persona2);
    
  }

}
