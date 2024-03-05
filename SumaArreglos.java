package Dimensionalidad;
import java.util.Scanner;

public class SumaArreglos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de los arreglos: ");
        int tamano = scanner.nextInt();

        int[] arreglo1 = new int[tamano];
        int[] arreglo2 = new int[tamano];
        int[] resultado = new int[tamano];

        // Llenar el primer arreglo
        System.out.println("Ingrese los elementos del primer arreglo:");
        for (int i = 0; i < tamano; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo1[i] = scanner.nextInt();
        }

        // Llenar el segundo arreglo
        System.out.println("Ingrese los elementos del segundo arreglo:");
        for (int i = 0; i < tamano; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo2[i] = scanner.nextInt();
        }

        // Sumar los arreglos
        for (int i = 0; i < tamano; i++) {
            resultado[i] = arreglo1[i] + arreglo2[i];
        }

        // Mostrar el resultado
        System.out.println("La suma de los arreglos es:");
        for (int i = 0; i < tamano; i++) {
            System.out.print(resultado[i] + " ");
        }

        // Cerrar el scanner
        scanner.close();
    }
}


