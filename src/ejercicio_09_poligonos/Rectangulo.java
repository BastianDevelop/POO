package ejercicio_09_poligonos;
//Heredamos con extends desde Poligono
public class Rectangulo extends Poligono{
  //Atributos encapsulados con private para usar solo en esta clase
  private double lado1;
  private double lado2;
  //Constructor con (Parametros) para que se pueda iniciar los atributos y por heredar trae los atri de Poligono, lo cambiamos a 2 porque Rectangulo solo tienen 2 lados
  public Rectangulo(double lado1, double lado2) {
    super(2);
    this.lado1 = lado1;
    this.lado2 = lado2;
  }
  //getter por si necesitamos usar el atri en otra clase
  public double getLado1() { return lado1; }
  public double getLado2() { return lado2; }
  //Metodo toString para mostrar datos, lo genera el IDE
  @Override
  public String toString() {
    return "Rectangulo: \n"+ super.toString() +"\nLado1 = " + lado1 + ", Lado2 = " + lado2;
  }
  //Metodo accesor para mostrar/calcular el area, esta sobreescribiendo el abstract area de Poligono que es la clase padre
  @Override
  public double area(){
    return lado1 * lado2;
  }
}
