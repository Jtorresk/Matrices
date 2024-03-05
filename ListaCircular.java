package Listas;

public class ListaCircular {
    private Nodo cabecera;

    public void ListaCircular(){
        cabecera = null;
    }

    public boolean esVacia(){
        return cabecera == null;
    }

    public void insertarInicio(int valor){
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if(esVacia()){
            cabecera=nuevo;
            nuevo.setSig(cabecera);
        } 
        else{ Nodo aux = cabecera;
            do{ aux = aux.getSig();
              }while(aux.getSig()!=cabecera);
        aux.setSig(nuevo);
        nuevo.setSig(cabecera);
        cabecera=nuevo;
        }
    }

    public void insertarFinal(int valor){
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if(esVacia()){
            cabecera=nuevo;
            nuevo.setSig(cabecera);
        } 
        else{ Nodo aux = cabecera;
            do{ aux = aux.getSig();
              }while(aux.getSig()!=cabecera);
        aux.setSig(nuevo);
        nuevo.setSig(cabecera);
        }
    }
    public void MostrarCompleta(){
        if (cabecera==null) return;
    Nodo aux=cabecera;
    do{ System.out.println(aux.getValor());
        aux=aux.getSig();
    }while (aux!=cabecera);
    }

    public void Mostrarincompleta()
    {if (cabecera==null) return;
    Nodo aux=cabecera;
    do{ System.out.println(aux.getValor());
    aux=aux.getSig();
    }while (aux.getSig()!=cabecera);
    }

    public boolean Buscar(int Abuscar){
     if(esVacia()){
        return false; }
    Nodo aux=cabecera;
    do{ if(aux.getValor()==Abuscar){
       return true;}
    else{
       aux=aux.getSig();}
    }while(aux!=cabecera);
    return false;
    }

    public void Modificar(int Abuscar, int cambio){
     if(esVacia()){
    return;}
    Nodo aux=cabecera;
    do{ if(aux.getValor()==Abuscar)
    {aux.setValor(cambio);
    return; }
    else {
    aux=aux.getSig(); } 
    }while(aux!=cabecera);
    System.out.println("Valor no existe en la lista");
    }

    public void EliminaUltimo()
    { if (esVacia()) {
    return; }
    Nodo ant, aux=cabecera;
    do{ ant=aux; 
    aux=aux.getSig();
    } while(aux.getSig()!=cabecera);
    ant.setSig(aux.getSig());
    if(aux==cabecera)
    cabecera=null; 
} 

    /*public void Elimina(int Abuscar) {
    boolean encontrado=false;
    if (esVacia()) { return; }
    Nodo ant, aux=cabecera;
    do{ if(aux.getValor()== Abuscar ){
    encontrado=true; } // 
    else {
    ant=aux;
    aux=aux.getSig(); }
    } while(aux!=cabecera && !encontrado);
    if (encontrado) {
    if (aux==cabecera && aux.getSig()==cabecera) {
    cabecera=null; } //verifica si es el único nodo 
    else{//verifica si es el primero de la lista
    if (aux==cabecera){
    ant.getSig(cabecera.getSig());
    cabecera = cabecera.getSig(); }
    else {
    ant.getSig(aux.getSig()); }
    }
    }
}*/
}
