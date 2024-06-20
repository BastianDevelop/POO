package ejercicio_04_competencia;

import java.util.Scanner;

public class Principal_4 {
    //Metodo para mostrar el atleta ganador
    public static int indiWin(Atletas atle[]){
        float tiempoCarrerita;
        int indice = 0;
        tiempoCarrerita = atle[indice].getTiempoCarre();
        for (int i=0;i< atle.length;i++){
            if (atle[indice].getTiempoCarre() < tiempoCarrerita){
                tiempoCarrerita = atle[i].getTiempoCarre();
                indice = i;
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        //Vamos a pedir los datos
        Scanner entrada = new Scanner(System.in);
        //Creamos las variables
        String nombre;
        int numAtleta, nAtletas, indiceAtleWin;
        float tiempoCarre;
        //Pedimos cantidad de atletas
        System.out.print("Cuantos atletas van a participar: ");
        nAtletas = entrada.nextInt();
        //Creamos el objeto con un array para guardar la cantidad de Atletas
        Atletas atle[] = new Atletas[nAtletas];
        for (int i=0; i<atle.length;i++){
            System.out.println("\nAtleta No "+(i+1));
            System.out.print("Codigo del Atleta: ");
            numAtleta = entrada.nextInt();
            entrada.nextLine();
            System.out.print("Nombre del Atleta: ");
            nombre = entrada.nextLine();
            System.out.print("Tiempo de Carrera: ");
            tiempoCarre = entrada.nextFloat();
            //Guardamos los datos en el array
            atle[i] = new Atletas(numAtleta, nombre, tiempoCarre);
        }
        indiceAtleWin = indiWin(atle);
        System.out.println("\nEl Atleta ganador es: ");
        System.out.println(atle[indiceAtleWin].mostrarDaWin());
    }
}
