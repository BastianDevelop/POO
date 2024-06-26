package ejercicio_07_banco;

import java.util.Scanner;

public class Principal {

  public static int buscarNumeroCuenta(Cuenta cuentas[], int n){
    int i = 0;
    boolean encontrado = false;
    while ((i < cuentas.length) && (!encontrado)){
      if (cuentas[i].getNumeroCuenta() == n){
        encontrado = true;
        return i;
      }
      i++;
    }
    return -1;
  }
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    String nombre, apellido, dni;
    int numeroCuenta, nCuentas, opcion, indiceCuenta;
    double saldo, cantidad;
    Cuenta cuentas[];
    Cliente cliente;

    System.out.print("Digite el nombre del cliente: ");
    nombre = entrada.nextLine();
    System.out.print("Digite el apellido del cliente: ");
    apellido = entrada.nextLine();
    System.out.print("Digite el dni del cliente: ");
    dni = entrada.nextLine();
    System.out.print("Digite cuantas cuentas tiene: ");
    nCuentas = entrada.nextInt();

    cuentas = new Cuenta[nCuentas];

    for (int i=0; i < cuentas.length; i++){
      System.out.println("\nDigite los datos para la cuenta "+(i+1)+":");
      System.out.print("Digite el numero de cuenta: ");
      numeroCuenta = entrada.nextInt();
      System.out.print("Digite el saldo: ");
      saldo = entrada.nextDouble();
      cuentas[i] = new Cuenta(numeroCuenta, saldo);
    }
    cliente = new Cliente(nombre, apellido, dni, cuentas);

    do {
      System.out.println("\nDigite la opcion que desea realizar: ");
      System.out.println("1. Ingresar dinero");
      System.out.println("2. Retirar dinero");
      System.out.println("3. Consultar saldo");
      System.out.println("4. Salir");
      System.out.print("Opcion: ");
      opcion = entrada.nextInt();

      switch (opcion){
        case 1:
          System.out.print("\nDigite el numero de cuenta: ");
          numeroCuenta = entrada.nextInt();
          indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);

          if (indiceCuenta == -1){
            System.out.println("La cuenta no existe");
          }else{
            System.out.print("Digite la cantidad a ingresar: ");
            cantidad = entrada.nextDouble();
            cliente.ingresar_dinero(indiceCuenta, cantidad);
            System.out.println("\nSe ingreso Correctamente");
            System.out.println("Saldo disponible: "+cliente.consultar_saldo(indiceCuenta));
          }
          break;
        case 2:
          System.out.print("\nDigite el numero de cuenta: ");
          numeroCuenta = entrada.nextInt();
          indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);

          if (indiceCuenta == -1){
            System.out.println("La cuenta no existe");
          }else{
            System.out.print("Digite la cantidad a retirar: ");
            cantidad = entrada.nextDouble();
            if (cliente.consultar_saldo(indiceCuenta) < cantidad){
              System.out.println("No hay suficiente dinero en la cuenta");
            }else{
              cliente.retirar_dinero(indiceCuenta, cantidad);
              System.out.println("\nSe retiro Correctamente");
              System.out.println("Saldo disponible: "+cliente.consultar_saldo(indiceCuenta));
            }
          }break;
        case 3:
          System.out.print("\nDigite el numero de cuenta: ");
          numeroCuenta = entrada.nextInt();
          indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);
          if (indiceCuenta == -1){
            System.out.println("La cuenta no existe");
          }else{
            System.out.println("\nSaldo disponible: "+cliente.consultar_saldo(indiceCuenta));
          }break;
        case 4:
          System.out.println("\nGracias por usar el programa");
          break;
        default:
          System.out.println("Digite bien mariko");
          System.out.println("");
      }
    }while(opcion != 4);

  }
}
