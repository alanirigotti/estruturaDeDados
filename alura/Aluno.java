package alura;

public class Aluno {
    
    private String nome;

    public Aluno(String nome) {
        this.setNome(nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String toString() {
        return super.toString();
    }

    public boolean equals(Object obj) {
        Aluno outro = (Aluno) obj;
        return outro.getNome().equals(this.nome);
    }
}
