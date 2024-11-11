/**
 * 
 */
package programas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */
class CuentaTest {

  /**
   * Test method for {@link programas.Cuenta#getSaldo()}.
   */
  @Test
  void testGetSaldo() {
    Cuenta cuenta1 = new Cuenta("ccc-01", 1000);
    float saldo = cuenta1.getSaldo();
    assertEquals (1000, saldo);
  }

  /**
   * Test method for {@link programas.Cuenta#setSaldo(float)}.
   */
  @Test
  void testSetSaldo() {
    Cuenta cuenta1 = new Cuenta("ccc-01", 0);
    cuenta1.setSaldo(100);
    assertEquals(100, cuenta1.getSaldo());
  }

  /**
   * Test method for {@link programas.Cuenta#ingresarDinero(float)}.
   */
  @Test
  void testIngresarDinero() {
    Cuenta cuenta1 = new Cuenta("ccc-01", 100);
    cuenta1.ingresarDinero(400);
    assertEquals(500, cuenta1.getSaldo());
  }

  /**
   * Test method for {@link programas.Cuenta#extraerDinero(float)}.
   */
  @Test
  void testExtraerDinero() {
    Cuenta cuenta1 = new Cuenta("ccc-01", 100);
    cuenta1.extraerDinero(20);
    assertEquals(80, cuenta1.getSaldo());
  }

}
