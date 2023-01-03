public class testeVetor {
    
    public static void main(String[] args) throws IllegalAccessException {
        
        Vetor vetor = new Vetor(4);
// adicionando elementos no vetor e vendo se ele está funcionando
        vetor.adiciona("Curso do canal Loiane Groner");
        vetor.adiciona("Estrutura de Dados");
        vetor.adiciona("e Algoritmos");
        vetor.adiciona("Aprendendo a manusear um vetor");  
        vetor.adiciona("Aprendendo a manusear dados com vetor");

        System.out.println("O tamanho do vetor é: "+vetor.getTamanho());
        System.out.println(vetor.toString());
        System.out.println("Elemento da posição 2: ");
        System.out.println(vetor.busca(1));
    }
}
