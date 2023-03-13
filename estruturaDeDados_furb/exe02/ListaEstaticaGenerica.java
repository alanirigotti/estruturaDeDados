package exe02;

// exercicio 02 corrigido

public class ListaEstaticaGenerica<T> {
	private int tamanho;
	private T[] info;
	
	public ListaEstaticaGenerica() {
		info = (T[]) new Object[10];
		tamanho = 0;
	}
	
	public void redimencionar() {
		T[] novo = (T[]) new Object[info.length + 10];
		
		for (int i = 0; i<info.length; i++) {
			novo[i] = info[i];
		}
		
		info = novo;
		
	}
	
	public void inserir(T valor) {
		if (tamanho == info.length) {
			this.redimencionar();
		}
		info[tamanho] = valor;
		tamanho++;
	}
	
	public void exibir() {
		for (int i = 0; i<info.length; i++) {
			System.out.println(info[i]);
		}
	}
	
	public int buscar(T valor) {
		for (int i = 0; i<tamanho; i++) {
			if (info[i].equals(valor)) {
				return i;
			} 
		}
		
		return -1;
	}
	
	
	public void retirar(T valor) {
		int localizacao = buscar(valor);
		
		if (localizacao >= 0) {
			for (int i = localizacao + 1; i < tamanho; i++) {
				info[i-1] = info[i];
			}
		}
		
		tamanho--;
		info[tamanho] = null;
	}
	
	public void liberar() {
		info = (T[]) new Object[10];
		
		tamanho = 0;
	}
	
	public T obterElemento(int posicao) {
		if (posicao >= 0 && (posicao < tamanho)) {
			return info[posicao];
		} else {
			throw new IndexOutOfBoundsException();
		}
	}
	
	public boolean estaVazia() {
		if (tamanho > 0) {
			return false;
		} else {
			return true;
		}
	}
	
	public int getTamanho() {
		return info.length;
	}
	
	public String toString(){
		String resultado = "";
		
		for (int i = 0; i<tamanho; i++) {
			if (i > 0) {
				resultado += ",";
			}
			resultado += info[i].toString();
		}
		
		return resultado;
	}
	
	public void inverter() {
		
	}
	
}