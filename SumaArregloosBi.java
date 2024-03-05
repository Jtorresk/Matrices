package Dimensionalidad;

import java.util.Random;
import java.util.Scanner;

public class SumaArregloosBi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese el número de filas para el primer arreglo: ");
        int filas1 = scanner.nextInt();
        System.out.print("Ingrese el número de columnas para el primer arreglo: ");
        int columnas1 = scanner.nextInt();

        System.out.print("Ingrese el número de filas para el segundo arreglo: ");
        int filas2 = scanner.nextInt();
        System.out.print("Ingrese el número de columnas para el segundo arreglo: ");
        int columnas2 = scanner.nextInt();

        // Verificar si los arreglos tienen tamaños diferentes
        if (filas1 != filas2 || columnas1 != columnas2) {
            System.out.println("Los arreglos tienen tamaños diferentes. No se pueden sumar.");
            scanner.close();
            return;
        }

        int[][] arreglo1 = new int[filas1][columnas1];
        int[][] arreglo2 = new int[filas2][columnas2];
        int[][] resultado = new int[filas1][columnas1];

        // Llenar los arreglos con valores aleatorios
        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas1; j++) {
                arreglo1[i][j] = random.nextInt(100); // Valores aleatorios entre 0 y 99
                arreglo2[i][j] = random.nextInt(100);
            }
        }

        // Sumar los arreglos
        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas1; j++) {
                resultado[i][j] = arreglo1[i][j] + arreglo2[i][j];
            }
        }

        // Mostrar los arreglos originales
        System.out.println("Primer arreglo aleatorio:");
        imprimirArreglo(arreglo1);

        System.out.println("\nSegundo arreglo aleatorio:");
        imprimirArreglo(arreglo2);

        // Mostrar el resultado
        System.out.println("\nLa suma de los arreglos es:");
        imprimirArreglo(resultado);

        // Cerrar el scanner
        scanner.close();
    }

    // Método para imprimir un arreglo bidimensional
    public static void imprimirArreglo(int[][] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                System.out.print(arreglo[i][j] + " ");
            }
            System.out.println();
        }
    }
}

