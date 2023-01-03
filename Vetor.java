import java.util.Arrays;

public class Vetor {
  
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public boolean adiciona(String elemento) {
       if(this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        } else {
            return false;
        }
    }   

    public int getTamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        return "Vetor [elementos = "+Arrays.toString(elementos) + ", tamanho = "+getTamanho()+"]";
    }


    public String busca(int posicao) throws IllegalAccessException {
        if(!(posicao >= 0 && posicao < getTamanho())) {
            throw new IllegalAccessException("A posição solicitada não existe no vetor.");
        } 
            return elementos[posicao]; 
    }
}