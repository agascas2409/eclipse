import java.util.Locale;
import java.util.Scanner;

public class AreaTerreno {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //Pedimos las medidas que indica la imagen del ejercicio
    System.out.print("Introduce la base: ");
    double base = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce la altura mas baja: ");
    double alturaBaja = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce la altura mas alta: ");
    double alturaAlta = Double.parseDouble(sc.nextLine());
    
    //Para calcular el area de este terreno vamos a dividirlo en dos figuras y luego sumarlas, la primera sera un triangulo y otra un rectangulo
    
    //El triangulo
    double alturaTriangulo = alturaAlta - alturaBaja;
    double areaTriangulo = (base * alturaTriangulo) / 2;
    
    //El rectangulo
    double areaRectangulo = base * alturaBaja;
    
    //Calculamos y mostramos el area del terreno
    double areaTerreno = areaTriangulo + areaRectangulo;
    System.out.printf(Locale.US, "El area del terreno es: %f%n", areaTerreno);

  }

}
