package ejercicio_10_futbol;

public abstract class Persona {

  protected String nombre;
  protected String apellido;
  protected int edad;

  public Persona(String nombre, String apellido, int edad){
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
  }

  public String getNombre() {return nombre;}
  public String getApellido() {return apellido;}
  public int getEdad() {return edad;}

  public void viajar(){
    System.out.println("Voy a viajar");
  }
  public abstract void partidoFutbol();
  public abstract void entrenamiento();










}
