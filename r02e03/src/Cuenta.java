import java.util.Locale;

public class Cuenta {

  public static void main(String[] args) {
    
    //Creamos la cuenta
    CuentaCorriente cuenta = new CuentaCorriente("11111");
    
    //Ingresamas 1000 euros
    cuenta.ingresar(1000);
    
    //
    System.out.printf(Locale.US, "El saldo de la cuenta es %f%n", cuenta.getSaldo());
    
    //Tratamos de retirar 1100 euros
    cuenta.retirar(1100);
    
    //
    System.out.printf(Locale.US, "El saldo de la cuenta es %f%n", cuenta.getSaldo());
    
    //Retiramos 900 euros
    cuenta.retirar(900);
    
    //
    System.out.printf(Locale.US, "El saldo de la cuenta es %f%n", cuenta.getSaldo());
    
    //Retiramos 100 euros
    cuenta.retirar(100);
    
    //Ingresamas 350 euros
    cuenta.ingresar(350);
    
    //
    System.out.printf(Locale.US, "El saldo de la cuenta es %f%n", cuenta.getSaldo());
    
    //Tratamos de retirar 400 euros
    cuenta.retirar(400);
    
    //
    System.out.printf(Locale.US, "El saldo de la cuenta es %f%n", cuenta.getSaldo());

  }

}
