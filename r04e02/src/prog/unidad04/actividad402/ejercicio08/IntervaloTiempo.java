package prog.unidad04.actividad402.ejercicio08;

public class IntervaloTiempo {

  //Atributos
  //Horas
  private int horas;
  //Minutos
  private int minutos;
  //Segundos
  private int segundos;
  
  //Constructores
  public IntervaloTiempo(int horas, int minutos, int segundos) {
    //Ajustamos segundos
    while (segundos > 59) {
      segundos -= 60;
      minutos++;
    }
    //Ajustamos minutos por el metodo manolo
    horas += minutos/60;
    minutos = minutos % 60;
    
    this.horas = horas;
    this.minutos = minutos;
    this.segundos = segundos;
  }
  
  
}
