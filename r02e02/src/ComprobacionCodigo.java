
public class ComprobacionCodigo {

  public static void main(String[] args) {
    
    //Añadimos el resultado al inicio
    System.out.println("De las tres últimas líneas solo la tercera da error debido a que persona3 = null");
    
    //Copiamos el codigo para ver que pasa
    Persona persona1 = new Persona();
    persona1.edad = 25;
    persona1.peso = 40.5;
    Persona persona2 = new Persona();
    persona2.edad = 35;
    persona2.peso = 55.6;
    Persona persona3 = persona2;
    persona3.edad = 40;
    persona3 = null;
    System.out.printf("Edad persona1 = %d%n", persona1.edad);
    System.out.printf("Edad persona2 = %d%n", persona2.edad);
    System.out.printf("Edad persona3 = %d%n", persona3.edad);

  }

}
