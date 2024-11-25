package prog.unidad04.actividad402.ejercicio01;

/**
 * Clase que representa una pizza
 */
public class Pizza {

  //Constantes
  //Para cada tamaño
  /**
   * Tamaño mediana
   */
  public static final String TAMANYO_MEDIANA = "mediana";
  /**
   * Tamaño familiar
   */
  public static final String TAMANYO_FAMILIAR = "familiar";
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
  public static final String TIP_FUNGHI = "funghi";
  //Para el estado en el que se encuentra la pizza
  /**
   * Estado pedida
   */
  public static final String ESTADO_PEDIDA = "pedida";
  /**
   * Estado servida
   */
  public static final String ESTADO_SERVIDA = "servida";
  
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
   * Constructor con dos parametros
   * @param tamagno Tamaño de la pizza; puedde ser "mediana" o "familiar"
   * @param tipo Tipo de la pizza; puede ser margarita, cuatro quesos o "funghi
   */
  public Pizza(String tamagno, String tipo) {
    if (tamagno.toLowerCase() == "mediana" || tamagno.equalsIgnoreCase("familiar")) {
      if (tipo.toLowerCase() == "margarita" || tipo.toLowerCase() == "cuatro quesos" || tipo.equalsIgnoreCase("funghi")) {
        //Si todo es correcto se establece el tipo, tamaño, estado y se crea una pizza
        this.tipo = tipo;
        this.tamagno = tamagno;
        pizzasCreadas++;
        estado = ESTADO_PEDIDA;
      } else {
        System.out.println("El parámetro tamaño no es correcto. Debe ser uno de margarita o cuatro quesos o funghi");
      }
    } else {
      System.out.println("El parámetro tamaño no es correcto. Debe ser uno de mediana o familiar");
    }
  }
  
  //Metodos
  /**
   * Metodo donde se sirve la pizza
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
   * Metodo con el que obtenemos el numero de pizzas servidas
   * @return
   */
  public static int getPizzasServidas() {
    return pizzasServidas;
  }
  
  /**
   * Metodo con el que obtenemos el numero de pizzas creadas
   * @return
   */
  public static int getPizzasCreadas() {
    return pizzasCreadas;
  }
  
  public String getTamagno() {
    return tamagno;
  }
  
  public String getTipo() {
    return tipo;
  }
  
  public String getEstado() {
    return estado;
  }
  
  public String obtenerCadena() {
    return "Tamaño: " + getTamagno() + ", Tipo: " + getTipo() + ", Estado: " + getEstado();
  }
}
