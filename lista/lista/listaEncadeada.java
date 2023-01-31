
public class listaEncadeada<T>{

    private No<T> inicio;
    private int tamanho;
    private No<T> ultimo;

    public void limpa() {

        for( No<T> atual = this.inicio; atual != null;) {
            No<T> proximo = atual.getProximo();
            atual.setElemento(null);
            atual.setProximo(proximo);
            atual = proximo;

        }

        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;
    }
    
    public void adiciona(T elemento) {
        No<T> celula = new No<T>(elemento);
        if(this.tamanho == 0) {
            this.inicio = celula;
        } else {
            this.ultimo.setProximo(celula);
        }
        this.ultimo = celula;
        this.tamanho += 1;
    }
    
    public No<T> getUltimo() {
        return ultimo;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        // 1, 2, 3, 4
        StringBuilder builder = new StringBuilder();

        if(this.tamanho == 0) {
            return  "[The list is null.]";
        } 
        
        No<T> atual = this.inicio;
        // jeito 2
        for(int i = 0; i < this.tamanho - 1; i++) {
            builder.append(atual.getElemento()).append(",");
            atual = atual.getProximo();
        }
        builder.append(atual.getElemento());
        
        /** Jeito 1 de imprimir minha lista
        builder.append(atual.getElemento()).append(",");
        while(atual.getProximo() != null) {
            atual = atual.getProximo();
            builder.append(atual.getElemento()).append(",");
        }
         */        
        return builder.toString();
    }    
}