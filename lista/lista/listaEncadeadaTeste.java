public class listaEncadeadaTeste {
    
    public static void main(String[] args) {
        
        listaEncadeada<Integer> lista = new listaEncadeada<>();
        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);

        System.out.println("Tamanho = "+ lista.getTamanho());
        System.out.println(lista);

        lista.limpa();
        System.out.println(lista);
    }
}
