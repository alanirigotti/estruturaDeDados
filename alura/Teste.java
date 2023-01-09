package alura;

public class Teste {
    
    public static void main(String[] args) {
                
    Array lista = new Array();

    Aluno a1 = new Aluno("Maria");
    Aluno a2 = new Aluno("Alani");
    Aluno a4 = new Aluno("Giliardi");
    Aluno a5 = new Aluno("Maria");  
    Aluno a6 = new Aluno("Alice");

    lista.adiciona(a1);
    lista.adiciona(a2);
    lista.adiciona(a4);
    lista.adiciona(a5);
    lista.adiciona(a6);

    System.out.println(lista);
    System.out.println(lista.contem(a1));
    System.out.println(lista.tamanho());
    lista.adicionaPosicao(0, a6);
        System.out.println(lista);
    }
}
