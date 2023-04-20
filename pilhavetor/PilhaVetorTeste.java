import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class PilhaVetorTeste {

    @Test 
    public void pilhaVazia() {
        PilhaVetor pilha = new PilhaVetor<>(0);
        assertEquals(true, pilha.estaVazia());
    }

    @Test
    public void Test2() {
        PilhaVetor pilha = new PilhaVetor<>(5);
        pilha.push(10);
        assertEquals(false, pilha.estaVazia());
    }
}
