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
  protected Vehiculo(String matricula, Fecha fechaMatriculacion) {
    //corregir
    this.matricula = matricula;
    this.fechaMatriculacion = fechaMatriculacion;
  }
  
  //Metodos
  /**
   * Obtiene la fecha de matriculación del vehículo
   * @return Fecha de matriculación del vehículo
   */
  public Fecha getFechaMatriculacion() throws FechaException{
    //Ver como se añaden fechas diferentes
    Fecha fecha = new Fecha(16,12,2024);
    return fecha;
  }
  
  /**
   * Obtiene la matricula del vehículo
   * @return Matrícula del vehículo
   */
  public String getMatricula() {
    //Tener encuenta la estructura de la matricula 0000 ABC(con o sin espacios)
    //PREGUNTAR: tenemos en cuenta que las matriculas no tienen vocales o eso ya no lo controlamos
    String matricula = "";
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
    return "Matricula: " + getMatricula() + ", Fecha Matriculacón: ";// + getFechaMatriculacion();
  }
}