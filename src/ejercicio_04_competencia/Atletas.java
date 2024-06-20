package ejercicio_04_competencia;

public class Atletas {
    //Atributos
    private int numAtleta;
    private String nombre;
    private float tiempoCarre;
    //Inicializamos con el Constructor
    public Atletas (int numAtleta, String nombre, float tiempoCarre){
        this.numAtleta = numAtleta;
        this.nombre = nombre;
        this.tiempoCarre = tiempoCarre;
    }
    //Metodo Getter para obtener el tiempo de la carrera
    public float getTiempoCarre(){
        return tiempoCarre;
    }
    //Metodo para mostrar datos
    public String mostrarDaWin(){
        return "Numero de Atleta: "+numAtleta+"\nNombre del Atleta: "+nombre+"\nTiempo de Carrera: "+tiempoCarre;
    }



}


