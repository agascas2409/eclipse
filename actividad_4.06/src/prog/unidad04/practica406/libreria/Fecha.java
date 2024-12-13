package prog.unidad04.practica406.libreria;
import java.time.LocalDate;

/**
 * Clase que representa una fecha a partir del 1/1/1900
 */
public class Fecha {

  //Constantes
  private static final int ANYO_INICIO = 1900;
  //Meses del año en letras
  private static final String ENERO = "Enero";
  private static final String FEBRERO = "Febrero";
  private static final String MARZO = "Marzo";
  private static final String ABRIL = "Abril";
  private static final String MAYO = "Mayo";
  private static final String JUNIO = "Junio";
  private static final String JULIO = "Julio";
  private static final String AGOSTO = "Agosto";
  private static final String SEPTIEMBRE = "Septiembre";
  private static final String OCTUBRE = "Octubre";
  private static final String NOVIEMBRE = "Noviembre";
  private static final String DICIEMBRE = "Diciembre";
  //Dias por mes
  private static final int MES_CON_31_DIAS = 31;
  private static final int MES_CON_30_DIAS = 30;
  private static final int MES_FEBRERO = 28;
  private static final int MES_FEBRERO_BISIESTO = 29;
    
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
   * @throws IllegalArgumentException Si los párametros no se corresponden con una fecha válida
   */
   public Fecha(int dia, int mes, int anyo) throws FechaException {
     try {
       //los throws se encuentran dentro de los metodos privados
         this.dia = diasDelMes();
         this.mes = compruebaMes();
         this.anyo = compruebaAnyo();
     } catch (IllegalArgumentException e) {
       throw new FechaException("La fecha introducida es erronea");
     }
   }
    
   //Metodos
   /**
    * Compara esta fecha con otra
    * @param fecha Fecha con la que se quiere comparar ésta
    * @return Menor que o si esta fecha es anterior a la otra, o si las dos fechas son iguales y mayor que cero si esta fecha es posterior a la otra
    */
   public int compara(Fecha fecha) {
     //Buscar clase que compare fechas
     //LocalDate hoy = new LocalDate();
     //hoy.now();
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
     return this.dia + " de " + mesEnLetras() + " de " + this.anyo;
   }
   
   /**
    * Obtenemos el mes en letras
    * @return Mes en letras
    */
   private String mesEnLetras() {
      String resultado;
      switch(mes){
      case 1: {
        resultado = ENERO;
        break;
      }
      case 2: {
        resultado = FEBRERO;
        break;
      }
      case 3: {
        resultado = MARZO;
        break;
      }
      case 4: {
        resultado = ABRIL;
        break;
      }
      case 5: {
        resultado = MAYO;
        break;
      }
      case 6: {
        resultado = JUNIO;
        break;
      }
      case 7: {
        resultado = JULIO;
        break;
      }
      case 8: {
        resultado = AGOSTO;
        break;
      }
      case 9: {
         resultado = SEPTIEMBRE;
         break;
      }
      case 10: {
        resultado = OCTUBRE;
        break;
      }
      case 11: {
        resultado = NOVIEMBRE;
        break;
      }
      case 12: {
        resultado = DICIEMBRE;
        break;
        }
      default: {
        resultado = "Error";
        break;
      }
      }
      return resultado;
   }
    
   /**
    * Comprueba que el númerode dias sea correcto dependiendo del mes
    * @return Devuelve los dias o lanza una excepción si no es posible ese numero de dia
    */
  private int diasDelMes() {
    if (dia > 0) {
      if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
        if (dia <= MES_CON_31_DIAS) {
          return dia;
        } else {
          throw new IllegalArgumentException();
        }
      } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
        if (dia <= MES_CON_30_DIAS) {
          return dia;
        } else {
          throw new IllegalArgumentException();
        }
      } else if (mes == 2) {
        if (esBisiesto()) {
          if (dia <= MES_FEBRERO_BISIESTO) {
            return dia;
          } else {
            throw new IllegalArgumentException();
          }
        } else {
          if (dia <= MES_FEBRERO) {
            return dia;
          } else {
            throw new IllegalArgumentException();
          }
        }
      } else {
        throw new IllegalArgumentException();
      } 
    } else {
      throw new IllegalArgumentException();
    }
   }
    
    /**
     * Comprueba que el año sea mayor al año de inicio
     * @return Devuelve el año
     */
    private int compruebaAnyo() {
      if (anyo < ANYO_INICIO) {
        throw new IllegalArgumentException();
      } else {
        return anyo;
      }
    }
    
    /**
     * Comprueba que el numero del mes es correcto
     * @return Devuelve el mes
     */
    private int compruebaMes() {
      if (mes > 12 || mes < 1) {
        throw new IllegalArgumentException();
    } else {
      return mes;
    }
    }
}