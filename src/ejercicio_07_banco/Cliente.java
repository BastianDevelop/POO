/*
Hacer un programa sencillo para realizar gestiones en un banco, tendremos 2 clases (Cliente y Cuenta)
El cliente tendra: nombre, apellido, dni.
El cliente puede consultar saldo, ingresar y retirar dinero de sus cuentas.
Las Cuentas tendra un numero de cuenta y saldo.
*/


package ejercicio_07_banco;

public class Cliente {

  private String nombre;
  private String apellido;
  private String dni;
  Cuenta cuentas[];

  public Cliente(String nombre, String apellido, String dni, Cuenta[] cuentas){
    this.nombre = nombre;
    this.apellido = apellido;
    this.dni = dni;
    this.cuentas = cuentas;
  }

  public String getNombre() { return nombre; }
  public String getApellido() { return apellido; }
  public String getDni() { return dni; }

  public double consultar_saldo(int n){
    return cuentas[n].getSaldo();
  }
  public void ingresar_dinero(int n, double cantidad){
    cuentas[n].ingresarDinero(cantidad);
  }
  public void retirar_dinero(int n, double cantidad){
    cuentas[n].retirarDinero(cantidad);
  }
}
