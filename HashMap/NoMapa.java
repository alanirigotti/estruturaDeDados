public class NoMapa <T> {
    
    private T chave;
    private T info;

    public NoMapa(T chave, T info) {
        this.chave = chave;
        this.info = info;
    }

    public T getChave() {
        return chave;
    }

    public void setChave(T chave) {
        this.chave = chave;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public boolean equals(Object obj) {
        NoMapa<T> no = (NoMapa<T>) obj;
        
        if(this.chave.equals(no.getChave())) {
            return true;
        }
        return false;
    }
}
