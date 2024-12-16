package prog.unidad04.practica406.libreria;

/**
 * Interfaz que implementan todas las máquinas que disponen de distintivo ambiental, como los coches o motocicletas, por ejemplo.
 */
public interface MaquinaConDistintivoAmbiental {
  
  //obtiene el distintivo
  /**
   * Obtiene el distintivo ambiental de la máquina
   * @return Distintivo ambiental de la máquina (0, ECO, A, B)
   */
  String getDistintivo();
  
}