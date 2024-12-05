package prog.unidad04.actividad402.ejercicio04;
import java.util.Scanner;

public class PruebaLavadora {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    //Titulo del ejercicio
    System.out.println("PERSONAS");
    
    //Creamos a tres lavadoras
    Lavadora lavadora1 = new Lavadora();
    Lavadora lavadora2 = new Lavadora(500, 25);
    Lavadora lavadora3 = new Lavadora(650, 75, "rojo", 'A', 8);
    
    //Imprimimos a las personas
    System.out.println("Imprimimos las tres lavadoras");
    System.out.println("Precio Base: " + lavadora1.getPrecioBase() + ", Color: " + lavadora1.getColor() + ", Consumo Energetico: " + lavadora1.getEnergia() + ", Peso: " + lavadora1.getPeso() + ", Carga Maxima: " + lavadora1.getCarga());
    System.out.println("Precio Base: " + lavadora2.getPrecioBase() + ", Color: " + lavadora2.getColor() + ", Consumo Energetico: " + lavadora2.getEnergia() + ", Peso: " + lavadora2.getPeso() + ", Carga Maxima: " + lavadora2.getCarga());
    System.out.println("Precio Base: " + lavadora3.getPrecioBase() + ", Color: " + lavadora3.getColor() + ", Consumo Energetico: " + lavadora3.getEnergia() + ", Peso: " + lavadora3.getPeso() + ", Carga Maxima: " + lavadora3.getCarga());

    //Imprimimos los IMCs
    System.out.println("Imprimimos los precios finales de las tres lavadoras");
    System.out.println("Precio Lavadora 1 = " + lavadora1.getPrecioFinal());
    System.out.println("Precio Lavadora 2 = " + lavadora2.getPrecioFinal());
    System.out.println("Precio Lavadora 3 = " + lavadora3.getPrecioFinal());

  }

}
