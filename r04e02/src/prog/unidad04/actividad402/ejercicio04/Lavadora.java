package prog.unidad04.actividad402.ejercicio04;

public class Lavadora {

  //Constantes
  //Colores
  public static final String COLOR_BLANCO = "blanco";
  public static final String COLOR_NEGRO = "negro";
  public static final String COLOR_ROJO = "rojo";
  public static final String COLOR_AZUL = "azul";
  public static final String COLOR_GRIS = "gris";
  //Consumo Energetico
  public static final char CONSUMO_A = 'A';
  public static final char CONSUMO_B = 'B';
  public static final char CONSUMO_C = 'C';
  public static final char CONSUMO_D = 'D';
  public static final char CONSUMO_E = 'E';
  public static final char CONSUMO_F = 'F';
  //Precio por consumo
  public static final int PRECIO_A = 100;
  public static final int PRECIO_B = 80;
  public static final int PRECIO_C = 60;
  public static final int PRECIO_D = 40;
  public static final int PRECIO_E = 30;
  public static final int PRECIO_F = 10;
  //Suplemento por peso
  public static final int PRECIO_PESO_MENOS_20_KG = 10;
  public static final int PRECIO_PESO_20_KG = 50;
  public static final int PRECIO_PESO_50_KG = 80;
  public static final int PRECIO_PESO_80_KG = 100;
  //Suplemento por carga
  public static final int PRECIO_CARGA_MAS_30_KG = 50;
  
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
    this.precioBase = 200;
    this.color = COLOR_BLANCO;
    this.energia = 'F';
    this.peso = 15;
    this.carga = 5;
  }
  
  /**
   * Constructor con algunos parametros. El resto toma los valores por defecto
   * @param precio Precio de la nueva lavadora
   * @param peso Peso de la nueva lavadora
   */
  public Lavadora(double precio, double peso) {
    this.precioBase = precio;
    this.color = COLOR_BLANCO;
    this.energia = 'F';
    this.peso = peso;
    this.carga = 5;
  }
  
  /**
   * Constructor con todos los parametros
   * @param precio Precio de la nueva lavadora
   * @param peso Peso de la nueva lavadora
   * @param color Color de la nueva lavadora
   * @param energia Energia de la nueva lavadora
   * @param carga Carga de la nueva lavadora
   */
  public Lavadora(double precio, double peso, String color, char energia, double carga) {
    this.precioBase = precio;
    this.color = color;
    this.energia = energia;
    this.peso = peso;
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
    switch (energia) {
    case CONSUMO_A: {
      precioFinal += PRECIO_A;
      break;
    }
    case CONSUMO_B: {
      precioFinal += PRECIO_B;
      break;
    }
    case CONSUMO_C: {
      precioFinal += PRECIO_C;
      break;
    }
    case CONSUMO_D: {
      precioFinal += PRECIO_D;
      break;
    }
    case CONSUMO_E: {
      precioFinal += PRECIO_E;
      break;
    }
    case CONSUMO_F: {
      precioFinal += PRECIO_F;
      break;
    }
    default:
      throw new IllegalArgumentException("Unexpected value: " + energia);
    }
    
    return precioFinal;
  }
  
  //Faltan los metodos privados y terminar el metodo getPrecioFinal
  
}
