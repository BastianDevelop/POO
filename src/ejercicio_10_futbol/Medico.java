package ejercicio_10_futbol;

public class Medico extends Persona{
  private String titulacion;
  private int yearExperience;

  public Medico(String nombre, String apellido, int edad, String titulacion, int yearExperience) {
    super(nombre, apellido, edad);
    this.titulacion = titulacion;
    this.yearExperience = yearExperience;
  }

  public String getTitulacion() {return titulacion;}
  public int getYearExperience() {return yearExperience;}

  @Override
  public void partidoFutbol() {
    System.out.println("Estoy atendiendo a un jugador");
  }
  @Override
  public void entrenamiento() {
    System.out.println("Estoy en el entrenamiento de un jugador");
  }

  public void curarLesion(){
    System.out.println("Estoy curando una lesión");
  }










}
