package Dimensionalidad;

public class TresxCuatro {
    
    public static void main (String args[]){

        int i, j;
        int[][] matrizNumeros = {{2,4,3},{6,8,2},{10,12,0},{12,23,6}};

        int filas = matrizNumeros.length;
        int columna = matrizNumeros[0].length;
        System.out.println("Impresion de matriz inciialzada directamente!");

        for(i=0; i < filas; i++){
            System.out.println("");
            for(j=0; j < columna; j++){
                System.out.print(" [" + matrizNumeros[i][j] + "]   ");
            }
        } System.out.println();
    

    }
}
