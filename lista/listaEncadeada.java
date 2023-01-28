
public class listaEncadeada<T>{

    private No<T> inicio;
    
    public void adiciona(T elemento) {
        No<T> celula = new No<T>(elemento);
        this.inicio = celula;
    }

    @Override
    public String toString() {
        return "listaEncadeada [inicio=" + inicio + "]";
    }

    
}