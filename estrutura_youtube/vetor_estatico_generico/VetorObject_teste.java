package vetor_estatico_generico;

public class VetorObject_teste {

      public static void main(String[] args) {
        
        /**
        VetorObject vetorGenerico = new VetorObject(3);

        vetorGenerico.adiciona(3);
        vetorGenerico.adiciona(4);
        vetorGenerico.adiciona(5);

        System.out.println("Tamanho = "+ vetorGenerico.tamanho());
        vetorGenerico.exibir();
        */

        Contato c1 = new Contato("1662-2020", "null@gmail.com", "Mauro");
        Contato c2 = new Contato("1292-2020", "alu@gmail.com", "Fernanda");
        Contato c3 = new Contato("1321-2020", "numa@gmail.com", "Paula");

        VetorObject vetor = new VetorObject(3);

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

        Contato c4 = new Contato("1321-2020", "numa@gmail.com", "Paula");
        vetor.buscaElemento(c4); // retorna -1

        //vetor.remove(2);
        vetor.exibir();
        System.out.println("Tamanho: "+vetor.tamanho());
    }
}