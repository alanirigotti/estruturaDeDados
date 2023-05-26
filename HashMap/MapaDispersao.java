public class MapaDispersao <T> {

    private ListaEncadeada<NoMapa<T>> info[];

    public MapaDispersao() {
        info = new ListaEncadeada[10];
    }

    private int calcularHash(int chave) {
        int tamanho = info.length;
        return chave % tamanho;
    
    }

    public void inserir(int chave, T dado) {
        int indice = calcularHash(chave);
        NoMapa<T> no = new NoMapa<T>(chave, info);
        if(info[indice] == null) {
            info[indice] = new ListaEncadeada<NoMapa<T>>();
        }
        info[indice].inserir(no);
    }

}