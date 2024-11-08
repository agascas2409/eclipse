package prog.unidad03.seleccion;
import java.util.Scanner;
import java.util.Locale;

public class CalculaIMCApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Titulo del ejercicio
    System.out.println("PROGRAMA DE CÁLCULO DE ÍNDICE DE MASA CORPORAL");
    
    //Pedimos el peso y la altura
    System.out.print("Introduce tu peso en kilogramos: ");
    double peso = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce tu altura en metros: ");
    double altura = Double.parseDouble(sc.nextLine());
    
    //Calculamos el Indice de Masa Corporal (IMC)
    double imc = peso / (altura * altura);
    
    //Mostramos el diagnóstico
    if(imc < 16) {
      System.out.printf(Locale.US, "Su IMC ed de %f, con un diagnóstico de Ingreso en hospital por infrapeso%n", imc);
    }else if(imc < 17) {
      System.out.printf(Locale.US, "Su IMC ed de %f, con un diagnóstico de Infrapeso%n", imc);
    }else if(imc < 18) {
      System.out.printf(Locale.US, "Su IMC ed de %f, con un diagnóstico de Bajo peso%n", imc);
    }else if(imc < 25) {
      System.out.printf(Locale.US, "Su IMC ed de %f, con un diagnóstico de Peso normal (saludable)%n", imc);
    }else if(imc < 30) {
      System.out.printf(Locale.US, "Su IMC ed de %f, con un diagnóstico de Sobrepeso (obesidad de grado I)%n", imc);
    }else if(imc < 35) {
      System.out.printf(Locale.US, "Su IMC ed de %f, con un diagnóstico de Sobrepeso crónico (obesidad de grado II)%n", imc);
    }else if(imc < 40){
      System.out.printf(Locale.US, "Su IMC ed de %f, con un diagnóstico de Obesidad premórbida (obesidad de grado III)%n", imc);
    }else {
      System.out.printf(Locale.US, "Su IMC ed de %f, con un diagnóstico de Obesidad mórbida (obesidad de grado IV)%n", imc);
    }

  }

}
