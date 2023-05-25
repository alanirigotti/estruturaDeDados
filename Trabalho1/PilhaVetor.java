import java.util.Arrays;

public class PilhaVetor<T> {
    
    private T[] info;
    private int limite;
    private int tamanho;

    public PilhaVetor(int limite) {
        
        info =  (T[]) new Object[limite];
        this.limite = limite;
        this.tamanho = 0;

    }

    public void push(T info)  {
        
        if(limite == tamanho) {
            throw new IllegalArgumentException();
        }

        this.info[limite] = info;
        tamanho++;
    }  

    public T pop(T info) {

        if(estaVazia()) {
            throw new IllegalArgumentException("PilhaVaziaException");
        }

        T aux;
        //info.pop();
        aux = this.info[tamanho - 1];
        tamanho--;
        return aux;
       }

    public T peek() {
      
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
        String resultado = " ";

        for(int i = tamanho - 1; i >= 0; i--) {
            resultado += info[i].toString();
            if(i > 0) { //evita colocar virgula no ultimo dado da pilha 
                resultado = resultado + ",";
            }
        }
    return resultado;
    }

    public void concatenar(PilhaVetor<T> p2) {
    
        for(int i = 0; i < p2.tamanho; i++) {
            this.push(p2.info[i]);
        }
    } 
    }