package ArreglosN_dimensiones;

import java.util.Random;
import java.util.Scanner;

public class IntercambiarFilasMatriz {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese el número de filas (m): ");
        int filas = teclado.nextInt();

        System.out.print("Ingrese el número de columnas (n): ");
        int columnas = teclado.nextInt();


        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {

            for (int j = 0; j < columnas; j++) {

                matriz[i][j] = random.nextInt(100); // Números aleatorios entre 0 y 99
            }
        }

        // Imprimir la matriz original
        System.out.println("Matriz original:");

        for (int i = 0; i < filas; i++) {

            for (int j = 0; j < columnas; j++) {

                System.out.print(matriz[i][j] + "\t");

            } System.out.println();
        }

        // Intercambiar la primera fila con la segunda fila
        if (filas >= 2) {
            int[] temp = matriz[0];
            matriz[0] = matriz[1];
            matriz[1] = temp;
        } else {
            System.out.println("No se pueden intercambiar las filas, ya que hay menos de 2 filas.");
        }

        // Imprimir la matriz 
        System.out.println("Matriz después del intercambio:");
        for (int i = 0; i < filas; i++) {

            for (int j = 0; j < columnas; j++) {

                System.out.print(matriz[i][j] + "\t");

            }System.out.println();
        }

        teclado.close();
    }
}

