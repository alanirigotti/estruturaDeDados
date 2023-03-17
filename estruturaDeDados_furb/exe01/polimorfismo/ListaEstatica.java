package exe01.polimorfismo;

public class ListaEstatica {

    private int[] info;
    private int tamanho;
    

    public ListaEstatica(int[] info, int tamanho) {
        info = null;
        this.tamanho = tamanho;
    }

    // Classe main para testar
    public static void main(String[] args) {
        
        ListaEstatica classeLista = new ListaEstatica(null, 0);
        classeLista.toString();
    }

    public void redimensionar() {
        if(this.tamanho == info.length) {
            int novoTamanho = 10 + this.tamanho;
            int[] novaLista = new int[novoTamanho];
        
            for(int i = 0; i < info.length; i++) {
                novaLista[i] = this.info[i]; 
            }
            this.info = novaLista;
        } 
    }

//    public int inserir(){
//        return 0;
//    }

    public void retirar(int posicao){

		if (!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posição inválida");
		}

		for (int i=posicao; i<this.tamanho-1; i++){
			this.info[i] = this.info[i+1];
		}

		this.tamanho--;
	}

    public int buscar(int elemento) {
        
        for(int i = 0; i <= tamanho; i++) {
            if(info[i] == elemento) {
                return i;
            }
        }
        return -1;
    }

    public void Liberar() {
        this.info = null;
        this.tamanho = 10;
    }

    public int obterElemento(int posicao) {
        //verifico se a posicao solicitada existe
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IndexOutOfBoundsException();
        }  

        int elemento = 0;
        // se existir, o for faz a leitura
        for(int i = 0; i <= tamanho; i++) {
        // o if compara se a posicao solicitada é igual ao do for
            if(info[i] == posicao) {
                // e retorna o elemento
                elemento = info[i];
            } 
        }
        return elemento;
    }   

    public void exibir() {

        int count = 1;

        for(int i = 0; i <= info.length; i++) {
            System.out.println(count+"º: "+i);
            count += 1;
        }    
    }

    public boolean estaVazia() {
        if(info == null) {
            return true;
        } 
        return false;
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {

		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for (int i=0; i< this.tamanho; i++){
			s.append(this.info[i]);
			s.append(", ");
		}
        s.append("]");
        return s.toString();

        // return "ListaEstatica [info=" + Arrays.toString(info)+"]";
    }
}