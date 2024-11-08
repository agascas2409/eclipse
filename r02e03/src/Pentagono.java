import java.util.Locale;

public class Pentagono {

  public static void main(String[] args) {
    
    
    //Creamos el lapiz
    Lapiz lapiz = new Lapiz();
    
    //Nos movemos al punto de inicio
    lapiz.mueve(new Punto(25,55));
    
    //Bajamos el lapiz
    lapiz.baja();
    
    //Dibujamos la base
    lapiz.desplaza(20);
    
    //Giramos 72 grados
    lapiz.gira(72);
    
    //Repetimos cuatro veces
    lapiz.desplaza(20);
    lapiz.gira(72);
    lapiz.desplaza(20);
    lapiz.gira(72);
    lapiz.desplaza(20);
    lapiz.gira(72);
    lapiz.desplaza(20);
    
  //Debemos tener cinco trazos
    System.out.printf("Trazos = %d%n", lapiz.getNumTrazos());
    
    //Y los imprimimos
    Linea trazo = lapiz.getTrazo(1);
    System.out.printf(Locale.US, "Linea 1 = (%f, %f) - (%f, %f)%n", trazo.getInicio().getX(), trazo.getInicio().getY(), trazo.getFin().getX(), trazo.getFin().getY());
    trazo = lapiz.getTrazo(2);
    System.out.printf(Locale.US, "Linea 2 = (%f, %f) - (%f, %f)%n", trazo.getInicio().getX(), trazo.getInicio().getY(), trazo.getFin().getX(), trazo.getFin().getY());
    trazo = lapiz.getTrazo(3);
    System.out.printf(Locale.US, "Linea 3 = (%f, %f) - (%f, %f)%n", trazo.getInicio().getX(), trazo.getInicio().getY(), trazo.getFin().getX(), trazo.getFin().getY());
    trazo = lapiz.getTrazo(4);
    System.out.printf(Locale.US, "Linea 4 = (%f, %f) - (%f, %f)%n", trazo.getInicio().getX(), trazo.getInicio().getY(), trazo.getFin().getX(), trazo.getFin().getY());
    trazo = lapiz.getTrazo(5);
    System.out.printf(Locale.US, "Linea 5 = (%f, %f) - (%f, %f)%n", trazo.getInicio().getX(), trazo.getInicio().getY(), trazo.getFin().getX(), trazo.getFin().getY());


  }

}
