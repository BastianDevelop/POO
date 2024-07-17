package ejercicio_08_servientrega;

import java.util.Scanner;

public class Principal {
  public static int buscarPaquete(Paquete t[], int numeroPaquete, int contadorPaquete){
    int indice = 0;
    boolean encontrado = false;
    for (int i=0;i<contadorPaquete;i++){
      if (t[i].getNumeroPaquete() == numeroPaquete){
        encontrado = true;
        indice = i;
      }
    }
    if (encontrado == false){
      indice = -1;
    }
    return indice;
  }
  public static int buscarSucursal(Sucursal t[], int numeroSucursal, int contadorSucursal){
    int indice = 0;
    boolean encontrado = false;
    for (int i=0;i<contadorSucursal;i++){
      if (t[i].getNumeroSucursal() == numeroSucursal){
        encontrado = true;
        indice = i;
      }
    }
    if (encontrado == false){
      indice = -1;
    }
    return indice;
  }

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int numeroSucursal, numeroPaquete, prioridad, opcion, indiceSucursal;
    int contadorSucursal = 0,contadorPaquete = 0, indice, indicePaquete;
    String direccion, ciudad, dni;
    double peso, precioPaquete;
    Sucursal sucursal[] = new Sucursal[50];
    Paquete paquetes[] = new Paquete[100];
    do {
      System.out.println("\nMenú Principal");
      System.out.println("1. Crear una nueva Sucursal");
      System.out.println("2. Enviar Paquete");
      System.out.println("3. Consulta de Sucursal");
      System.out.println("4. Consulta de Paquetes");
      System.out.println("5. Mostrar todas las sucursales");
      System.out.println("6. Mostrar todos los paquetes");
      System.out.println("7. Salir");
      System.out.print("Opción: ");
      opcion = entrada.nextInt();

      switch (opcion) {
        case 1:
          System.out.print("Número de Sucursal: ");
          numeroSucursal = entrada.nextInt();
          entrada.nextLine();
          System.out.print("Dirección: ");
          direccion = entrada.next();
          System.out.print("Ciudad: ");
          ciudad = entrada.next();
          sucursal[contadorSucursal] = new Sucursal(numeroSucursal, direccion, ciudad);
          contadorSucursal++;
          break;
        case 2:
          System.out.print("\nNúmero de Sucursal: ");
          numeroSucursal = entrada.nextInt();
          entrada.nextLine();
          indiceSucursal = buscarSucursal(sucursal, numeroSucursal, contadorSucursal);
          if (indiceSucursal == -1){
            System.out.println("La sucursal no existe");
          } else {
            System.out.print("\nNumero de paquete: ");
            numeroPaquete = entrada.nextInt();
            System.out.print("DNI del remitente: ");
            dni = entrada.next();
            System.out.print("Peso del paquete (kg): ");
            peso = entrada.nextDouble();
            System.out.print("Prioridad (1-Alta, 2-Media, 3-Baja): ");
            prioridad = entrada.nextInt();
            paquetes[contadorPaquete] = new Paquete(numeroPaquete, dni, peso, prioridad);
            precioPaquete = sucursal[indiceSucursal].calcular_precio(paquetes[contadorPaquete]);
            System.out.println("\nPrecio del paquete: $" + precioPaquete);
            contadorPaquete++;
          }//else
          break;
        case 3:
          System.out.print("\nNúmero de Sucursal: ");
          numeroSucursal = entrada.nextInt();
          indiceSucursal = buscarSucursal(sucursal, numeroSucursal, contadorSucursal);
          if (indiceSucursal == -1){
            System.out.println("La sucursal no existe");
          } else {
            System.out.println("\nLos datos de la sucursal son: ");
            System.out.println(sucursal[indiceSucursal].mostrarDatosSucursal());
          }
          break;
        case 4:
          System.out.println("\nNumero de Paquete: ");
          numeroPaquete = entrada.nextInt();
          indicePaquete = buscarPaquete(paquetes, numeroPaquete, contadorPaquete);
          if (indicePaquete == -1){
            System.out.println("El paquete no existe");
          }else{
            System.out.println("\nLos datos del paquete son: ");
            System.out.println(paquetes[indicePaquete].mostrarDatosPaquete());
          }
          break;
        case 5:
          System.out.println("\nTodos los datos de las sucursales son: ");
          for (int i=0;i<contadorSucursal;i++){
            System.out.println(sucursal[i].mostrarDatosSucursal());
          }
          break;
        case 6:
          System.out.println("\nTodos los datos de los paquetes son: ");
          for (int i=0;i<contadorPaquete;i++){
            System.out.println(paquetes[i].mostrarDatosPaquete());
          }
          break;
        case 7:
          System.out.println("Saliendo...");
          break;
        default:
          System.out.println("Opción no válida");
          break;
      }//Switch
    }while(opcion != 7);
  }
}
