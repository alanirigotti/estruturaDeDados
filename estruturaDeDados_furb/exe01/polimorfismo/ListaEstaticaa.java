package exe01.polimorfismo;
// import java.util.Random;

// resolução do profe + oq eu fiz q tava certo

    // ANOTAÇÕES AULA:
    //o vetor é um tipo de estrutura de dados, podendo ser estático ou dinâmico
    // método que retira dados iguais
    // variavel polimorfisca armazena mais de 1 tipo de dado -> superclasse pessoa q deriva a subclasse professor e estudante
    // arranjo ordenado de dados do mesmo tipo, onde os dados são removidos, procurado, inserido, etc de forma manual
    //cast > alterar o tipo do dado recebido 
    //uma classe serve como parâmetro para outra > ListaEstatica<Aluno>

    public class ListaEstaticaa {
        private int[] info;
        private int tamanho;
        
        public ListaEstaticaa() {
            info = new int[10];
            this.tamanho = 0; // estabeleço que a lista está vazia
        }
    
        public static void main(String[] args) {
            
            ListaEstaticaa listaEstatica = new ListaEstaticaa();

            //int numero = (new Random()).nextInt(59)+1;

            listaEstatica.inserir(5);
            listaEstatica.inserir(10);
            listaEstatica.inserir(15);
            listaEstatica.inserir(20);

            listaEstatica.exibir(); //"5, 10, 15, 20"
            listaEstatica.getTamanho(); //4
            listaEstatica.buscar(15);
            listaEstatica.buscar(30);

            listaEstatica.retirar(10);
            listaEstatica.getTamanho();
            listaEstatica.toString();
            listaEstatica.obterElemento(3); //20
            listaEstatica.obterElemento(5);
            listaEstatica.estaVazia(); //true
        }
    
        public void redimensionar() {
    
            int[] novaLista = new int[10 + info.length];
            
                for(int i = 0; i < info.length; i++) {
                    novaLista[i] = info[i]; 
                }
                // quando chamar o vetor ifno, será chamado o novaLista, tipo uma "substituição"
                info = novaLista;
            } 
    
        public void inserir(int valor){
            if(this.tamanho == info.length) {   
                //quando houver a 11º tentativa de inserir o valor, o método redimensionar será chamado
                redimensionar();
            }
            //senão, o meu vetor info receberá o valor no espaço disponível do vetor
            info[tamanho] = valor;
            tamanho++;
        }        
    
        public void retirar(int valor) {
        // Verificar se o dado existe na lista e retorna a posicao (int)
        // se o dado n existir, ele retorna -1, logo eu n posso fazer a retirada
        int localizacao = buscar(valor);

        if(localizacao > -1) {
            //a posicao q eu quero tirar é a 3º, porém no vetor, é a 2º
            // para isso, meu for começa a partir da posicao do dado a ser retirado + 1 pq dai fica certo
            //dado 18 está na posicao 2 do vetor e 3 do tamanho 
            for (int i = localizacao + 1; i< tamanho; i++) {
                //algoritmo que move os dados p esquerda, substituindo o valor
                //só podemos retirar se der -1
                  info[i-1] = info[i];
            }
            this.tamanho--;
            }
        }
    
        //método que busca se o valor solicitado existe na lista
        public int buscar(int valor) {
            for(int i = 0; i <= tamanho; i++) {
                if(info[i] == valor) {
                    return i;
                }
            }
            // instruir ao usuario que n encontrei, pode ser substituido por uma exceção
            return -1;
        }
    
        public void liberar() {
            info = new int[10];
            tamanho = 10;
        }
    
        public int obterElemento(int posicao) {
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
            return tamanho==10;
            //if(info == null) {
            //    return true;
            //} 
            //return false;
        }
    
        public int getTamanho() {
            return tamanho;
        }
    
        @Override
        public String toString() {
    
            //StringBuilder s = new StringBuilder();
            //s.append("[");
            
            //for (int i=0; i< this.tamanho; i++){
            //    s.append(this.info[i]);
            //    s.append(", ");
            //}
            //s.append("]");
            //return s.toString();
    
        String resultado = "";
        for(int i = 0; i < tamanho; i++) {
            //se n for o primeiro elemento, adicione virgula
            if(i > 0) {
                resultado += ", ";
            }
            resultado += info[i];
        }
        return resultado;

        }
    }