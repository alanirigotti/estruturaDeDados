public class NoListaVetor <T> {

    private T info;
    private NoListaVetor<T> proximo;


    public NoListaVetor() {
         
    }


    public T getInfo() {
        return info;
    }


    public void setInfo(T info) {
        this.info = info;
    }


    public NoListaVetor<T> getProximo() {
        return proximo;
    }


    public void setProximo(NoListaVetor<T> proximo) {
        this.proximo = proximo;
    }

    
    
}
