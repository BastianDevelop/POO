package ejercicio_01_cuadri;

public class Cuadrilatero  {

    //Atributos
    private float lado1;
    private float lado2;

    //Metodo Constructor (Porque tiene el mismo nombre de la clase)
    public Cuadrilatero(float lado1, float lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    //Sobrecarga de Constructor (Porque ya hay otro constructor)
    public Cuadrilatero(float lado1) {
        this.lado1 = this.lado2 = lado1;
    }
    //Metodo accesor Getter para mostrar/calcular perimetro
    public float getPerimetro(){
        float perimetro = 2 * (lado1 + lado2);
        return perimetro;
    }
    //Metodo accesor Getter para mostrar/calcular perimetro
    public float getArea(){
        float area = lado1 * lado2;
        return area;
    }
}
