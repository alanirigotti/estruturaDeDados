//Para salvar muitas variáveis, pode ser feito um vetor que irá
// armazenar os valores em vez de criar todas as váriaveis.
public class aulaVetor {

    public static void main(String[] args) {

        // Quando há muitos números para armezenar, utiliza-se o vetor
        //double temperaturaDia001 = 23.2;
        //double temperaturaDia002 = 25.4;
        //double temperaturaDia003 = 25.0;
        //double temperaturaDia004 = 23.4;

        // boa prática é colocos os colchetes no tipo, neste caso, double[]
        double[] temperaturas = new double[365];
        temperaturas[0] = 23.2;
        temperaturas[1] = 25.4;
        temperaturas[2] = 25.0;
        temperaturas[3] = 23.4;
        temperaturas[4] = 26.7;

        System.out.println("O temperatura do dia 3 foi de: "+ temperaturas[2]);
        System.out.println("O tamanho do vetor é de: "+ temperaturas.length);
        
        for(int i = 0; i <= temperaturas.length; i++) {
        System.out.println("Valores do dia "+(i+1)+" é: "+ temperaturas[i]);
        }
    }   
       
}




