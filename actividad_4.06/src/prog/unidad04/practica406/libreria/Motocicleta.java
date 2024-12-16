package prog.unidad04.practica406.libreria;

/**
 * Clase que representa una motocicleta
 */
public class Motocicleta extends Vehiculo implements MaquinaConDistintivoAmbiental{

  //Constantes
  /**
   * Número de cilindradas minimo para la motocicleta ECO
   */
  private static final int CILINDRADAS_ECO = 75;
  /**
   * Número de cilindradas minimo para la motocicleta A
   */
  private static final int CILINDRADAS_A = 125;
  /**
   * Número de cilindradas minimo para la motocicleta B
   */
  private static final int CILINDRADAS_B = 500;
  
  //Atributos
  /**
   * Cilindradas
   */
  private int cilindradas;
  
  //Constructor
  
  /**
   * Constructor
   * @param matricula Matricula del vehículo. Debe tener un formato válido NNNN AAA donde NNNN son 4 dígitos y AAA son tres letras MAYÚSCULAS. Entre ellas puede haber cuantos espacios se quiera (incluido ninguno)
   * @param fechaMatriculacion Fecha de matriculación del vehiculo. No puede ser null
   * @param cilindradas Cilindrada de la motocicleta (debe ser superior o igual a 50)
   * @throws IllegalArgumentException Si alguno de los parametros no es válido
   * @throws NullPointerException Si la matrícula o fechaMatriculacion son null
   */
  public Motocicleta(String matricula, Fecha fechaMatriculacion, int cilindradas) {
    //faltan dos throws
    super(matricula, fechaMatriculacion);
    if (cilindradas < 50) {
      throw new IllegalArgumentException();
    } else {
      this.cilindradas = cilindradas; 
    }
    VEHICULOS_MATRICULADOS++;
  }

  //Metodos
  /**
   * Obtiene la cilindrada de la motocicleta
   * @return Cilindrada de la motocicleta
   */
  public int getCilindrada() {
    return this.cilindradas;
  }
  
  /**
   * Obtiene el distintivo de la motocicleta
   * Si la cilindrada es menor a 75 será 0, si está entre 75 y 125, ambas incluidas, será ECO, si está entre 125(no incluida) y 500(incluida) será A y si tiene más de 500 será B
   * @return Distintivo ambiental de la máquina (0, ECO, A, B)
   */
  //Falta la interfaz
  public String getDistintivo(){
    if (cilindradas > CILINDRADAS_B) {
      return "B";
    } else if (cilindradas > CILINDRADAS_A) {
      return "A"; 
    } else if (cilindradas >= CILINDRADAS_ECO) {
      return "ECO";
    } else {
      return "0";
    }
  }
  
  /**
   * Obtiene la representación en texto de la motocicleta en el formato:
   * Matricula: matricula, Fecha Matriculación: dd de mmmmm de aaaa, Cilindrada: cilindradas
   */
  public String toString() {
    return toString() + ", Cilindrada: " + getCilindrada();
  }
}