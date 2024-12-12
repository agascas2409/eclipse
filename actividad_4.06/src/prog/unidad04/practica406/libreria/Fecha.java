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
      //falta el trhows
      this.dia = dia;
      this.mes = mes;
      this.anyo = anyo;
    }
    
    //Metodos
    /**
     * Compara esta fecha con otra
     * @param fecha Fecha con la que se quiere comparar ésta
     * @return Menor que o si esta fecha es anterior a la otra, o si las dos fechas son iguales y mayor que cero si esta fecha es posterior a la otra
     */
    public int compara(Fecha fecha) {
      //Buscar clase que compare fechas
      int fechas = 0;
      return fechas;
    }
    
    /**
     * Obtiene el número de días transcurridos entre esta fecha y otra posterior que se proporciona
     * @param fecha Otra fecha posterior a esta
     * @return Número de días transcurridos entre esta fecha y la proporcionada
     */
    public long diasEntre(Fecha fecha) {
    //Buscar clase que compare fechas
      long fechas = 0;
      return fechas;
      //Falta un throws
    }
    
    /**
     * Obtiene el número de días transcurridos entre esta fecha y otra posterior que se proporciona
     * @return Número de días transcurridos entre esta fecha y la fecha de inicio del cxalendario
     */
    public long diasTranscurridos() {
    //Buscar clase que compare fechas
      long fechas = 0;
      return fechas;
      //Falta un throws
    }
    
    /**
     * Devuelve si el año es bisiesto o no
     * @return true si el año es bisiesto, false en caso contrario
     */
    public boolean esBisiesto() {
      //Debe ser divisible entre 4
      //NO debe ser divisible entre 100
      //Debe ser divisible entre 400
      //un if(a&&(b||b))
      if (anyo % 4 == 0 && (anyo % 100 != 0 || anyo % 400 == 0 )) {
        return true;
      } else {
        return false; 
      }
    }
    
    /**
     * Obtiene el año de la fecha
     * @return Año de la fecha
     */
    public int getAnyo() {
      return this.anyo;
    }
    
    /**
     * Obtiene el mes de la fecha
     * @return Mes de la fecha
     */
    public int getMes() {
      return this.mes;
    }
    
    /**
     * Obtiene el día de la fecha
     * @return Día de la fecha
     */
    public int getDia() {
      return this.dia;
    }
    
    /**
     * Obtiene una representación de la fecha en formato texto El formato es DD de MMMMM de AAAA donde DD es el día del mes (en número), MMMM es el mes (en letra y minúsculas) y AAAA es el año (en número)
     */
    public String toString() {
      //hacer que se escriba el mes con letra
      //retocar el return
      return "el " + this.dia + " de " + this.mes + " de " + this.anyo;
    }
}