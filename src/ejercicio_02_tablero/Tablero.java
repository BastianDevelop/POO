package ejercicio_02_tablero;

public class Tablero {

    //Atributos
    private int x;
    private int y;

    //Constructor con (Parametros)
    public Tablero(int x, int y){
        this.x = x;
        this.y = y;
    }
    //Metodos
    public void moverArriba(int incremento) {
        y += incremento;
    }
    public void moverAbajo(int incremento) {
        y -= incremento;
    }
    public void moverDerecha(int incremento) {
        x += incremento;
    }
    public void moverIzquierda(int incremento) {
        x -= incremento;
    }

    //Getters
    public int getX(){
        return x;
    }
    public int getY() {
        return y;
    }
}

