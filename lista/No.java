//DEFINI QUE O NÓ É O TIPO T - ELEMENTO
public class No<T> {
    
    private T elemento;
    private No<T> proximo;

    public No(T elemento) {
        this.elemento = elemento;
        this.proximo = null;
    }

    public No(T elemento, No<T> proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public T getElemento() {
        return elemento;
    }
   
    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }

    public No<T> getProximo() {
        return proximo;
    }

    @Override
    public String toString() {
        return "No [elemento=" + elemento + ", proximo=" + proximo + "]";
    }

}

