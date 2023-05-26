public class ListaEncadeada <T> {

        private T[] info;
        private int tamanho;
        
        public ListaEncadeada(){
            info = (T[]) new Object[10];
            this.tamanho = 0; // estabeleço que a lista está vazia
        }
    
        public void redimensionar() {
    
            T[] novaLista = (T[]) new Object[10 + info.length];
            
                for(int i = 0; i < info.length; i++) {
                    novaLista[i] = info[i]; 
                }
                // quando chamar o vetor ifno, será chamado o novaLista, tipo uma "substituição"
                info =  novaLista;
            } 
    
        public void inserir(T valor){
            if(this.tamanho == info.length) {   
                //quando houver a 11º tentativa de inserir o valor, o método redimensionar será chamado
                redimensionar();
            }
            //senão, o meu vetor info receberá o valor no espaço disponível do vetor
            info[tamanho] = valor;
            tamanho++;

            //inserir no idex 0 e o comportamento do inserir seja mover todos os itens pra direita
        }        
    

        // 0, 1, 3, 4, 5 tamanho 4
        public void retirar(T valor) {

            int localizacao = buscar(valor);

                if(localizacao > -1) {
                    for (int i = localizacao + 1; i< tamanho; i++) {
                    info[i-1] = info[i];
                    }
                this.tamanho--;
                // *neste caso*, n tem problema ficar repetido o valor no vetor desde que o tamanho esteja decrementado, o valor duplicado n gasta memoria
                // 
                info[tamanho] = null;
                }
        }
    
        //método que busca se o valor solicitado existe na lista
        public int buscar(T valor) {
            for(int i = 0; i <= tamanho; i++) {
                if(info[i].equals(valor)) {
                    return i;
                }
            }
            // instruir ao usuario que n encontrei, pode ser substituido por uma exceção
            return -1;
        }
    
        public void liberar() {
            info = (T[]) new Object[10];
            tamanho = 0;
        }
    
        public T obterElemento(int posicao) {
            //verifico se a posicao solicitada existe
            if (posicao >= 0 && posicao < tamanho) {
                return info[posicao];
            } else { //se nao, lanço exceção
                throw new IndexOutOfBoundsException();
            }
        }   
    
        public void exibir() {
            for(int i = 0; i <= tamanho; i++) {
                System.out.println(info[i]);
            }    
        }
    
        public boolean estaVazia() {
            if(tamanho == 0) {
                return true;
            }
         return false;

        }
    
        public int getTamanho() {
            return tamanho;
        }
    
        @Override
        public String toString() {
    
          
        String resultado = "";
        for(int i = 0; i < tamanho; i++) {
            //se n for o primeiro elemento, adicione virgula
            if(i > 0) {
                resultado += ", ";
            }
            resultado += info[i].toString();
        }
        return resultado;

        }

        public void inverter() {

            T aux;

            for(int i = 0; i <= tamanho/2; i++) {
                aux = info[tamanho - i - 1];
                // exemplo 6 - 0 - 1 = 5, ou seja, a ultima posicao do vetor info recebe oq tava no i = posicao 0 
                info[tamanho - i - 1] = info[i];
                info[i] = aux;
            }

        }
    }

