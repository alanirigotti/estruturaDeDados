package vetor_estatico_;

// Classe que testa os métodos do vetor

public class Teste {
    
    public static void main(String[] args) {
        
    Vetor vetor = new Vetor(10);
    vetor.adiciona("Lista Estática");
    vetor.adiciona("Lista Genérica"); 
    vetor.adiciona("Lista Encadeada");
    vetor.adiciona("Lista duplamente encadeada");
    vetor.adiciona("Exercício de interpretação");
    vetor.adiciona("Exercícios e material de consulta no pen drive");

    vetor.adiciona("Exe01");
    vetor.adiciona("Exe02");
    vetor.adiciona("Exe03");
    vetor.adiciona("Exe04");

    vetor.toString();
    //vetor.buscaPosicao(2);
    vetor.exibir();
  

    }
}
  