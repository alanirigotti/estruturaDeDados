package exe01.polimorfismo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListaEstaticaTest {

    private ListaEstaticaa lista = new ListaEstaticaa();

    @Test // caso 1
    public void testInclusaoItensLista() {
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        assertEquals("5, 10, 15, 20", lista.toString());
    }


    @Test // caso 2
    public void testarObtencaoTamanhoLista() {
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals(4, lista.getTamanho());
    }


    @Test // caso 3
    public void testarBuscarElementoExistente() {
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        assertEquals(2, lista.buscar(15));

    }

    @Test // caso 4
    public void testBuscarElementoInexistente() {
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        assertEquals(-1, lista.buscar(30));
    }

    @Test // caso 5
    public void testRetirarElemento() {
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        lista.retirar(10);

        assertEquals("5, 15, 20", lista.toString());

        assertEquals(3, lista.getTamanho());
    }


    @Test // caso 6
    public void testarRealocacao() {
        final int QTDE = 15;
        for (int i = 1; i<=QTDE; i++) {
            lista.inserir(i);
        }

        assertEquals("1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15", lista.toString());

        assertEquals(QTDE, lista.getTamanho());
    }


    @Test // caso 7
    public void testarObterElemento() {
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        int valorEncontrado = lista.obterElemento(3);

        assertEquals(20, valorEncontrado);
    }


    @Test // caso 8
    public void testarObterElementoInexistente() {
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        try {
            lista.obterElemento(5);
            fail();
        } catch (IndexOutOfBoundsException e) {
            // se recusou obterElemento(5), está correto
        }
    }


    @Test // caso 9
    public void testarLiberacao() {
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.liberar();

        assertEquals(true, lista.estaVazia());
    }

}