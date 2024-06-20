package ejercicio_05_triangulo;

public class Triangulo {
    //Atributos
    private double base;
    private double lado;
    //Constructor para inicializar los atributos
    public Triangulo(double base, double lado){
        this.base = base;
        this.lado = lado;
    }
    //Metodo para obtener el perimetro
    public double obtenerPerimetro(){
        double perimetro = 2 * lado + base;
        return perimetro;
    }
    //Metodo para obtener el area
    public double obtenerArea(){
        double area = (base * Math.sqrt((lado * lado) - ((base * base)/4)))/2;
        return area;
    }
}