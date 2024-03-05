package Dimensionalidad;

import java.util.Random;
import java.util.Scanner;

public class MultipMatrices {

public static void main(String[] args) {
// Crear un objeto Random para generar números aleatorios
Random rnd = new Random();

// Crear un objeto Scanner para leer la entrada del usuario
Scanner sc = new Scanner(System.in);

// Pedir al usuario el número de filas y columnas de la primera matriz
System.out.println("Ingrese el número de filas de la primera matriz:");
int filas1 = sc.nextInt();
System.out.println("Ingrese el número de columnas de la primera matriz:");
int columnas1 = sc.nextInt();

// Crear la primera matriz con las dimensiones ingresadas
int[][] matriz1 = new int[filas1][columnas1];

// Llenar la primera matriz con números aleatorios entre 0 y 9
for (int i = 0; i < filas1; i++) {
for (int j = 0; j < columnas1; j++) {
matriz1[i][j] = rnd.nextInt(10);
}
}

// Mostrar la primera matriz
System.out.println("La primera matriz es:");
imprimirMatriz(matriz1);

// Pedir al usuario el número de filas y columnas de la segunda matriz
System.out.println("Ingrese el número de filas de la segunda matriz:");
int filas2 = sc.nextInt();
System.out.println("Ingrese el número de columnas de la segunda matriz:");
int columnas2 = sc.nextInt();

// Crear la segunda matriz con las dimensiones ingresadas
int[][] matriz2 = new int[filas2][columnas2];

// Llenar la segunda matriz con números aleatorios entre 0 y 9
for (int i = 0; i < filas2; i++) {
for (int j = 0; j < columnas2; j++) {
matriz2[i][j] = rnd.nextInt(10);
}
}

// Mostrar la segunda matriz
System.out.println("La segunda matriz es:");
imprimirMatriz(matriz2);

// Verificar si se puede multiplicar las matrices
if (columnas1 == filas2) {
// Si se puede, crear la matriz resultante con las dimensiones adecuadas
int[][] resultado = new int[filas1][columnas2];

// Realizar la multiplicación de las matrices y guardar el resultado
for (int i = 0; i < filas1; i++) {
for (int j = 0; j < columnas2; j++) {
for (int k = 0; k < columnas1; k++) {
resultado[i][j] += matriz1[i][k] * matriz2[k][j];
}
}
}

// Mostrar la matriz resultante
System.out.println("La matriz resultante es:");
imprimirMatriz(resultado);
} else {
// Si no se puede, mostrar un mensaje explicando por qué
System.out.println("No se puede multiplicar las matrices porque el número de columnas de la primera matriz no coincide con el número de filas de la segunda matriz.");
}
}

// Método para imprimir una matriz por consola
public static void imprimirMatriz(int[][] matriz) {
for (int[] fila : matriz) {
for (int elemento : fila) {
System.out.print(elemento + " ");
}
System.out.println();
   }
  }
}