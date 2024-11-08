import es.iespablopicasso.programacion.unidad02.actividad0201.GranHermano;

public class GranHermanoApp {

  public static void main(String[] args) {
    
    //Creamos 3 objetos
    GranHermano hermano1 = new GranHermano(11);
    GranHermano hermano2 = new GranHermano(20);
    GranHermano hermano3 = new GranHermano(50);
    
    //Mostramos el numero de objetos creados
    System.out.println("El numero de objetos creados es: " + GranHermano.getNumeroObjetosCreados());
    
    //Repetimos los pasos anteriores
    GranHermano hermano4 = new GranHermano(30);
    GranHermano hermano5 = new GranHermano(60);
    
    System.out.println("El numero de objetos creados es: " + GranHermano.getNumeroObjetosCreados());
    

  }

}
