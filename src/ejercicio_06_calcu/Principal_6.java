package ejercicio_06_calcu;

import java.util.Scanner;

public class Principal_6 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    Calculadora numero1, numero2, suma, mult;
    double a, b, c, d;
    int opcion, numero;

    do{
      System.out.println("\t.:Operaciones con numeros Complejos:.");
      System.out.println("1. Sumar 2 numeros complejos");
      System.out.println("2. Multi 2 numeros complejos");
      System.out.println("3. Comparar 2 numeros complejos (Iguales o No)");
      System.out.println("4. Multi un numero complejo por un Entero");
      System.out.println("5. Salir");
      System.out.print("Digite una opcion: ");
      opcion = entrada.nextInt();
    }while(opcion != 5);

    switch (opcion){
      case 1:
        System.out.println("\nDigite el 1er numero complejo: ");
        System.out.println("Digite la parte real: ");
        a = entrada.nextDouble();
        System.out.println("Digite la parte imaginaria: ");
        b = entrada.nextDouble();
        System.out.println("\nDigite el 2do numero complejo: ");
        System.out.println("Digite la parte real: ");
        c = entrada.nextDouble();
        System.out.println("Digite la parte imaginaria: ");
        d = entrada.nextDouble();

        numero1 = new Calculadora(a, b);
        numero2 = new Calculadora(c, d);

        suma = numero1.calcularSuma(numero2);
        System.out.println("\nLa suma es: "+suma.getA()+"+"+suma.getB()+"i");
        break;
      case 2:
        System.out.println("\nDigite el 1er numero complejo: ");
        System.out.println("Digite la parte real: ");
        a = entrada.nextDouble();
        System.out.println("Digite la parte imaginaria: ");
        b = entrada.nextDouble();
        System.out.println("\nDigite el 2do numero complejo: ");
        System.out.println("Digite la parte real: ");
        c = entrada.nextDouble();
        System.out.println("Digite la parte imaginaria: ");
        d = entrada.nextDouble();

        numero1 = new Calculadora(a, b);
        numero2 = new Calculadora(c, d);

        mult = numero1.calcularProducto(numero2);
        System.out.println("\nEl producto es: "+mult.getA()+"+"+mult.getB()+"i");
        break;
      case 3:
        System.out.println("\nDigite el 1er numero complejo: ");
        System.out.println("Digite la parte real: ");
        a = entrada.nextDouble();
        System.out.println("Digite la parte imaginaria: ");
        b = entrada.nextDouble();
        System.out.println("\nDigite el 2do numero complejo: ");
        System.out.println("Digite la parte real: ");
        c = entrada.nextDouble();
        System.out.println("Digite la parte imaginaria: ");
        d = entrada.nextDouble();

        numero1 = new Calculadora(a, b);
        numero2 = new Calculadora(c, d);

        if(numero1.comprobarIgualdad(numero2)){
          System.out.println("\nLos numeros son iguales");
        }else{
          System.out.println("\nLos numeros no son iguales");
        }
        break;
      case 4:
        System.out.println("\nDigite el numero complejo: ");
        System.out.println("Digite la parte real: ");
        a = entrada.nextDouble();
        System.out.println("Digite la parte imaginaria: ");
        b = entrada.nextDouble();
        System.out.println("\nDigite el numero entero: ");
        numero = entrada.nextInt();

        numero1 = new Calculadora(a, b);

        mult = numero1.multiplicarPorEntero(numero);
        System.out.println("\nEl producto es: "+mult.getA()+"+"+mult.getB()+"i");
        break;
      case 5:
        System.out.println("\nGracias por usar el programa");
        break;
      default:
        System.out.println("\nOpcion no valida");
        break;
    }
    System.out.println("");

  }
}
