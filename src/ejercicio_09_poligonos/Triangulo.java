package ejercicio_09_poligonos;
////Heredamos con extends desde Poligono
public class Triangulo extends Poligono{
  //Atributos encapsulados con private para usar solo en esta clase
  private double lado1;
  private double lado2;
  private double lado3;
  //Constructor con (Parametros) para que se pueda iniciar los atributos y por heredar trae los atri de Poligono, lo cambiamos a 3 porque Triangulo solo tienen 3 lados
  public Triangulo(double lado1, double lado2, double lado3) {
    super(3);
    this.lado1 = lado1;
    this.lado2 = lado2;
    this.lado3 = lado3;
  }
  //getter por si necesitamos usar el atri en otra clase
  public double getLado1() { return lado1; }
  public double getLado2() { return lado2; }
  public double getLado3() { return lado3; }
  //Metodo toString para mostrar datos, lo genera el IDE
  @Override
  public String toString() {
    return "Triangulo: \n"+ super.toString() +"\nLado1 = " + lado1 + ", Lado2 = " + lado2 + ", Lado3 = " + lado3;
  }
  //Metodo accesor para mostrar/calcular el area, esta sobreescribiendo el abstract area de Poligono que es la clase padre
  @Override
  public double area(){
    double perimetro = (lado1 + lado2 + lado3) / 2;
    return Math.sqrt(perimetro * (perimetro - lado1) * (perimetro - lado2) * (perimetro - lado3));
  }
}
