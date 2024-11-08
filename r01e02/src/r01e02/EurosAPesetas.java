package r01e02;

import java.util.Locale;

public class EurosAPesetas { 
  public static double PESETAS_POR_EURO = 166.386;
  
  public static void main(String[] args) {
    
    //Creamos la variable euros y cuantos tenemos
    double euros = 65;
    
    //Calculamos cuantas pesetas serian
    double pesetas = euros * PESETAS_POR_EURO;
    
    //Imprimimos las pesetas
    System.out.printf(Locale.US, "La cantidad %f en euros equivale a %f en pesetas", euros, pesetas);
    

  }

}
