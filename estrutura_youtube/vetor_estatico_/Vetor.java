package vetor_estatico_;

//Exercício feito através das aulas da Loiane Groner sobre Estrutura de Dados e Algoritmos
// O exercício proposto tem o objetivo de ensinar a lógica da LISTA ESTÁTICA e revisar conceito de vetor

public class Vetor {

    private int tamanho;
    private String[] lista;
    

    public Vetor(int capacidade) {
        this.lista = new String[capacidade];
        this.tamanho = 0;
    }


    public boolean adiciona(String elemento) {
 		aumentaCapacidade(); 
     	if (this.tamanho < this.lista.length){
			this.lista[this.tamanho] = elemento;
			this.tamanho++; 
			return true;
		} 
		return false;
    }

	/**public void adiciona(String elemento){
		for (int i=0; i<this.elementos.length; i++){
			if (this.elementos[i] == null){
				this.elementos[i] = elemento;
				break;// n é bacana forçar a parada de um for, a visao fica limitada do que está acontecendo 
			}
		}
	}*/

		/*public void adiciona(String elemento) throws Exception{
		if (this.tamanho < this.elementos.length){
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		} else {
			throw new Exception("Vetor já está cheio, não é possível adicionar mais elementos");
		}
	}*/
    

    /** public boolean adiciona(String elemento, int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posição inválida");
		}
		
		this.aumentaCapacidade();
		
		//mover todos os elementos
		for (int i = this.tamanho-1; i >= posicao; i--) {
			this.lista[i+1] = this.lista[i];
		}
		this.lista[posicao] = elemento;
		this.tamanho++;
		
		return true;
    }
    */

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
			String[] listaNova = new String[this.lista.length * 2];
			for (int i=0; i<this.lista.length; i++){
				listaNova[i] = this.lista[i];
			}
			this.lista = listaNova;
		}
	}

     public int buscaElemento(String elemento){
		for (int i=0; i<this.tamanho; i++){
			if (this.lista[i].equals(elemento)){
				return i;
			}
		}
		return -1;
	}

    	public String buscaPosicao(int posicao){
		if (!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posição inválida");
		} 
		return this.lista[posicao];
	}
    
    public void exibir() {
        System.out.println("Esses são os elementos no vetor 'Lista':");
        int count = 0;
        for(int i = 0; i < lista.length; i++) {
            count++;  
            System.out.println(count+": "+lista[i]);

        }
    }
	/** @Override
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for (int i = 0; i< this.tamanho - 1; i++){
			s.append(this.lista[i]);
			s.append(", ");
		}
		
		if (this.tamanho > 0){
			s.append(this.lista[this.tamanho - 1]);
		}
		
		s.append("]");
		
		return s.toString();
	}
    */ 
}