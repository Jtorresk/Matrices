package HashdelProfe;
    import java.util.Arrays;

/**
 *
 * @author Dell G15 Ryzen
 */
public class TablaHash {

    String[] arreglo;
    int longitud;

    public TablaHash(int longi) {
        longitud = longi;
        arreglo = new String[longi];
        // -1 todavia no tiene nada
        Arrays.fill(arreglo, "-1");
    }

    public void funcionHash(String[] cadenaArreglo, String[] arreglo) {
        int i;
        for (i = 0; i < cadenaArreglo.length; i++) {
            String elemento = cadenaArreglo[i];
            int indiceArreglo = Integer.parseInt(elemento) % 7;
            System.out.println("El indice es " + indiceArreglo
                    + " para el elemento " + elemento);
            //tratando las coliciones 
            while (arreglo[indiceArreglo] != "-1") {
                indiceArreglo++;
                System.out.println("Ocurrio una colision en el indice "
                        + (indiceArreglo - 1) + " Cambiar indice "
                        + indiceArreglo);
                indiceArreglo %= longitud;
            }
            arreglo[indiceArreglo] = elemento;
        }
    }
    //metodo de mostar la tabala hash

    public void mostrar() {
        int incremento = 0, i, j;
        for (i = 0; i < 1; i++) {
            incremento += 8;
            for (j = 0; j < 71; j++) {
                System.out.print("-");
            }
            System.out.println();
            for (j = incremento - 8; j < incremento; j++) {
                System.out.format("| %3s" + " ", j);
            }
            System.out.println("|");
            for (int n = 0; n < 71; n++) {
                System.out.print("-");
            }
            System.out.println();

            for (j = incremento - 8; j < incremento; j++) {
                if (arreglo[j].equals("-1")) {
                    System.out.print("|    ");
                } else {
                    System.out.print(String.format("| %3s" + " ", arreglo[j]));
                }
            }
            System.out.println("|");
            for (j = 0; j < 71; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }

    public String buscaClave(String elemento) {
        int indiceArreglo = Integer.parseInt(elemento) % 7;
        int contador = 0;
        while (arreglo[indiceArreglo] != "-1") {
            if (arreglo[indiceArreglo] == elemento) {
                System.out.println("El elemento " + elemento
                        + "fue encontrado en la posicion " + indiceArreglo);
                return arreglo[indiceArreglo];
            }
            indiceArreglo++;
            indiceArreglo %= longitud;
            contador++;
            if (contador > 7) {
                break;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        TablaHash hash = new TablaHash(8);
        String[] elementos = {"20", "33", "21", "10", "12", "14", "56", "100"};
        hash.funcionHash(elementos, hash.arreglo);
        hash.mostrar();
        String buscado = hash.buscaClave("20");
        if (buscado == null) {
            System.out.println("El elemento no se encuentra en la tabla");
        }

    }

}


/*package Parcial3Estructura;

import java.util.Scanner;

class NodoHash {
    int valor;
    NodoHash siguiente;

    public NodoHash(int valor) {
        this.valor = valor;
        this.siguiente = null;
    }
}


class ListaEnlazada {
    NodoHash primero;

    public ListaEnlazada() {
        this.primero = null;
    }

    
    public void agregar(int valor) {
        NodoHash nuevoNodo = new NodoHash(valor);
        nuevoNodo.siguiente = primero;
        primero = nuevoNodo;
    }

    
    public void imprimir() {
        NodoHash actual = primero;
        while (actual != null) {
            System.out.print(actual.valor + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

    // Método para buscar un valor en la lista
    public boolean buscar(int valor) {
        NodoHash actual = primero;
        while (actual != null) {
            if (actual.valor == valor) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    // Método para verificar si la lista tiene más de un elemento (colisión)
    public boolean tieneColision() {
        return primero != null && primero.siguiente != null;
    }
}

// Clase que representa la tabla hash con manejo de colisiones mediante listas enlazadas
class TablaHash {
    int tamaño;
    ListaEnlazada[] tabla;

    public TablaHash(int tamaño) {
        this.tamaño = tamaño;
        this.tabla = new ListaEnlazada[tamaño];
        for (int i = 0; i < tamaño; i++) {
            tabla[i] = new ListaEnlazada();
        }
    }

    // Método para insertar un valor en la tabla hash
    public void insertar(int valor) {
        int indice = hash(valor);
        ListaEnlazada listaEnlazada = tabla[indice];
        listaEnlazada.agregar(valor);

        // Imprimir mensaje de colisión si la lista tiene más de un elemento
        if (listaEnlazada.tieneColision()) {
            System.out.println("Colisión en el índice " + indice);
        }
    }

    // Método para imprimir la tabla hash y sus elementos
    public void imprimirTabla() {
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Índice " + i + ": ");
            tabla[i].imprimir();
        }
    }

    // Método para buscar un valor en la tabla hash
    public boolean buscar(int valor) {
        int indice = hash(valor);
        return tabla[indice].buscar(valor);
    }

    // Función de hash simple (resto de la división)
    private int hash(int valor) {
        return valor % tamaño;
    }
}

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la tabla hash con tamaño 10
        TablaHash tabla = new TablaHash(10);

        // Secuencia de números dada
        int[] valores = {23, 33, 8, 24, 35, 25, 16, 43, 14};

        // Insertar los valores en la tabla hash
        for (int valor : valores) {
            tabla.insertar(valor);
        }

        // Imprimir la tabla hash
        System.out.println("Tabla Hash:");
        tabla.imprimirTabla();
    }
} */