package exe03;

//classe que guarda o dado, antes era no vetor (lista estática)
// classe parametrizada, sempre que usar a classe utilize um valor de parâmetro
public class NoLista <T> {

    private T valor;
    //relacionamento reflexivo, ele começa e termina na própria classe. 
    private  NoLista<T> proximo; 

    public NoLista() {
    
    }
    
    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public NoLista<T> getProximo() {
        return proximo;
    }

    //se tirar o T, a lista guarda mais de 1 tipo de dado  
    public void setProximo(NoLista<T> proximo) {
        this.proximo = proximo;
        
    }


    
}
