package ArreglosN_dimensiones;

import java.util.Scanner;
import java.util.Random;

public class MatrizTranspuesta {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el número de filas (m): ");
        int filas = teclado.nextInt();

        System.out.print("Ingrese el número de columnas (n): ");
        int columnas = teclado.nextInt();

        int[][] matriz = new int[filas][columnas];

       
        System.out.println("Ingrese los valores de la matriz:");
        for (int i = 0; i < filas; i++) {

            for (int j = 0; j < columnas; j++) {

                matriz[i][j] = random.nextInt(50);
            }
        }

        System.out.println("Matriz original:");
        for (int i = 0; i < filas; i++) {

            for (int j = 0; j < columnas; j++) {

                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Calcular la matriz transpuesta
        int[][] transpuesta = new int[columnas][filas];
        for (int i = 0; i < filas; i++) {

            for (int j = 0; j < columnas; j++) {

                transpuesta[j][i] = matriz[i][j];

            }
        }

        // Imprimir 
        System.out.println("Matriz transpuesta:");
        for (int i = 0; i < columnas; i++) {

            for (int j = 0; j < filas; j++) {

                System.out.print(transpuesta[i][j] + "\t");
            }
            System.out.println();
        }

        teclado.close();
    }
}

