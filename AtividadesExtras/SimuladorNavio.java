public class SimuladorNavio{
    
    public static void main(String[] args){


        //Criando objetos
        Navio navio1 = new Navio("AB1", 10, 5);
        Navio navio2 = new Navio("DE2", 20, 10);

        navio1.ataca(navio2);

        System.out.println(navio1.getVida());
        System.out.println(navio2.getVida());

    }
}