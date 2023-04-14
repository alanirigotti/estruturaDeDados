import java.util.Arrays;

public class PilhaVetor<T> {
    
    private T[] info;
    private int limite;
    private int tamanho;

    public PilhaVetor(int limite) {
        
        info = (T[]) new Object[limite];

    }

    public void push(T info) {
        
        if(limite == tamanho) {
            throw new IllegalArgumentException("PilhaCheiaException");
        }

        this.info[limite] = info;
        tamanho++;
    }  

    public T pop(T info) {

        T backup;
        if(estaVazia()) {
            throw new IllegalArgumentException("PilhaVaziaException");
        }

        tamanho--;
        backup = peek();
        return backup;

    }

    public T peek() {
      
        // se verdadeiro,
        if(estaVazia()) {
            throw new IllegalArgumentException("PilhaVaziaException");
       }
        
       return info[tamanho-1];
       
    }

    public boolean estaVazia() {
        if(tamanho == 0) {
            return true;
        }
        return false;
    }

    public void liberar() {
      for(int i = 0; i < tamanho; i++) {
        this.info[i] = null;
      }
      this.tamanho = 0;
    }

    @Override
    public String toString() {
        return "Pilha Vetor [info=" + Arrays.toString(info) + ", limite=" + limite + ", tamanho=" + tamanho + "]";
    }

    public void concatenar(PilhaVetor<T> p ) {
      
         for(int i = 0; i < p.tamanho; i++){
            info = p[i];
         }
        }   
    }