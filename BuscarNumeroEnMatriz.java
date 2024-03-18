package ArreglosN_dimensiones;

import java.util.Random;
import java.util.Scanner;

public class BuscarNumeroEnMatriz {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese el número de filas: ");
        int filas = teclado.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int columnas = teclado.nextInt();

        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            
            for (int j = 0; j < columnas; j++) {

                matriz[i][j] = random.nextInt(100);
            }
        }

        System.out.print("Ingrese el número que desea buscar: ");
        int numeroBuscado = teclado.nextInt();

        boolean encontrado = false;

        // Imprimir la matriz
        for (int i = 0; i < filas; i++) {

            for (int j = 0; j < columnas; j++) {

                System.out.print(matriz[i][j] + "\t");

            }System.out.println();
        }

        // Buscar el número en la matriz
        for (int i = 0; i < filas; i++) {

            for (int j = 0; j < columnas; j++) {

                if (matriz[i][j] == numeroBuscado) {

                    System.out.println("El número " + numeroBuscado + " se encuentra en la posición [" + i + "][" + j + "]");
                    encontrado = true;

                    break;
                }
            }
            if (encontrado) {

                break;
            }
        }

        if (!encontrado) {

            System.out.println("El número " + numeroBuscado + " no se encuentra en la matriz.");

        }

        teclado.close();
    }
}
