package prog.unidad04.practica406.libreria;

/**
 * Clase que representa una fecha a partir del 1/1/1900
 */
public class Fecha {

  //Constantes
  //Año que se inicio
  /**
   * Año de inicio
   */
  private static final int ANYO_INICIO = 1900;
  //Dias que tiene un año
  /**
   * Dias que tiene un año
   */
  private static final int DIAS_POR_ANYO = 365; 
  //Meses del año en letras
  /**
   * Enero
   */
  private static final String ENERO = "Enero";
  /**
   * Febrero
   */
  private static final String FEBRERO = "Febrero";
  /**
   * Marzo
   */
  private static final String MARZO = "Marzo";
  /**
   * Abril
   */
  private static final String ABRIL = "Abril";
  /**
   * Mayo
   */
  private static final String MAYO = "Mayo";
  /**
   * Junio
   */
  private static final String JUNIO = "Junio";
  /**
   * Julio
   */
  private static final String JULIO = "Julio";
  /**
   * Agosto
   */
  private static final String AGOSTO = "Agosto";
  /**
   * Septiembre
   */
  private static final String SEPTIEMBRE = "Septiembre";
  /**
   * Octubre
   */
  private static final String OCTUBRE = "Octubre";
  /**
   * Noviembre
   */
  private static final String NOVIEMBRE = "Noviembre";
  /**
   * Diciembre
   */
  private static final String DICIEMBRE = "Diciembre";
  //Dias por mes
  /**
   * Meses que tienen 31 días
   */
  private static final int MES_CON_31_DIAS = 31;
  /**
   * Meses que tienen 30 días
   */
  private static final int MES_CON_30_DIAS = 30;
  /**
   * Meses que tienen 28 días
   */
  private static final int MES_FEBRERO = 28;
  /**
   * Meses que tienen 29 días
   */
  private static final int MES_FEBRERO_BISIESTO = 29;
    
  //Atributos
  /**
   * Dia
   */
  protected int dia;
  /**
   * Mes
   */
  protected int mes;
  /**
   * Año
   */
  protected int anyo;
    
  //Constructor
  /**
   * Constructor con dia, mes y año
   * @param dia Día de la fecha. Debe valer entre 1 y lacantidad de días del mes. Tiene en cuebta los años bisiestos
   * @param mes Mes de la fecha. Debe valer entre 1 y 12
   * @param anyo Año de la fecha. Debe ser mayor o igual a 1900
   * @throws IllegalArgumentException Si los párametros no se corresponden con una fecha válida
   */
  public Fecha(int dia, int mes, int anyo) throws IllegalArgumentException {
    //los throws se encuentran dentro de los metodos protegidos
    this.anyo = compruebaAnyo(anyo);
    this.mes = compruebaMes(mes);
    this.dia = diasDelMes(dia);
  }
    
   //Metodos
   /**
    * Compara esta fecha con otra
    * @param fecha Fecha con la que se quiere comparar ésta
    * @return Menor que o si esta fecha es anterior a la otra, o si las dos fechas son iguales y mayor que cero si esta fecha es posterior a la otra
    */
   public int compara(Fecha fecha) {
     //Calcula los dias trancurridos de cada fecha y se restan para calcular la diferencia de dias
     return (int) (diasTranscurridos() - fecha.diasTranscurridos());
   }
    
   /**
    * Obtiene el número de días transcurridos entre esta fecha y otra posterior que se proporciona
    * @param fecha Otra fecha posterior a esta
    * @return Número de días transcurridos entre esta fecha y la proporcionada
    * @throws FechaException Si la fecha proporcionada es anterior a esta
    */
   public long diasEntre(Fecha fecha) throws FechaException{
     //Se calculan los dias transcurridos entre una fecha y otra siempre que la la fecha introducida sea posterior a la otra
     long diasEntre = fecha.diasTranscurridos() - diasTranscurridos();
     if (diasEntre >= 0) {
       return diasEntre;
     } else {
       throw new FechaException();
     } 
   }
    
   /**
    * Obtiene el número de días transcurridos entre esta fecha y otra posterior que se proporciona
    * @return Número de días transcurridos entre esta fecha y la fecha de inicio del cxalendario
    */
   public long diasTranscurridos() {
     //se comprueban los años bisiestos para añadir un dia mas al año
     int bisiestos = 0;
     for (int anyoTemporal = ANYO_INICIO; anyoTemporal <= this.anyo; anyoTemporal++) {
       if (esBisiesto(anyoTemporal) && (mes > 2 || anyoTemporal != 0)) {
         bisiestos++;
       }
     }
     
     //dias segun el mes
     int diasPorMes = 0;
     int mesTemporal = mes;
     if (mesTemporal == 1 || mesTemporal == 3 || mesTemporal == 5 || mesTemporal == 7 || mesTemporal == 8 || mesTemporal == 10 || mesTemporal == 12) {
       diasPorMes += MES_CON_31_DIAS;
     } else if (mesTemporal == 4 || mesTemporal == 6 || mesTemporal == 9 || mesTemporal == 11){
       diasPorMes += MES_CON_30_DIAS;
     } else if(mesTemporal == 2) {
       diasPorMes += MES_FEBRERO;
     }
     
     //calculo del dia total de dias
     int diasTranscurridos = (bisiestos + (anyo - ANYO_INICIO) * DIAS_POR_ANYO) + diasPorMes + (dia - 1);
     return diasTranscurridos;
   }
    
   /**
    * Devuelve si el año es bisiesto o no
    * @return true si el año es bisiesto, false en caso contrario
    */
   public boolean esBisiesto() {
     //Como para diasTrasurridos necesito saber si el año es bisiesto, creo un metodo privado para todos y este es especifico pora el que se esta creando
     return esBisiesto(this.anyo);
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
     return this.dia + " de " + mesEnLetras() + " de " + this.anyo;
   }
   
   /**
    * Comprueba que el númerode dias sea correcto dependiendo del mes
    * @return Devuelve los dias o lanza una excepción si no es posible ese numero de dia
    */
  protected int diasDelMes(int dia) {
    if (mes == 2) {
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
    } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
      if (dia <= MES_CON_31_DIAS) {
        return dia;
      } else {
        throw new IllegalArgumentException();
      }
    } else if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
      if (dia <= MES_CON_30_DIAS) {
        return dia;
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
  protected int compruebaAnyo(int anyo) {
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
  protected int compruebaMes(int mes) {
    if (mes > 12 || mes < 1) {
      throw new IllegalArgumentException();
    } else {
      return mes;
    }
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
   * Devuelve si el año es bisiesto o no del año que se le proporciona
   * @anyo Año que se le proporciona para saber si es bisiesto o no
   * @return true si el año es bisiesto, false en caso contrario
   */
  private boolean esBisiesto(int anyo) {
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
}