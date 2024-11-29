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
    this.sexo = comprobarSexo(sexo);
  }
  
  /**
   * Constructor con todos los parametros
   * @param nombre Nombre de la nueva persona
   * @param edad Edad de la nueva persona
   * @param sexo Sexo de la nueva persona. Si no es 'H' o 'M' se usa el valor por defecto ('M')
   * @param peso Peso de la nueva persona
   * @param altura Altura de la nueva persona
   */
  public Persona(String nombre, int edad, char sexo, double peso, double altura) {
    this.nombre = nombre;
    this.edad = edad;
    this.sexo = comprobarSexo(sexo);
    this.peso = peso;
    this.altura = altura;
  }
  
  //Métodos
  /**
   * 
   * @return
   */
  public double getIMC() {
    double imc;
    if (altura == 0) {
      imc = 0;
    } else {
      imc = peso / (altura * altura);
    }
    return imc;
  }
  
  /**
   * 
   * @return
   */
  public int getPesoCorrecto() {
    int pesoCorrecto;
    double imc = peso / (altura * altura);
    if (imc < 20) {
      pesoCorrecto = -1;
    } else if(imc > 25) {
      pesoCorrecto = 1;
    } else {
      pesoCorrecto = 0;
    }
    return pesoCorrecto;
  }
  
  /**
   * 
   * @return
   */
  public boolean esMayorEdad() {
    boolean mayorEdad;
    if (edad < 18) {
      mayorEdad = false;
    } else {
      mayorEdad = true;
    }
    return mayorEdad;
  }
  
  public String toString() {
    return "hola";
  }
  
  public String generarDNI() {
    return "hola";
  }
  
  private char comprobarSexo(char sexo) {
    if (sexo == 'H' || sexo == 'M') {
      this.sexo = sexo;
    } else {
      this.sexo = 'M';
    }
    return sexo;
  }
}
