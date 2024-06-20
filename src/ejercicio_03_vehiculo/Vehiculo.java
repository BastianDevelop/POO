package ejercicio_03_vehiculo;

public class Vehiculo {

    //Atributos
    private String marca;
    private String modelo;
    private float precio;

    //Creamos el constructor para inicializar los atributos
    public Vehiculo(String marca, String modelo, float precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    //Creamos el Getter para OBTENER el carro mas barato
    public float getPrecio(){
        return precio;
    }
    //Mostrar cual es el carro mas barato y sus caracteristicas
    public String mostrarDatos(){
        return "Marca: "+marca+"\nModelo: "+modelo+"\nPrecio: $"+precio+"\n";
    }






}
