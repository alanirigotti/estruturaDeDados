// classe responsável por manipular essa os dados da lista, a lista é do tipo genérico
public class ListaDupla <T> {

    private NoListaDupla<T> primeiro; // o primeiro é o último dado, first in last out
    private NoListaDupla<T> anterior;
    private NoListaDupla<T> proximo;
    private NoListaDupla<T> ultimo;

    //tipo inteiro: 4 bytes

    public ListaDupla() {
        // definindo a lista vazia
        // a lista de colocar o dado no inicio ou no fim
        this.primeiro = null; 
        this.anterior = null;
        this.proximo = null;
        this.ultimo = null;
    }

    public NoListaDupla<T> getPrimeiro() {
        return primeiro;
    }

    public void inserir(T info) {
        NoListaDupla<T> novo = new NoListaDupla<>();
        novo = (NoListaDupla<T>) info;
        this.proximo = novo;
    }


    public NoListaDupla<T> buscar(T info) {
// procura no nó se existe e devolve a primeira ocorrencia caso existam dados iguais 
// Se não houver dado e se o dado for o último, a estrutura de dados foi percorrida inteira
        NoListaDupla<T> atual= getPrimeiro();

        // procurando pelo nó
        while(atual!= null) {
            if(atual.getInfo().equals(info)) {
                return atual;
            } else {
                atual= atual.getProximo();
            }
        }
        //se n existir, ele apenas retorna que n existe e a lista n se altera
        return null;
    }
        //a remoção possui 2 etapas: 1- remover 2- linkar o nó anterior e o prox no prox nó 
        //método que procura se na linkedlit existe nó que guarde o valor passado no parametro
    public void retirar(T info) {
        //atualn perder as ligações do dado com o que antecede e o proximo elemento do elemento retirado, fazer com que o no anterior referencie o prox do nó a ser removido
        //acesso com anterior.proximo == atual.proximo; 
        //a retirada n mexe com a memória, movendo os itens atuallado. a alteração nos dados é feito pelas trocas referencias dos nós próximo e anterior
        NoListaDupla<T> anterior = null;
        NoListaDupla<T> atual = getPrimeiro();

        while((atual != null) && (!atual.getInfo().equals(info))) {
            anterior = atual;
            atual = atual.getProximo();
        }
        //Se achou nó, retira-o da lista
        if(atual != null) {
            if(atual == primeiro) {
                primeiro = primeiro.getProximo();
            } else {
                anterior.setProximo(atual.getProximo());
            }    
        }
    }


    public void exibir() {


    }
    public void exibirOrdemInversa() {

        NoListaDupla<T> atual = ultimo;

        while(atual != null) {
            System.out.println(atual.getInfo());
            //próximo é um nó 
            atual = atual.getProximo();
        }
    }

    public void limpar() {
        for(NoListaDupla<T> atual = this.primeiro; atual != null;) {
            NoListaDupla<T> proximo =  atual.getProximo();
            atual.setInfo(null);
            atual.setProximo(null);
            atual.setAnterior(null);
            atual = proximo; 
        }

        this.anterior = null;
        this.proximo = null;
        this.anterior = null;

    }

    //lista encadeada c mil dados: n é eficiente porque é trabalhoso
    //para ser mais economico, utilizo 
    public int obterComprimento() {

    int qtdeNos = 0; 

    NoListaDupla<T> atual = getPrimeiro();

        while(atual != null) {
            qtdeNos++;
            atual = atual.getProximo();
        }
        return qtdeNos;
    }

    public NoListaDupla<T> obterNo(int index) {
        // se o index for menor que 0 OU se o index for maior que o comprimento, então estoura uma exceção de tamanho excedido

        //if(index < 0 || index >= obterComprimento()) {
        //    throw new IndexOutOfBoundsException();
        //}

        NoListaDupla<T> atual = getPrimeiro();

        // int sequencia = 0;

                               //conta de tres até 1
        while((atual != null) && (index > 0)) {
            index--;
            atual = atual.getProximo();
        }   

      //  while((atual!= null) && (sequencia < index)) {
      //      sequencia++;
      //      atual=  atual.getProximo();


        if(atual == null) {
            throw new IndexOutOfBoundsException();
        }

        return atual;

      }

      public NoListaDupla<T> getProximo() {
        return proximo;
      }

    @Override
    public String toString() {
        return "ListaDupla [primeiro=" + primeiro + ", anterior=" + anterior + ", proximo=" + proximo + "]";
    }

      /** public String toString() {

        String resultado = "";
        NoListaDupla<T> atual= getPrimeiro();

        while(atual!= null) {
            if(atual!= getPrimeiro()) {
                resultado += "";
                
                resultado += atual.getInfo().toString();
                atual= atual.getProximo();
            }
        }
        return resultado;
      }
      */

      


}
