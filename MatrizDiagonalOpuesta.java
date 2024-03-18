package ArreglosN_dimensiones;

import java.util.Random;

public class MatrizDiagonalOpuesta {
    public static void main(String[] args) {

        int n = 4; // 'n' según el tamaño deseado de la matriz

        int[][] matriz = new int[n][n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                matriz[i][j] = random.nextInt(50) + 1;
            }
        }

        // Imprimir la matriz
        System.out.println("Matriz:");
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print(matriz[i][j] + "\t");

            } System.out.println();
        }

        // sumar diagonal opuesta a la principal
        int sumatoriaDiagonalOpuesta = 0;
        for (int i = 0; i < n; i++) {

            sumatoriaDiagonalOpuesta += matriz[i][n - 1 - i];
        }

        System.out.println("Sumatoria de la diagonal opuesta a la principal: " + sumatoriaDiagonalOpuesta);
    }
}
