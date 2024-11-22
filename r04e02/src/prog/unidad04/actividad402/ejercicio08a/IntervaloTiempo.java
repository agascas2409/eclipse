package prog.unidad04.actividad402.ejercicio08a;
/**
 * La clase IntervaloTiempo......
 */
public class IntervaloTiempo {

  //Constantes
  //Cantidad de segundos por minuto
  private static final int SEGUNDOS_POR_MINUTO = 60;
  
  //Atributos
  //Segundos
  private int segundos;
  
  //Constructores
  /**
   * Constructor con tres parametros
   * @param horas Número de horas del intervalo. No puede ser negativo
   * @param minutos Número de horas del intervalo. No puede ser negativo 
   * @param segundos
   */
  public IntervaloTiempo(int horas, int minutos, int segundos) {
    this.segundos = horas * 3600 + SEGUNDOS_POR_MINUTO * minutos + segundos;
  }
  
  private IntervaloTiempo(int segundos) {
  this.segundos = segundos;  
  }
  
  public IntervaloTiempo suma(IntervaloTiempo otro) {
    int resultado = this.segundos + otro.segundos;
    return new IntervaloTiempo(resultado);
  }
  
  public IntervaloTiempo resta(IntervaloTiempo otro) {
      int resultado= this.segundos - otro.segundos;
      
      if(resultado < 0) {
        System.out.println("Error El intervalo que se resta es mayor que el original");
        return null;
      } else {
        //Creamos el resultado
        return new IntervaloTiempo(resultado);
      }
  }
  
  public String obtenerCadena() {
    int segundosTemporal = segundos % 60;
    int minTemporal = segundos / 60;
    int minutos = minTemporal % 60;
    int horas = minTemporal / 60;
    
    return horas + "h " + minutos + "m " + segundosTemporal + "s";
  }
}
