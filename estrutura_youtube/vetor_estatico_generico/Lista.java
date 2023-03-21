
public class Lista<T> {
    
//Exercício feito através das aulas da Loiane Groner sobre Estrutura de Dados e Algoritmos
// O exercício proposto tem o objetivo de ensinar o conceito de Object e lista genérica 

    private int tamanho;
    private  T[] lista;
    
    public Lista(int capacidade) {
        //O cart é mais elegente, dessa forma transformamos o dado ao que queremos 
        this.lista = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public boolean adiciona(T elemento) {
 		aumentaCapacidade(); 
     	if (this.tamanho < this.lista.length){
			this.lista[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		} 
		return false;
    }

    // A B C D E F - 6 posições
    // 0 1 2 3 4 5 - 6 posições  
    // lista 
   	public void remove(int posicao){
		if (!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posição inválida");
		}
		for (int i = posicao; i < this.tamanho - 1; i++){
			this.lista[i] = this.lista[i+1];
		}
		this.tamanho--;
	}

    public int tamanho(){ 
		return this.tamanho;
	}
    
    	
	private void aumentaCapacidade(){
		if (this.tamanho == this.lista.length){
			T[] listaNova = (T[]) new Object[this.lista.length * 2];
			for (int i=0; i<this.lista.length; i++){
				listaNova[i] = this.lista[i];
			}
			this.lista = listaNova;
		}
	}

     public int buscaElemento(T elemento){
		for (int i=0; i<this.tamanho; i++){
			if (this.lista[i].equals(elemento)){
				return i;
			}
		}
		return -1;
	}

    	public T buscaPosicao(int posicao){
		if (!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posição inválida");
		} 
		return this.lista[posicao];
	}
    
    public void exibir() {
        System.out.println("Esses são os elementos no vetor 'Lista':");
        int count = 0;
        for(int i = 0; i <= lista.length -1; i++) {
            count++;  
            System.out.println(count+": "+lista[i]);

        }
    }
}