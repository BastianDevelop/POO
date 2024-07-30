package ejercicio_09_poligonos;

public abstract class Poligono {
  //Atributos encapsulados con protected por que tiene hijos que necesitan usarlo
  protected int numeroLados;

  //Constructor con (Parametros) para que se pueda iniciar los atributos
  public Poligono(int numeroLados) {
    this.numeroLados = numeroLados;
  }
  //getter por si necesitamos usar el atri en otra clase
  public int getNumeroLados() { return numeroLados; }
  //Metodo toString para mostrar datos, lo genera el IDE
  @Override
  public String toString() {
    return "Numero de Lados = " + numeroLados ;
  }
  //Metodo abstracto para calcular el area
  public abstract double area();
}
