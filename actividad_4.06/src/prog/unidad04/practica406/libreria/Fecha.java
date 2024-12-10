package prog.unidad04.practica406.libreria;

/**
 * Clase que representa una fecha a partir del 1/1/1900
 */
public class Fecha {

  //Constantes
  private static final int ANYO_INICIO = 1900;
  
  //Atributos
  private int dia;
  private int mes;
  private int anyo;
  
  //Constructor
  /**
   * Constructor con dia, mes y año
   * @param dia Día de la fecha. Debe valer entre 1 y lacantidad de días del mes. Tiene en cuebta los años bisiestos
   * @param mes Mes de la fecha. Debe valer entre 1 y 12
   * @param anyo Año de la fecha. Debe ser mayor o igual a 1900
   */
  public Fecha(int dia, int mes, int anyo) {
    this.dia = dia;
    this.mes = mes;
    this.anyo = anyo;
  }
  
  //Metodos
}
