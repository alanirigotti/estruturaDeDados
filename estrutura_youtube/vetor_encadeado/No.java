package vetor_encadeado;

public class No<T> {
//nó generico que aceita qualquer tipo que é definido ao isntanciar o vetor
    private T elemento; //guardamos o valor
    private No<T> proximo; //referencia o proximo dado


    public No(T elemento) {
        this.elemento = elemento;
        this.proximo = null;
    }
    public No() {
    }
    public T getElemento() {
        return elemento;
    }
    public No<T> getProximo() {
        return proximo;
    }
    public void setElemento(T elemento) {
        this.elemento = elemento;
    }
    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }
    @Override
    public String toString() {
        return "No [elemento=" + elemento + ", proximo=" + proximo + "]";
    }
    
    
}
