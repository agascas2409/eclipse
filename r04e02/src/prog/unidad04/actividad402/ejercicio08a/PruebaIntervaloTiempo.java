package prog.unidad04.actividad402.ejercicio08a;

public class PruebaIntervaloTiempo {

  public static void main(String[] args) {
    IntervaloTiempo intervalo = new IntervaloTiempo(2, 30, 40);
    IntervaloTiempo intervalo2 = new IntervaloTiempo(1, 20, 30);
    IntervaloTiempo salida = intervalo.resta(intervalo2);
    System.out.println(intervalo.obtenerCadena());
    System.out.println(intervalo2.obtenerCadena());
    System.out.println(salida.obtenerCadena());
  }

}
