package ejercicio_01_cuadri;

import javax.swing.*;

public class Principal {

    public static void main(String[] args) {
        //Creamos el Objeto
        Cuadrilatero cuadri;
        //Creamos las Variables para pedir el numero
        float lado1;
        float lado2;

        //Pedimos el numero con las variables creadas
        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Cual es el lado 1?"));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Cual es el lado 1?"));

        //Condicionamos pare ver que constructor usar de los 2 que hay
        if (lado1 == lado2){
            cuadri = new Cuadrilatero(lado1);
        }else{
            cuadri = new Cuadrilatero(lado1, lado2);
        }
        //Impprimimos según el resultado de la condicion
        System.out.println("El perimetro es: "+cuadri.getPerimetro());
        System.out.println("El area es: "+cuadri.getArea());
    }
}
