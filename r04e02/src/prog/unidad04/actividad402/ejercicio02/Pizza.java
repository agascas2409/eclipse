package prog.unidad04.actividad402.ejercicio02;

/**
 * Clase que representa una pizza
 */
public class Pizza {

  //Constantes
  //Para cada tamaño
  /**
   * Tamaño mediana
   */
  public static final String TAMAGNO_MEDIANA = "mediana";
  /**
   * Tamaño familiar
   */
  public static final String TAMAGNO_FAMILIAR = "familiar";
  //Para cada tipo
  /**
   * Tipo margarita
   */
  public static final String TIPO_MARGARITA = "margarita";
  /**
   * Tipo cuatro quesos
   */
  public static final String TIPO_CUATRO_QUESOS = "cuatro quesos";
  /**
   * Tipo funghi
   */
  public static final String TIPO_FUNGHI = "funghi";
  //Para el estado en el que se encuentra la pizza
  /**
   * Estado pedida
   */
  public static final String ESTADO_PEDIDA = "pedida";
  /**
   * Estado servida
   */
  public static final String ESTADO_SERVIDA = "servida";

  private static final int COSTE_MEDIANA = 5;
  private static final double COSTE_FAMILIAR = 7.5;
  private static final int COSTE_INGREDIENTES = 1;
  private static final int INGREDIENTES_MARGARITA = 2;
  private static final int INGREDIENTES_CUATRO_QUESOS = 4;
  private static final int INGREDIENTES_FUNGHI = 3;
  
  //Atributos
  //Tamaño de la pizza. Puede ser mediana o familiar
  private String tamagno;
  
  //Tipo de la pizza. Puede ser margarita, cuatro quesos y funghi
  private String tipo;
  
  //Estado: pedida o servida
  private String estado;
  
  //Número total de pizzas creadas
  private static int pizzasCreadas;
  
  //Número de pizzas servidas
  private static int pizzasServidas;
  
  //Constructores
  /**
   * Constructor. Imprime error si alguno de los parametros no son correctos
   * @param tamagno Tamaño de la pizza. Debe ser "mediana" o "familiar"
   * @param tipo Tipo de la pizza. Debe ser margarita, cuatro quesos o "funghi
   */
  public Pizza(String tamagno, String tipo) {
    if (tamagno.toLowerCase() == TAMAGNO_MEDIANA || tamagno.equalsIgnoreCase(TAMAGNO_FAMILIAR)) {
      if (tipo.toLowerCase() == "margarita" || tipo.toLowerCase() == "cuatro quesos" || tipo.equalsIgnoreCase("funghi")) {
        //Si todo es correcto se establece el tipo, tamaño, estado y se crea una pizza
        this.tipo = tipo;
        this.tamagno = tamagno;
        pizzasCreadas++;
        estado = ESTADO_PEDIDA;
      } else {
        //Si el tipo de pizza es erroneo
        System.out.println("El parámetro tamaño no es correcto. Debe ser uno de margarita o cuatro quesos o funghi");
      }
    } else {
      //Si el tamaño es erroneo
      System.out.println("El parámetro tamaño no es correcto. Debe ser uno de mediana o familiar");
    }
  }
  
  //Metodos
  /**
   * Sirve la pizza. Imprime error si la pizza ya está servida
   */
  public void servir() {
    if (this.estado == ESTADO_SERVIDA) {
      System.out.println("Error. Esta pizza ya se ha servido");
    } else{
      this.estado = ESTADO_SERVIDA;
      pizzasServidas++;
    }
  }
  
  /**
   * Obtiene el número de pizzas servidas hasta el momento
   * @return Número de pizzas servidas hasta el momento
   */
  public static int getPizzasServidas() {
    return pizzasServidas;
  }
  
  /**
   * Obtiene el número de pizzas creadas hasta el momento
   * @return Número de pizzas creadas hasta el momento
   */
  public static int getPizzasCreadas() {
    return pizzasCreadas;
  }
  
  /**
   * Obtiene el tamaño de la pizza
   * @return Tamaño de la pizza. Puede ser uno de mediana o familiar
   */
  public String getTamagno() {
    return tamagno;
  }
  
  /**
   * Obtiene el tipo de la pizza
   * @return Tipo de la pizza. Puede ser uno de margarita o cuatro quesos o funghi
   */
  public String getTipo() {
    return tipo;
  }
  
  /**
   * Obtiene el estado de la pizza
   * @return Estado de la pizza. Puede ser uno de pedida o servida
   */
  public String getEstado() {
    return estado;
  }

  /**
   * Devuelve el coste de la pizza según el tamaño y tipo
   * @return Coste de la pizza según tamaño y tipo
   */
  public double coste() {
    double coste;
    if (tamagno == TAMAGNO_MEDIANA) {
      coste = COSTE_MEDIANA;
    } else {
      coste = COSTE_FAMILIAR;
    }
    if (tipo == TIPO_MARGARITA) {
      coste += COSTE_INGREDIENTES * INGREDIENTES_MARGARITA;
    } else if (tipo == TIPO_FUNGHI){
      coste += COSTE_INGREDIENTES * INGREDIENTES_FUNGHI;
    } else {
      coste += COSTE_INGREDIENTES * INGREDIENTES_CUATRO_QUESOS;
    }
    return coste;
  }
  
  /**
   * Devuelve una representación en cadena de la pizza
   * @return Representación en formato de cadena de la pizza con el formato especificado
   */
  public String obtenerCadena() {
    return "Tamaño: " + getTamagno() + ", Tipo: " + getTipo() + ", Estado: " + getEstado() + ", Coste: " + coste();
  }
  
}

