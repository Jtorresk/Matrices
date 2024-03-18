package ArreglosN_dimensiones;
    
import java.util.Random;

public class MatrizSimetrica {
    public static void main(String[] args) {

        int n = 4; // 'n' según el tamaño deseado de la matriz

        Random random = new Random();

        int[][] matriz = new int[n][n];
      

    
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                matriz[i][j] = random.nextInt(100); 
            }
        }

        // Imprimir la matriz
        System.out.println("Matriz:");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print(matriz[i][j] + "\t");
            }System.out.println();
        }

        //  es simétrica?
        boolean esSimetrica = true;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (matriz[i][j] != matriz[j][i]) {

                    esSimetrica = false;

                    break;
                }
            }
        }

        // Imprimir si es simetrica ono
        if (esSimetrica) {

            System.out.println("La matriz es simétrica.");

        } else {

            System.out.println("La matriz no es simétrica.");
        }

        // Imprimir los números de las esquinas
        System.out.println("Números de las esquinas:");
        System.out.println("Esquina superior izquierda: " + matriz[0][0]);
        System.out.println("Esquina superior derecha: " + matriz[0][n - 1]);
        System.out.println("Esquina inferior izquierda: " + matriz[n - 1][0]);
        System.out.println("Esquina inferior derecha: " + matriz[n - 1][n - 1]);
    }
}

