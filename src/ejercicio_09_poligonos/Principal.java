package ejercicio_09_poligonos;

import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
  //ArrayList para almacenar objetos de tipo Poligono
  static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
  static Scanner entrada = new Scanner(System.in);
  public static void main(String[] args) {
    llenarPoligono();
    //Metodo para mostrar los datos y el area de cada poligono
    mostrarResultados();
  }
  //Método para llenar el poligono
  public static void llenarPoligono(){
    int opcion;
    char respuesta;
    do {
      do {
        System.out.println("Digite que poligono que desea");
        System.out.println("1. Triangulo");
        System.out.println("2. Rectangulo");
        System.out.print("Opcion: ");
        opcion = entrada.nextInt();
      }while (opcion<1 || opcion>2);

      switch(opcion){
        case 1: llenarTriangulo();//Llenar triangulo
          break;
        case 2: llenarRectangulo();//Llenar rectangulo
          break;
      }
      System.out.print("Desea agregar otro poligono? (s/n): ");
      respuesta = entrada.next().charAt(0);
      entrada.nextLine(); //Limpia el buffer
      System.out.println();

    }while (respuesta=='s' || respuesta=='S');
  }

  public static void llenarTriangulo(){
    double lado1, lado2, lado3;
    System.out.print("\nDigite el lado 1 del triangulo: ");
    lado1 = entrada.nextDouble();
    System.out.print("Digite el lado 2 del triangulo: ");
    lado2 = entrada.nextDouble();
    System.out.print("Digite el lado 3 del triangulo: ");
    lado3 = entrada.nextDouble();
    Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
    //Guardamos un triangulo dentro de nuestro arreglo de poligonos
    poligono.add(triangulo);
  }

  public static void llenarRectangulo(){
    double lado1, lado2;
    System.out.print("\nDigite el lado 1 del rectangulo: ");
    lado1 = entrada.nextDouble();
    System.out.print("Digite el lado 2 del rectangulo: ");
    lado2 = entrada.nextDouble();
    Rectangulo rectangulo = new Rectangulo(lado1, lado2);
    //Guardamos un rectangulo dentro de nuestro arreglo de poligonos
    poligono.add(rectangulo);
  }
  //Método para mostrar los datos y el area de cada poligono
  public static void mostrarResultados(){
    System.out.println("\nResultados:");
    for(Poligono p : poligono){
      System.out.println(p.toString());
      System.out.printf("Area = "+p.area());
      System.out.println();
    }
  }
}
