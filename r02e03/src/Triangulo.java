import java.util.Locale;

public class Triangulo {

  public static void main(String[] args) {
    
    //Creamos el lapiz
    Lapiz lapiz = new Lapiz();
    
    //Movemos el lapiz al punto de inicio
    lapiz.mueve(new Punto(20,35));
    
    //Bajamos el lapiz
    lapiz.baja();
    
    //Desplazamos la base
    lapiz.desplaza(30);
    
    //Giramos 120 grados
    lapiz.gira(120);
    
    //Dibujamos el trazo izquierdo
    lapiz.desplaza(30);
    
    //Volvemos a girar y dibujar
    lapiz.gira(120);
    lapiz.desplaza(30);
    
  //Debemos tener tres trazos
    System.out.printf("Trazos = %d%n", lapiz.getNumTrazos());
    
    //Y los imprimimos
    Linea trazo = lapiz.getTrazo(1);
    System.out.printf(Locale.US, "Linea 1 = (%f, %f) - (%f, %f)%n", trazo.getInicio().getX(), trazo.getInicio().getY(), trazo.getFin().getX(), trazo.getFin().getY());
    trazo = lapiz.getTrazo(2);
    System.out.printf(Locale.US, "Linea 2 = (%f, %f) - (%f, %f)%n", trazo.getInicio().getX(), trazo.getInicio().getY(), trazo.getFin().getX(), trazo.getFin().getY());
    trazo = lapiz.getTrazo(3);
    System.out.printf(Locale.US, "Linea 3 = (%f, %f) - (%f, %f)%n", trazo.getInicio().getX(), trazo.getInicio().getY(), trazo.getFin().getX(), trazo.getFin().getY());

    
    

  }

}
