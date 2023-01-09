package alura;

import java.util.Arrays;

public class Array {
    
    private Aluno[] alunos = new Aluno[100];
    private int tamanho;

    //remove a posicao solicitada e arruma o vetor 
    public void remove(int posicao) {
        for(int i = 0; i < this.tamanho; i++) {
            this.alunos[i] = this.alunos[i+1];
        }
        tamanho--;
    }

    // Armazenamento sequencial verificando se há espaço no vetor 
    public void adiciona(Aluno aluno) {
        // quanto maior for o tamanho do vetor, mais lento será a leitura desse for
        for(int i = 0; i < alunos.length; i++) {
            this.alunos[tamanho] = aluno;
            this.tamanho = + 1;
        /*  if(alunos[i] == null) {
                alunos[i] = aluno;
                break;
        */ 
        }
    }

    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao <= tamanho;
    }

    //O(N) - o de n
    // metodo p adicionar uma posicao de acordo com oq o usuario quer e adicionar um elemnto neste espaço
    public void adicionaPosicao(int posicao, Aluno aluno) {
        if(!posicaoValida(posicao)) {
            throw new IllegalArgumentException("Posição inválida.");
        }
        for(int i = tamanho - 1; i >= posicao; i-=1) {
            alunos[i+1] = alunos[i];
        }

        alunos[posicao] = aluno;
        tamanho++;
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < tamanho;
    }

    public Aluno pega(int posicao) {
        if(!posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição inválida.");
        }
        return alunos[posicao];
    }
    // A execução dessa lista depende da qt de elementos
    public boolean contem(Aluno aluno) {
        for(int i = 0; i < alunos.length; i++) {
            if(aluno.equals(alunos[i])) {
                return true;
            } 
        }
        return false;
    }

    public int tamanho() {
        return tamanho;
    }

    public String toString() {
       return Arrays.toString(alunos);
    }

}