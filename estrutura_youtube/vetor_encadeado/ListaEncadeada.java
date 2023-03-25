package vetor_encadeado;

// o parametro diamante define que o vetor é definido de acordo com o que for instanciada
public class ListaEncadeada<T> {

     private No<T> inicio;
     No<T> ultimo;
     private int tamanho; // o vetor começa com memoria 0

//Inicio => 1º dado(no)2º dado
     public void adiciona(T elemento) {
     //a celula recebe o elemento passado no parametro, o tipo do elemento é genérico
          No<T> celula = new No<T>(elemento);
          if(this.tamanho == 0) {
               this.inicio = celula; // 1
          } else {
               this.ultimo.setProximo(celula); // 1 
          } 
          this.ultimo = celula; // 1
          this.tamanho++;
     }

     public int getTamanho() {
          return this.tamanho;
     }

     @Override
     public String toString() {

     No<T> atual = this.inicio;
     
     StringBuilder sb = new StringBuilder();

     /** inicio = 1
     atual = 1
     atual.proximo = 2
     atual = 2
     */
     
     for(int i = 0; i < this.tamanho - 1; i++) {
          sb.append(atual.getElemento()).append(",");
          atual = atual.getProximo();
     }
     //sb.append(atual.getElemento()).append(", ");

     //while(atual.getProximo() != null) {
     //     sb.append(atual.getElemento()).append(", ");
     //}
     //    return sb.toString();
     
     }
}