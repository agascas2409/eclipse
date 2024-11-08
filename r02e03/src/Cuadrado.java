import java.util.Locale;

public class Cuadrado {

  public static void main(String[] args) {
    
    //Creamos el lapiz
    Lapiz lapiz = new Lapiz();
    
    //Bajamos el lapiz
    lapiz.baja();
    //Desplazamos 20 puntos
    lapiz.desplaza(20);
    //Rotamos 90 grados (sentido de las agujas del reloj)
    lapiz.gira(-90);
    //Movemos 20 puntos
    lapiz.desplaza(20);
    //Repetimos los dos unltimos pasos dos veces
    lapiz.gira(-90);
    lapiz.desplaza(20);
    lapiz.gira(-90);
    lapiz.desplaza(20);
    
    //Debemos tener cuatro trazos
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

  }

}
