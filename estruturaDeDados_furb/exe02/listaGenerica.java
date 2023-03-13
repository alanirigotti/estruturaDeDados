package exe02;

import java.lang.ProcessHandle.Info;

// variavel polimorfisca armazena mais de 1 tipo de dado -> superclasse pessoa q deriva a subclasse professor e estudante
    // arranjo ordenado de dados do mesmo tipo, onde os dados são removidos, procurado, inserido, etc de forma manual
    //cast > alterar o tipo do dado recebido 
    //uma classe serve como parâmetro para outra > ListaEstatica<Aluno>
    
public class listaGenerica <tipo> {

        private tipo[] info;
        private int tamanho;
        
        public listaGenerica(){
            info = (tipo[]) new Object[10];
            this.tamanho = 0; // estabeleço que a lista está vazia
        }
    
        public static void main(String[] args) {
            
            listaGenerica ListaGenerica = new listaGenerica();

            //int numero = (new Random()).nextInt(59)+1;

            ListaGenerica.inserir(5);
            ListaGenerica.inserir(10);
            ListaGenerica.inserir(15);
            ListaGenerica.inserir(20);

        }
    
        public void redimensionar() {
    
            tipo[] novaLista = (tipo[]) new Object[10 + info.length];
            
                for(int i = 0; i < info.length; i++) {
                    novaLista[i] = info[i]; 
                }
                // quando chamar o vetor ifno, será chamado o novaLista, tipo uma "substituição"
                info =  novaLista;
            } 
    
        public void inserir(tipo valor){
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
        public void retirar(tipo valor) {
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
            // *neste caso*, n tem problema ficar repetido o valor no vetor desde que o tamanho esteja decrementado, o valor duplicado n gasta memoria
            // 
            info[tamanho] = null;
            }
        }
    
        //método que busca se o valor solicitado existe na lista
        public int buscar(tipo valor) {
            for(int i = 0; i <= tamanho; i++) {
                if(info[i].equals(valor)) {
                    return i;
                }
            }
            // instruir ao usuario que n encontrei, pode ser substituido por uma exceção
            return -1;
        }
    
        public void liberar() {
            info = (tipo[]) new Object[10];
            tamanho = 0;
        }
    
        public tipo obterElemento(int posicao) {
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
            resultado += info[i].toString();
        }
        return resultado;

        }

        public void inverter() {

           tipo aux;

           // 3, 4, 1, 2, 8
            for(int i = 0; i <= tamanho/2; i++) {
                //var auxiliar p receber valor do vetor na ultima posição (5º)
                aux = info[tamanho - i - 1];
                // exemplo 6 - 0 - 1 = 5, ou seja, a ultima posicao do vetor info recebe oq tava no i = posicao 0 
                info[tamanho - i - 1] = info[i];
                // feito isso, agora a posicao 0 recebe oq tava no ultima pso, salva pelo aux
                info[i] = aux;
            }
            // 8, 2, 1, 3, 4

            /** SOLUÇÃO DO PROFE GILVAN JUSTINO
             *  
             * int esquerda = 0;
             * int direita = tamanho - 1;
             * 
             * tipo backup;
             * 
             * while(qtdeTroas > 0) {
             * backup = info[esquerda]
             * info[esquerda] = info[direita];
             * 
             * INCOMPLENTO AINDA!!!!
             * 
             * 
             * }
             * 
             * 
             *  */ 
            
        }
    }
