import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class leitura {

    public void main(String[] args) throws IOException {
        
        File html = new File("arquivo.html");
        FileInputStream input = new FileInputStream(html);
        InputStreamReader reader = new InputStreamReader(input);
          
        BufferedReader br = new BufferedReader(reader);
        String linha = br.readLine();
                
          
        if(!html.exists()) {
            throw new IllegalArgumentException("Arquivo não encontrado");
        }

        //fazer metodo redimensionar
        String tag = "<html><head><title></title></head><body></body></html>";
        PilhaVetor pilha = new PilhaVetor(10);
        while(linha != null) {

        if(tag.startsWith("<") && tag.endsWith(">")) {
            for (int i = 0; i < args.length; i++) {
                if(posicao2.equals) {

                }
            }
        pilha.push(tag);
    } else {
        System.out.println("Formatação incorreta.");
        if(!pilha.estaVazia()) {
            String tagAberta = pilha.pop();
            if(!tagAberta.equals(tag)) {
                System.out.println("Tag inválida");
            }
        }
    }
    br.close();
}
    }
}
