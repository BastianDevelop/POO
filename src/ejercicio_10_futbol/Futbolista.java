package ejercicio_10_futbol;

public class Futbolista extends Persona{

  private int dorsal;
  private String posicion;

  public Futbolista(String nombre, String apellido, int edad, int dorsal, String posicion) {
    super(nombre, apellido, edad);
    this.dorsal = dorsal;
    this.posicion = posicion;
  }

  public int getDorsal() {return dorsal;}
  public String getPosicion() {return posicion;}

  @Override
  public void partidoFutbol() {
    System.out.println("Estoy participando en el partido");
  }
  @Override
  public void entrenamiento() {
    System.out.println("Estoy en el entrenamiento");
  }

  public void entrevista(){
    System.out.println("Realizo entrevista");
  }






}
