/*
Hacer un programa sencillo para realizar gestiones en un banco, tendremos 2 clases (Cliente y Cuenta)
El cliente tendra un nombre, apellido, dni.
El cliente puede consultar saldo, ingresar y retirar dinero de sus cuentas.
Las Cuentas tendra un numero de cuenta y saldo.
*/

package ejercicio_07_banco;

public class Cuenta {

  private int numeroCuenta;
  private double saldo;

  public Cuenta(int numeroCuenta, double saldo){
    this.numeroCuenta = numeroCuenta;
    this.saldo = saldo;
  }
  public int getNumeroCuenta() {
    return numeroCuenta;
  }
  public double getSaldo() {
    return saldo;
  }
  public void ingresarDinero(double cantidad){
    saldo += cantidad;
  }
  public void retirarDinero(double cantidad){
    saldo -= cantidad;
  }
}
