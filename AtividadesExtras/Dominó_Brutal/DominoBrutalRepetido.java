public class DominoBrutalRepetido{

    private static final int NUM_PEÇAS_INICIAL = 12;
    private static final int REPETICOES = 50000;

    /*Como Tanto EstrategiaInvalidaException e JogadaInvalidaException são exceções extendidas da classe Exception
     * é necessario que haja um throws na assinatura da classe que irá uzar essas classes
     */
    public static void main(String[] args) throws EstrategiaInvalidaException, JogadaInvalidaException{
        float vitoriasJ1 = 0, vitoriasJ2 = 0, empates = 0;

        EstrategiaDeJogo estrategia1 = new JogaPrimeiraPossivel(), estrategia2 new JogaPrimeiraPossivel();

        for(int i=0; i<REPETICOES; i++){
            Jogo j;

            if(i<REPETICOES / 2){
                j = new Jogo("J1", estrategia1, "J2", estrategia2, NUM_PEÇAS_INICIAL);
            }else{
                 j = new Jogo("J2", estrategia2, "J1", estrategia1, NUM_PEÇAS_INICIAL);
            }

            HistoricoDeJogo historico = j.jogaJogoCompleto();
            if(historico.isEmpate()){
                empates++;
            }
        }
    } 


}