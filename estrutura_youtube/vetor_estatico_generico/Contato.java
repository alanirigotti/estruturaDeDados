package vetor_estatico_generico;

public class Contato {  
    
    private String telefone;
    private String email;
    private String nome;

    public Contato(String telefone, String email, String nome) {
        this.telefone = telefone;
        this.email = email;
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Contato [telefone=" + telefone + ", email=" + email + ", nome=" + nome + "]";
    }

    
}
