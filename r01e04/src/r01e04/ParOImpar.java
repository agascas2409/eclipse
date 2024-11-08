package r01e04;

public class ParOImpar {

  public static void main(String[] args) {
    
    //Declaramos el numero que nos pide
    int numero = 90;
    
    //Calculamos si es par
    boolean par = (numero % 2) == 0;
    
    //Imprimimos el resultado
    System.out.printf("¿El numero %d es par?: %b%n", numero, par);

  }

}
