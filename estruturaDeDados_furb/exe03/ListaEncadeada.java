// não há uma estrutura de dados que seja a melhor, pois todos possuem prós e contras

package exe03;

// relacionamento 0..1:  
// classe responsável por manipular essa os dados da lista, a lista é do tipo genérico
public class ListaEncadeada <T> {

    private NoLista<T> primeiro; // o primeiro é o último dado, first in last out

    //last in first out (lifo)
    public ListaEncadeada() {
        // n tem set pq é responsa da lista de colocar o dado no inicio ou no fim
        primeiro = null;   
    }

    public NoLista<T> getPrimeiro() {
        return primeiro;
    }

    public void inserir(T info) {
        NoLista<T> novo = new NoLista<>();
        novo.setProximo(novo);
         this.primeiro = null;

        }

    public void exibir() {

        NoLista<T> p = primeiro;

        while(p != null) {
            System.out.println(p.getValor());
            //próximo é um nó 
            p = p.getProximo();
        }
    }

    public boolean estaVazia() {
        if(primeiro == null) {
            return true;
        } else {
            return false;
        }
    }

    public NoLista<T> buscar(T valor) {
// procura no nó se existe e devolve a primeira ocorrencia caso existam dados iguais 
// Se não houver dado e se o dado for o último, a estrutura de dados foi percorrida inteira
        NoLista<T> p = getPrimeiro();

        // procurando pelo nó
        while(p != null) {
            if(p.getValor().equals(valor)) {
                return p;
            } else {
                p = p.getProximo();
            }
        }
            //se n existir, ele apens retorna que n existe e a lista n se altera
            return null;
    }
        //a remoção possui 2 etapas: 1- remover 2- linkar o nó anterior e o prox no prox nó 
        //método que procura se na linkedlit existe nó que guarde o valor passado no parametro
    public void retirar(T valor) {
        //p n perder as ligações do dado com o que antecede e o proximo elemento do elemento retirado, fazer com que o no anterior referencie o prox do nó a ser removido
        //acesso com anterior.proximo == p.proximo; 
        //a retirada n mexe com a memória, movendo os itens p lado. a alteração nos dados é feito pelas trocas referencias dos nós próximo e anterior
        NoLista<T> anterior = null;
        NoLista<T> p = getPrimeiro();

        while((p != null) && (!p.getValor().equals(valor))) {
            anterior = p;
            p = p.getProximo();
        }
        //Se achou nó, retira-o da lista
        if(p != null) {
            if(p == primeiro) {
                primeiro = primeiro.getProximo();
            } else {
                anterior.setProximo(p.getProximo());
            }    
        }
    }

    //lista encadeada c mil dados: n é eficiente porque é trabalhoso
    //para ser mais economico, utilizo 
    public int obterComprimento() {

    int qtdeNos = 0;

    NoLista<T> p = getPrimeiro();

        while(p != null) {
            qtdeNos++;
            p = p.getProximo();
        }
        return qtdeNos;
    }

    public NoLista<T> obterNo(int index) {
        // se o index for menor que 0 OU se o index for maior que o comprimento, então estoura uma exceção de tamanho excedido

        //if(index < 0 || index >= obterComprimento()) {
        //    throw new IndexOutOfBoundsException();
        //}

        NoLista<T> p = getPrimeiro();

        // int sequencia = 0;

                               //conta de tres até 1
        while((p != null) && (index > 0)) {
            index--;
            p = p.getProximo();
        }   

      //  while((p != null) && (sequencia < index)) {
      //      sequencia++;
      //      p =  p.getProximo();


        if(p == null) {
            throw new IndexOutOfBoundsException();
        }

        return p;

      }

      public String toString() {

        String resultado = "";
        NoLista<T> p = getPrimeiro();

        while(p != null) {
            if(p != getPrimeiro()) {
                resultado += "";
                
                resultado += p.getValor().toString();
                p = p.getProximo();
            }
        }
        return resultado;
      }

    /**  public void exibir() {
     *  NoLista<T> p = getP
     * 
     * //enquanto n atingir final da lista
     * while(p != null) {
     * System.out.println(p.getInfo())
     * p = p.
     * }
     *
     * }
     */
}

