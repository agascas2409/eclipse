package prog.unidad04.actividad402.ejercicio03;

public class Persona {
  
  //Atributos
  //Nombre de la persona
  private String nombre;
  //Edad de la persona
  private int edad;
  //DNI de la persona
  private String dni;
  //Sexo de la persona
  private char sexo = 'M';
  //Peso de la persona
  private double peso;
  //Altura de la persona
  private double altura;
  
  //Constructores
  /**
   * Constructor por defecto
   */
  public Persona() {}
  
  /**
   * Constructor con algunos parametros. El resto toma los valores por defecto
   * @param nombre Nombre de la nueva persona
   * @param edad Edad de la nueva persona
   * @param sexo Sexo de la nueva persona. Si no es 'H' o 'M' se usa el valor por defecto ('M')
   */
  public Persona(String nombre, int edad, char sexo) {
    this.nombre = nombre;
    this.edad = edad;
    if (sexo == 'H' || sexo == 'M') {
      this.sexo = sexo;
    } else {
      this.sexo = 'M';
    }
  }
  
}
