package Dimensionalidad;

import java.util.Random;
import java.util.Scanner;

public class SumarMatrices {

    public static void main(String args[]){

        int i, j;
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Digite el tamaño de la fila : ");
        int fila1 =  teclado.nextInt();
        System.out.println("Digite el tamaño de la columna : ");
        int colum1 = teclado.nextInt();

        System.out.println("Digite el tamaño de la fila de la segunda matriz : ");
        int fila2 =  teclado.nextInt();
        System.out.println("Digite el tamaño de la columna de la segunda matriz : ");
        int colum2 = teclado.nextInt();

        int[][] matriz1 = new int[fila1][colum1];
        int[][] matriz2 = new int[fila2][colum2];
        int[][] sumada = new int[fila1][colum1];

        if(fila1 != fila2 || colum1 != colum2){
            System.out.println("Las matrices no son iguales por lo tanto no se pueden sumar.");
        }else{

            //llenar matrices random
            for(i=0; i < fila1; i++){
                for(j=0; j < colum1; j++){
            matriz1[i][j] = random.nextInt(100);
            matriz2[i][j] = random.nextInt(100);
            //sumada[i][j] = random.nextInt(100); 
                }
            }
            
            //imprimir las matrices antes de sumarlas 
            System.out.println("\tPRIMERA MATRIZ ");
            System.out.println("------------------------------");
            for(i=0; i < fila1; i++){
                System.out.println("");
                for(j=0; j < colum1; j++){
                    System.out.print("  [" + matriz1[i][j] + "]   ");
                }
            } System.out.println();

            System.out.println("\n\tSEGUNDA MATRIZ ");
            System.out.println("-----------------------------");
            for(i=0; i < fila1; i++){
                System.out.println("");
                for(j=0; j < colum1; j++){
                    System.out.print("  [" + matriz2[i][j] + "]   ");
                }
            } System.out.println();

            //sumamos las 2 matrices a la resultante
            for(i=0; i < fila1; i ++){
                for(j=0; j < fila1 ; j ++){
                    sumada[i][j] = matriz1[i][j] + matriz2[i][j];
                }
            }

            //impresion de la matriz resultante
            System.out.println("\n\t MATRIZ RESULTANTE");
            System.out.println("-----------------------------");
            for(i=0; i < fila1; i++){
                System.out.println("");
                for(j=0; j < colum1; j++){
                    System.out.print("  [" + sumada[i][j] + "]   ");
                }
            } System.out.println("");
        }

    }
}
