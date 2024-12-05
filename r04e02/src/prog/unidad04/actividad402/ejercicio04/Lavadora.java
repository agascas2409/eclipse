package prog.unidad04.actividad402.ejercicio04;

/**
 * Clase que representa una lavadora
 */
public class Lavadora {

  //Constantes
  //Colores
  public static final String COLOR_BLANCO = "blanco";
  public static final String COLOR_NEGRO = "negro";
  public static final String COLOR_ROJO = "rojo";
  public static final String COLOR_AZUL = "azul";
  public static final String COLOR_GRIS = "gris";
  
  //Consumo Energetico minimo y maximo
  public static final char CONSUMO_MINIMO = 'A';
  public static final char CONSUMO_MAXIMO = 'F';
  
  //Valores por defecto
  private static final double DEFECTO_PRECIO_BASE = 200;
  private static final String DEFECTO_COLOR = COLOR_BLANCO;
  private static final char DEFECTO_CONSUMO_ENERGETICO = CONSUMO_MAXIMO;
  private static final double DEFECTO_PESO = 15;
  private static final double DEFECTO_CARGA = 5;
  
  //Suplemento por precio por consumo
  private static final int PRECIO_CONSUMO_A = 100;
  private static final int PRECIO_CONSUMO_B = 80;
  private static final int PRECIO_CONSUMO_C = 60;
  private static final int PRECIO_CONSUMO_D = 40;
  private static final int PRECIO_CONSUMO_E = 30;
  private static final int PRECIO_CONSUMO_F = 10;
  
  //Suplemento por peso
  private static final double PESO_TRAMO_1 = 20;
  private static final double PESO_TRAMO_2 = 50;
  private static final double PESO_TRAMO_3 = 80;
  private static final double PRECIO_PESO_TRAMO_1 = 10;
  private static final double PRECIO_PESO_TRAMO_2 = 50;
  private static final double PRECIO_PESO_TRAMO_3 = 80;
  private static final double PRECIO_PESO_TRAMO_4 = 100;
  
  //Suplemento por carga
  private static final double LIMITE_CARGA = 30;
  private static final double PRECIO_EXCESO_CARGA = 50;
  
  //Atributos
  //Precio base de la lavadora
  private double precioBase;
  //Color de la lavadora
  private String color;
  //Calificación energétiica de la lavadora
  private char energia;
  //Peso de la lavadora
  private double peso;
  //Carga máxima de la lavadora
  private double carga;
  
  //Constructores
  /**
   * Constructor por defecto
   */
  public Lavadora() {
    this.precioBase = DEFECTO_PRECIO_BASE;
    this.color = DEFECTO_COLOR;
    this.energia = DEFECTO_CONSUMO_ENERGETICO;
    this.peso = DEFECTO_PESO;
    this.carga = DEFECTO_CARGA;
  }
  
  /**
   * Constructor con algunos parametros. El resto toma los valores por defecto
   * @param precio Precio de la nueva lavadora (no deberia ser menor que 0)
   * @param peso Peso de la nueva lavadora (no deberia ser 0 o menor)
   */
  public Lavadora(double precio, double peso) {
    this.precioBase = precio;
    this.color = DEFECTO_COLOR;
    this.energia = DEFECTO_CONSUMO_ENERGETICO;
    this.peso = peso;
    this.carga = DEFECTO_CARGA;
  }
  
  /**
   * Constructor con todos los parametros
   * @param precio Precio de la nueva lavadora
   * @param peso Peso de la nueva lavadora
   * @param color Color de la nueva lavadora
   * @param energia Energia de la nueva lavadora
   * @param carga Carga de la nueva lavadora
   */
  public Lavadora(double precioBase, double peso, String color, char energia, double carga) {
    if (precioBase < 0) {
      System.out.println("Error. Precio base no válido");
    }
    this.precioBase = precioBase;
    if (!color.equals(COLOR_AZUL) && !color.equals(COLOR_GRIS) && !color.equals(COLOR_NEGRO) && !color.equals(COLOR_ROJO) && !color.equals(COLOR_BLANCO)) {
      System.out.println("Error. El color proporcionado no es válido");
    }
    this.color = comprobarColor(color);
    if (energia < CONSUMO_MINIMO || energia > CONSUMO_MAXIMO) {
      System.out.println("Error. Consumo energético no válido");
    }
    this.energia = comprobarConsumo(energia);
    if (peso <= 0) {
      System.out.println("Error. Peso es cero o menor");
    }
    this.peso = peso;
    if (carga <= 0) {
      System.out.println("Error. Carga es cero o menor");
    }
    this.carga = carga;
  }
  
  //Métodos
  /**
   * Devuelve el precio base de la lavadora
   * @return Precio de la lavadora
   */
  public double getPrecioBase() {
    return precioBase;
  }
  
  /**
   * Devuelve el color de la lavadora
   * @return Color de la lavadora
   */
  public String getColor() {
    return color;
  }
  
  /**
   * Devuelve la energia de la lavadora
   * @return Energia de la lavadora
   */
  public char getEnergia() {
    return energia;
  }
  
  /**
   * Devuelve el peso de la lavadora
   * @return Peso de la lavadora
   */
  public double getPeso() {
    return peso;
  }
  
  /**
   * Devuelve la carga de la lavadora
   * @return Carga de la lavadora
   */
  public double getCarga() {
    return carga;
  }
  
  /**
   * Calcula el precio final con el precio base y los suplementos y lo devuelve
   * @return Precio final de la lavadora
   */
  public double getPrecioFinal() {
    double precioFinal = precioBase;
    
    //Suplemento por energia
    switch (energia) {
    case 'A':
      precioFinal += PRECIO_CONSUMO_A;
      break;
    case 'B':
      precioFinal += PRECIO_CONSUMO_B;
      break;
    case 'C':
      precioFinal += PRECIO_CONSUMO_C;
      break;
    case 'D':
      precioFinal += PRECIO_CONSUMO_D;
      break;
    case 'E':
      precioFinal += PRECIO_CONSUMO_E;
      break;
    case 'F':
      precioFinal += PRECIO_CONSUMO_F;
      break;
    default:
      System.out.printf("Error. Consumo energético no válido (%c)%n", energia);
      break;
    }
  
    // Añadimos el plus por peso
    if (peso < PESO_TRAMO_1) {
      precioFinal += PRECIO_PESO_TRAMO_1;
    } else if ((peso >= PESO_TRAMO_1) && (peso < PESO_TRAMO_2)) {
      precioFinal += PRECIO_PESO_TRAMO_2;
    } else if ((peso >= PESO_TRAMO_2) && (peso < PESO_TRAMO_3)) {
      precioFinal += PRECIO_PESO_TRAMO_3;
    } else {
      precioFinal += PRECIO_PESO_TRAMO_4;
    }
    
    // Y por último añadimos plus por carga
    if (carga > LIMITE_CARGA) {
      precioFinal += PRECIO_EXCESO_CARGA;
    }
    
    //Devolvemos el precioFinal
    return precioFinal;
  }
  
  //Metodos privados
  private char comprobarConsumo(char energia) {
    if ((energia >= 'A') && (energia <= 'E')) {
      return energia;
    } else {
      return DEFECTO_CONSUMO_ENERGETICO;
    }
  }
  
  private String comprobarColor(String color) {
    if (color.equals(COLOR_AZUL) || color.equals(COLOR_GRIS) || color.equals(COLOR_NEGRO) || color.equals(COLOR_ROJO)) {
      return color;
    } else {
      return DEFECTO_COLOR;
    }
  }
}
