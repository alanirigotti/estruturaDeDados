package vetor_encadeado;

public class ListaEncadeadaTeste {
    
    public static void main(String[] args) {
        
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.adiciona(1); //inicio
        lista.adiciona(2); //proximo
        lista.adiciona(3); //ultimo 

        System.out.println("Tamanho: "+lista.getTamanho());
        lista.toString();
    }
}
