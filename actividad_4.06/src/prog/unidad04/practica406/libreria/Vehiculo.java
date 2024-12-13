package prog.unidad04.practica406.libreria;

/**
 * Clase que representa a un vehículo
 */
public class Vehiculo {

  //Constantes
  
  //Atributos
  protected String matricula;
  protected Fecha fechaMatriculacion;
  protected static int VEHICULOS_MATRICULADOS;
  
  //Constructores
  /**
   * 
   * @param matricula
   * @param fechaMatriculacion
   */
  //faltan los throws
  protected Vehiculo(String matricula, Fecha fechaMatriculacion){
    //corregir
    if (compruebaMatricula(matricula)) {
      this.matricula = matricula;
    } else {
      throw new IllegalArgumentException();
    }
    
    if (fechaMatriculacion.compruebaFechaMatriculacion(fechaMatriculacion) < 1900) {
      this.fechaMatriculacion = fechaMatriculacion;
    } else {
      throw new IllegalArgumentException();
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
    //PREGUNTAR: tenemos en cuenta que las matriculas no tienen vocales o eso ya no lo controlamos
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
   * 
   */
  //arreglar getFechaMatriculacion con un metodo privado
  public String toString() {
    return "Matricula: " + getMatricula() + ", Fecha Matriculacón: " + getFechaMatriculacion();
  }
  
  private boolean compruebaMatricula(String matricula) {
    return false;
  }
  
  
}