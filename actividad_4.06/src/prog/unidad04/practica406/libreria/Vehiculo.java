package prog.unidad04.practica406.libreria;

/**
 * Clase que representa a un vehículo
 */
public class Vehiculo {

  //Constantes
  
  //Atributos
  /**
   * Matricula
   */
  protected String matricula;
  /**
   * Fecha de Matriculación
   */
  protected Fecha fechaMatriculacion;
  /**
   * Vehiculos matriculados en total
   */
  protected static int VEHICULOS_MATRICULADOS;
  
  //Constructores
  /**
   * Constructor de vehiculos
   * @param matricula Matricula del vehículo. Debe tener un formato válido NNNN AAA donde NNNN son 4 dígitos y AAA son tres letras MAYÚSCULAS. Entre ellas puede haber cuantos espacios se quiera (incluido ninguno)
   * @param fechaMatriculacion Fecha de matriculación del vehiculo. No puede ser null
   */
  protected Vehiculo(String matricula, Fecha fechaMatriculacion) throws IllegalArgumentException, NullPointerException{
    if (compruebaMatricula(matricula)) {
      this.matricula = matricula;
    } else {
      throw new IllegalArgumentException();
    }
    if (fechaMatriculacion == null) {
      throw new NullPointerException();
    } else {
      fechaMatriculacion.anyo = fechaMatriculacion.getAnyo();
      fechaMatriculacion.mes = fechaMatriculacion.getMes();
      fechaMatriculacion.dia = fechaMatriculacion.getDia();
      this.fechaMatriculacion = fechaMatriculacion;
    }
    
  }
  
  //Metodos
  /**
   * Obtiene la fecha de matriculación del vehículo
   * @return Fecha de matriculación del vehículo
   */
  public Fecha getFechaMatriculacion(){
    //Ver como se añaden fechas diferentes
    return fechaMatriculacion;
  }
  
  /**
   * Obtiene la matricula del vehículo
   * @return Matrícula del vehículo
   */
  public String getMatricula() {
    //Tener encuenta la estructura de la matricula 0000 ABC(con o sin espacios)
    return matricula;
  }
  
  /**
   * Obtiene la cantidad de vehículos matriculados hasta el momento
   * @return Cantidad de vehículos matriculados hasta el momento
   */
  public static int getVehiculosMatriculados() {
    //los vehiculos matriculados van aumentando cuando se crean automoviles o motocicletas
    return VEHICULOS_MATRICULADOS;
  }
  
  /**
   * Obtiene la representación en texto deel vehiculo en formato:
   * Matricula: matricula, Fecha Matriculación: dd de mmmmm de aaaa
   */
  //arreglar getFechaMatriculacion con un metodo privado
  public String toString() {
    return "Matricula: " + getMatricula() + ", Fecha Matriculacón: " + getFechaMatriculacion();
  }
  
  /**
   * Comprueba la matricula para que tenga la estructura de una matricula 0000 ABC
   * @param matricula Matricula del vehículo. Debe tener un formato válido NNNN AAA donde NNNN son 4 dígitos y AAA son tres letras MAYÚSCULAS. Entre ellas puede haber cuantos espacios se quiera (incluido ninguno)
   * @return True si la estructura es correcta y false si no es correcta
   */
  private boolean compruebaMatricula(String matricula) {
    return (matricula.length() >= 7 && esNumeroMatriculaValida(matricula) && esLetraMatriculaValida(matricula) && esEspacioMatriculaValido(matricula));
  }
  
  /**
   * Comprueba el numero de espacios que hay entre los numeros y las letras
   * @param matricula Matricula del vehículo. Debe tener un formato válido NNNN AAA donde NNNN son 4 dígitos y AAA son tres letras MAYÚSCULAS. Entre ellas puede haber cuantos espacios se quiera (incluido ninguno)
   * @return true si el numero de espacios coincide con la longuitud de la matricula menos los 4 numeros y las 3 letras y falso si no coincide
   */
  private boolean esEspacioMatriculaValido(String matricula) {
    int contadorEspacios = 0;
    for (int posicion = 4; posicion  < matricula.length() - 3; posicion++) {
      if (matricula.codePointAt(posicion) == ' ') { 
        contadorEspacios++;
      }
    }
    return contadorEspacios == matricula.length() - 4 - 3;  
  }
  
  /**
   * Comprueba que las letras de la matricula sean válidas
   * @param matricula Matricula del vehículo. Debe tener un formato válido NNNN AAA donde NNNN son 4 dígitos y AAA son tres letras MAYÚSCULAS. Entre ellas puede haber cuantos espacios se quiera (incluido ninguno)
   * @return true si las letras son válidas y false si no lo son
   */
  private boolean esLetraMatriculaValida(String matricula) {
    int contadorLetrasCorrectas = 0;
    for (int contadorPosicionLetras = matricula.length() - 1; contadorPosicionLetras >= matricula.length() - 4; contadorPosicionLetras--) {
      if (matricula.codePointAt(contadorPosicionLetras) >= 'A' && matricula.codePointAt(contadorPosicionLetras) <= 'Z') {
        contadorLetrasCorrectas++;
      }
    }
    return contadorLetrasCorrectas == 3;  
  }
  
  /**
   * Comprueba que los numeros son válidos
   * @param matricula Matricula del vehículo. Debe tener un formato válido NNNN AAA donde NNNN son 4 dígitos y AAA son tres letras MAYÚSCULAS. Entre ellas puede haber cuantos espacios se quiera (incluido ninguno)
   * @return true si los numeros son correctos son 4 y false si no lo son
   */
  private boolean esNumeroMatriculaValida(String matricula) {
    int contadorNumerosCorrectos = 0;
    for (int contadorPosicionNumeros = 0; contadorPosicionNumeros <= 3; contadorPosicionNumeros++) {
      if (matricula.codePointAt(contadorPosicionNumeros) >= '0' && matricula.codePointAt(contadorPosicionNumeros) <= '9') {
        contadorNumerosCorrectos++;
      }
    }
    return contadorNumerosCorrectos == 4;  
  }
  
}