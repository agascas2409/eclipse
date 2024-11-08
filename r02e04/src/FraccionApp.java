import java.util.Scanner;
import paquete1.Fraccion;


public class FraccionApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //Solicitamos los datos de la primera fraccion
    System.out.print("Introduce el numerador de la primera fracción: ");
    int numerador1 = Integer.parseInt(sc.nextLine());
    System.out.print("Introduce el denominador de la primera fracción: ");
    int denominador1 = Integer.parseInt(sc.nextLine());
    
    //Creamos la primera fraccion
    Fraccion fraccion1 = new Fraccion(numerador1, denominador1);
    
    //Solicitamos los datos de la segunda fraccion
    System.out.print("Introduce el numerador de la segunda fracción: ");
    int numerador2 = Integer.parseInt(sc.nextLine());
    System.out.print("Introduce el denominador de la segunda fracción: ");
    int denominador2 = Integer.parseInt(sc.nextLine());
    
    //Creamos la segunda fraccion
    Fraccion fraccion2 = new Fraccion(numerador2, denominador2);
    
    //Realizamos la suma, resta, multiplicacion y division
    Fraccion suma = fraccion1.suma(fraccion2);
    Fraccion resta = fraccion1.resta(fraccion2);
    Fraccion multiplicacion = fraccion1.producto(fraccion2);
    Fraccion division = fraccion1.division(fraccion2);
    
    //Mostramos los resultados por pantalla
    System.out.println("La suma de las fracciones es: " + suma.getNumerador() + "/" + suma.getDenominador());
    System.out.println("La resta de las fracciones es: " + resta.getNumerador() + "/" + resta.getDenominador());
    System.out.println("La multiplicacion de las fracciones es: " + multiplicacion.getNumerador() + "/" + multiplicacion.getDenominador());
    System.out.println("La division de las fracciones es: " + division.getNumerador() + "/" + division.getDenominador());
    
    //Creamos nuevas operaciones
    paquete2.Fraccion otraSuma = new paquete2.Fraccion(suma.getNumerador(), suma.getDenominador());
    paquete2.Fraccion otraResta = new paquete2.Fraccion(resta.getNumerador(), resta.getDenominador());
    paquete2.Fraccion otraMultiplicacion = new paquete2.Fraccion(multiplicacion.getNumerador(), multiplicacion.getDenominador());
    paquete2.Fraccion otraDivision = new paquete2.Fraccion(division.getNumerador(), division.getDenominador());
    
    //Simplificamos las operaciones
    paquete2.Fraccion sumaSimplificada = otraSuma.simplifica();
    paquete2.Fraccion restaSimplificada = otraResta.simplifica();
    paquete2.Fraccion multiplicacionSimplificada = otraMultiplicacion.simplifica();
    paquete2.Fraccion divisionSimplificada = otraDivision.simplifica();
    
    //Y las imprimimos
    System.out.println("La suma simplificada de las fracciones es: " + sumaSimplificada.getNum() + "/" + sumaSimplificada.getDen());
    System.out.println("La resta simplificada de las fracciones es: " + restaSimplificada.getNum() + "/" + restaSimplificada.getDen());
    System.out.println("La multiplicacion simplificada de las fracciones es: " + multiplicacionSimplificada.getNum() + "/" + multiplicacionSimplificada.getDen());
    System.out.println("La division simplificada de las fracciones es: " + divisionSimplificada.getNum() + "/" + divisionSimplificada.getDen());
    
  }

}
