package ejercicio_02_tablero;

import java.util.Scanner;

public class Principal_2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Tablero tab;

        int x;
        int y;
        int opc;
        int incremento = 0;

        System.out.print("Digite la cordenada de X: ");
        x = entrada.nextInt();
        System.out.print("Digite la cordenada de Y: ");
        y = entrada.nextInt();

        //Poscicion inicial del objeto
        tab = new Tablero(x, y);

        do {
            System.out.print("""
                    *****MENU*****
                    1. Mover hacia Arriba
                    2. Mover hacia Abajo
                    3. Mover hacia la Derecha
                    4. Mover hacia la Izquierda
                    5. Nospi Pichurria
                    """);
            System.out.print("Hable Haber......: ");
            opc = entrada.nextInt();

            if (opc >= 1 && opc <= 4){
                System.out.print("Digite la cantidad de espacios a moverse: ");
                incremento = entrada.nextInt();
            }
            switch (opc){
                case 1: tab.moverArriba(incremento); break;
                case 2: tab.moverAbajo(incremento); break;
                case 3: tab.moverDerecha(incremento); break;
                case 4: tab.moverIzquierda(incremento); break;
                case 5: break;
                default: System.out.println("No entiende que es del 1 al 5...");
            }
            System.out.print("La poscicion actual:  (X: " +tab.getX()+")   (Y: "+tab.getY()+")"+"\n");

        }while (opc != 5);
        System.out.println("\nMueve esas coordenadas como una marikita...");
    }
}

