package ejercicio_06_calcu;

public class Calculadora {
  //Atributos
  private double a;
  private double b;
  //Constructor para inicializar los atributos
  public Calculadora(double a, double b){
    this.a = a;
    this.b = b;
  }
  //Metodos Getter para obtener los valores de los atributos
  public double getA(){
    return this.a;
  }
  public double getB(){
    return this.b;
  }
  //Metodo para calcular la suma
  public Calculadora calcularSuma(Calculadora c){
    Calculadora suma = new Calculadora(a+c.getA(), b+c.getB());
    return suma;
  }
  //Metodo para calcular la multiplicacion
  public Calculadora calcularProducto(Calculadora c){
    Calculadora mult = new Calculadora((a*c.getA() - b*c.getB()), (a*c.getB()+b*c.getA()));
    return mult;
  }
  //Metodo para comparar igualdad
  public boolean comprobarIgualdad(Calculadora c){
    boolean igualdad = false;
    if ((a == c.getA()) && (b == c.getB())){
      igualdad = true;
    }
    return igualdad;
  }
  //Metodo para Mult por Entero
  public Calculadora multiplicarPorEntero(int x){
    Calculadora mult = new Calculadora(a*x, b*x);
    return mult;
  }
}
