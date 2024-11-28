package prog.unidad04.actividad402.ejercicio02;

/**
 * Prueba de la clase pizza
 */
public class PruebaPizza {

  public static void main(String[] args) {
    //Cabezera
    System.out.println("PROGRAMA DE PRUEBA DE PIZZAS 3");
    
    //Creamos dos pizzas distintas
    Pizza pizza1 = new Pizza("mediana", "margarita");
    Pizza pizza2 = new Pizza("familiar", "funghi");
    
    //Intentamos crear pizzas con valiores erroneos y debe imprimir los errores
    Pizza pizzaErronea1 = new Pizza("grande", "funghi");
    Pizza pizzaErronea2 = new Pizza("mediana", "barbacoa");
    
    //Servimos la segunda pizza
    pizza2.servir();
    
    //Creamos otra pizza mas
    Pizza pizza3 = new Pizza("mediana", "cuatro quesos");
    
    //Imprimimos las pizzas
    System.out.printf("Pizza 1. %s%n", pizza1.obtenerCadena());
    System.out.printf("Pizza 2. %s%n", pizza2.obtenerCadena());
    System.out.printf("Pizza 3. %s%n", pizza3.obtenerCadena());
    
    //Servimos la segunda pizza otra vez para ver el mensaje de error
    pizza2.servir();
    
    //Mostramos el número de pizas creadas y servidas
    System.out.println("Número de pizzas creadas: " + Pizza.getPizzasCreadas());
    System.out.println("Número de pizzas servidas: " + Pizza.getPizzasServidas());

  }

}
