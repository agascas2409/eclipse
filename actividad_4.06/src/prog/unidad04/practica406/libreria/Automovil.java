package prog.unidad04.practica406.libreria;

/**
 * Clase que representa un automovil. Es un vehiculo de cuatro ruedas con un color y un númerode plazas
 */
public class Automovil extends Vehiculo implements MaquinaConDistintivoAmbiental{

  //Constantes
  /**
   * Color azul
   */
  public static final String COLOR_AZUL = "azul";
  /**
   * Color blanco
   */
  public static final String COLOR_BLANCO = "blanco";
  /**
   * Color negro
   */
  public static final String COLOR_NEGRO = "negro";
  //Número de plazas
  /**
   * Número de plazas minimo para el automovil ECO
   */
  private static final int PLAZAS_ECO = 2;
  /**
   * Número de plazas minimo para el automovil A
   */
  private static final int PLAZAS_A = 4;
  /**
   * Número de plazas minimo para el automovil B
   */
  private static final int PLAZAS_B = 5;
  
  //Atributos
  /**
   * Color
   */
  private String color;
  /**
   * Plazas
   */
  private int plazas;
  
  //Constructores
  /**
   * Constructor
   * @param matricula Matricula del vehículo. Debe tener un formato válido NNNN AAA donde NNNN son 4 dígitos y AAA son tres letras MAYÚSCULAS. Entre ellas puede haber cuantos espacios se quiera (incluido ninguno)
   * @param fechaMatriculacion Fecha de matriculación del vehiculo. No puede ser null
   * @param color Color del vehiculo. Sólo se permite uno de COLOR_BLANCO, COLOR_NEGRO, COLOR_AZUL
   * @param plazasNúmero de plazas del vehículo. Debe ser mayor que o (por lo menos tiene que tener una para el conductor) 
   * @throws IllegalArgumentException Si la matrícula, el color o el número de plazas no son válidas
   * @throws NullPointerException Si fechaMatriculacion o color son null 
   */
  public Automovil(String matricula, Fecha fechaMatriculacion, String color, int plazas) throws IllegalArgumentException, NullPointerException{
    super(matricula, fechaMatriculacion);
    //comprobar los throws
    //controlar los colores
    if(color == null) {
      throw new NullPointerException();
    } else if (color == COLOR_AZUL || color == COLOR_BLANCO || color == COLOR_NEGRO) {
      this.color = color;
    } else {
      throw new IllegalArgumentException();
    }
      
    //controlar que no sea 0 o menor
    if (plazas <= 0) {
      throw new IllegalArgumentException();
    } else {
      this.plazas = plazas;
    }
    VEHICULOS_MATRICULADOS++;
  }
  
  //Metodos
  /**
   * Obtiene el color del automovil
   * @return Color del automovil
   */
  public String getColor() {
    return this.color;
  }
  
  /**
   * Obtiene el distintivo ambietal del automovil.
   * Si tiene 1 plaza es 0, si tiene de 2 a 3 es ECO, si tiene de 4 a 5 es A y si tienen más de 5 es B
   * @return Distintivo ambiental de la máquina (0, ECO, A, B)
   */
  //Falta la interfaz
  public String getDistintivo(){
    if (plazas > PLAZAS_B) {
      return "B";
    } else if (plazas >= PLAZAS_A) {
      return "A";
    } else if (plazas >= PLAZAS_ECO) {
      return "ECO";
    } else {
      return "0";
    }
      
  }
  
  /**
   * Obtiene el número de plazas del automovil
   * @return Número de plazas del automovil
   */
  public int getPlazas() {
    return this.plazas;
  }
  
  /**
   * Obtiene la representación es texto del automóvil en el formato:
   * Matricula: matricula, Fecha Matriculación: dd de mmmm de aaaa, Color: color, Num. Plazas: plazas
   */
  public String toString() {
    //Asegurarme que el toString sea de vehiculo
    return toString() + ", Color: " + getColor() + ", Num. Plazas: " + getPlazas();
  }
   
}