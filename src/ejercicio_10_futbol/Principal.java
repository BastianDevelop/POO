package ejercicio_10_futbol;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
  static ArrayList<Persona> persona = new ArrayList<Persona>();
  static Scanner entrada = new Scanner(System.in);
  static Persona futbolista1 = new Futbolista("Lalo", "Mendez", 20, 9, "Delantero");
  static Persona futbolista2 = new Futbolista("Peco", "Paque", 31, 10, "Defensa");
  static Persona entrenador = new Entrenador("Mark", "Smith", 38, "Entrenador de fuerza");
  static Persona medico = new Medico("Raul", "Divala",50,"Especialista",8);

  public static void main(String[] args) {

    persona.add(futbolista1);
    persona.add(futbolista2);
    persona.add(entrenador);
    persona.add(medico);
    menu();
  }
  public static void menu(){
    int opcion;
    do {
      System.out.println("\tMenu:.");
      System.out.println("1. Viajar");
      System.out.println("2. Entrenamiento");
      System.out.println("3. Partido de futbol");
      System.out.println("4. Planificar Entrenamiento");
      System.out.println("5. Entrevista");
      System.out.println("6. Curar Lesión");
      System.out.println("7. Salir");
      System.out.print("Digite una opcion: ");
      opcion = entrada.nextInt();

      switch (opcion){
        case 1:
          System.out.println("");
          viajarEquipo();
          break;
        case 2:
          System.out.println("");
          entrenarEquipo();
          break;
        case 3: System.out.println("");
          partidoFutbol();
          break;
        case 4:
          System.out.println("");
          planificarEntrenamiento();
          break;
        case 5:
          System.out.println("");
          DarEntrevista();
          break;
        case 6:
          System.out.println("");
          curarLesion();
          break;
        case 7:
          System.out.println("Gracias por usar nuestro programa");
          break;
        default:
          System.out.println("Opcion incorrecta");
      }
    }while (opcion != 7);

  }
  public static void viajarEquipo(){
    for (Persona equipo : persona){
      System.out.print(equipo.getNombre()+" "+equipo.getApellido()+" -> ");
      equipo.viajar();
    }
  }
  public static void entrenarEquipo(){
    for (Persona equipo : persona){
      System.out.print(equipo.getNombre()+" "+equipo.getApellido()+" -> ");
      equipo.entrenamiento();
    }
  }
  public static void partidoFutbol(){
    for (Persona equipo : persona){
      System.out.print(equipo.getNombre()+" "+equipo.getApellido()+" -> ");
      equipo.partidoFutbol();
    }
  }
  public static void planificarEntrenamiento(){
    System.out.print(entrenador.getNombre()+" "+entrenador.getApellido()+" -> ");
    ((Entrenador)entrenador).planificarEntrenamiento();
  }
  public static void DarEntrevista(){
    System.out.print(futbolista1.getNombre()+" "+futbolista1.getApellido()+" -> ");
    ((Futbolista)futbolista1).entrevista();
    System.out.print(futbolista2.getNombre()+" "+futbolista2.getApellido()+" -> ");
    ((Futbolista)futbolista2).entrevista();
  }
  public static void curarLesion(){
    System.out.print(medico.getNombre()+" "+medico.getApellido()+" -> ");
    ((Medico)medico).curarLesion();
  }











}
