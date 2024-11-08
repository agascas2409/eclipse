package r01e01;

public class CalculoConVariables {

  public static void main(String[] args) {
    
    //Creamos las variables
    int valor1 = 256;
    int valor2 = 398;
    
    //Mostramos los valores en pantalla
    System.out.println("Estos son los valores con los que vamos a trabajar " + valor1 + " y " + valor2);
   
    //Hacemos las cuentas que nos pide el ejercicio
    System.out.printf("El resultado de la suma es: %s %n", valor1 + valor2);
    System.out.printf("El resultado de la diferencia es: %s %n", valor1 - valor2);
    System.out.printf("El resultado del producto es: %s %n", valor1 * valor2);
    System.out.printf("El resultado del cociente es: %s %n", valor1 / valor2);
    System.out.printf("El resultado del modulo es: %s %n", valor1 % valor2);

  }

}
