package Listas;

public class Nodo {
    private int valor;
    private Nodo sig;

    public void Nodo(){
        this.valor = 0;
        this.sig = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
}


