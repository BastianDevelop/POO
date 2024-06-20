package ejercicio_03_vehiculo;

import java.util.Scanner;

public class Principal_3 {

    //Creamos un metodo Static ya que le pertenece a la clase y se utiliza en el main
    public static int indiceCarCheap(Vehiculo car[]){
        float precio;
        int indice = 0;
        precio = car[0].getPrecio();
        for (int i=1; i<car.length; i++){
            if (car[i].getPrecio() < precio){
                precio = car[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String marca, modelo;
        float precio;
        int numCar, indiCoche;

        System.out.print("Cuantos carcachos va a guardar: ");
        numCar = entrada.nextInt();
        //Creamos [n] cantidad de objetos para los carros
        Vehiculo car[] = new Vehiculo[numCar];

        for (int i = 0; i < car.length; i++){
            System.out.print("\nGuardando los datos del coche: "+(i+1)+"\nMarca: ");
            marca = entrada.next();
            System.out.print("Modelo: ");
            modelo = entrada.next();
            System.out.print("Precio: ");
            precio = entrada.nextFloat();
            car[i] = new Vehiculo(marca, modelo, precio);
        }
        indiCoche = indiceCarCheap(car);
        System.out.println("\nEl coche ma barato es: ");
        System.out.println(car[indiCoche].mostrarDatos());
    }
}
