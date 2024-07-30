package ejercicio_10_futbol;

public class Entrenador extends Persona{
  private String estrategia;

  public Entrenador(String nombre, String apellido, int edad, String estrategia) {
    super(nombre, apellido, edad);
    this.estrategia = estrategia;
  }

  public String getEstrategia() {return estrategia;}

  @Override
  public void partidoFutbol() {
    System.out.println("Estoy dirigiendo el partido");
  }
  @Override
  public void entrenamiento() {
    System.out.println("Dirijo el entrenamiento");
  }

  public void planificarEntrenamiento(){
    System.out.println("Estoy planificando el entrenamiento");
  }












}
