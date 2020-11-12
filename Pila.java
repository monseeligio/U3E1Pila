
package u3e1pila;
public class pila {
    Nodo cima;
    int tamanio;
    
        public boolean vacia(){
        return cima==null;
    }
    
    public void empuja(int elemento){
        Nodo nodo= new Nodo(elemento);
        nodo.Siguiente= cima;
        cima=nodo;
        tamanio++;
    }
    
    public void Sacarpila(){
        if(vacia()){
            System.out.println("La pila esta vacia");
        }
        else{
       // String auxiliar =cima.elemento;
        cima=cima.Siguiente;
        tamanio--;
        }
        //return auxiliar;
    }
    public void mostrarPila(){
        if(vacia()){
            System.out.println("La pila esta vacia");
        }
        else{
        Nodo recorre=cima;
        while(recorre!=null){
            System.out.println(recorre.elemento);
            recorre=recorre.Siguiente;}
        }
    }
    
}


