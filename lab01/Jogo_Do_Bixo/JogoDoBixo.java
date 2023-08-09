import java.util.Random;
import java.util.Arrays;
public class JogoDoBixo{
    public static void main(String[] args){
        String[] animais = {"Avestruz", "Águia","Burro","Borboleta","Cachorro","Cabra", "Carneiro","Camelo", "Cobra", "Coelho","Cavalo", "Elefante", "Galo", "Gato","Jacaré", "Leão", "Macaco","Porco", "Pavão","Peru","Touro","Tigre","Urso","Veado","Vaca"};

        int[] bilheteAposta = new int[5];
        int idx = 0;
        Random gerador = new Random();

        do{
            int num = gerador.nextInt(25)+1;
            if(verificaNum(num, bilheteAposta)){
                bilheteAposta[idx] = num;
                idx++; 
            }
        }while(idx<5);

        Arrays.sort(bilheteAposta);
        imprimeAposta(bilheteAposta, animais);
        
    }//Fim do main

    private static boolean verificaNum(int n, int[] bilheteAposta){
        boolean verifica = true;
        for(int i=0; i<bilheteAposta.length; i++){
            if(bilheteAposta[i] == n) verifica = false;
        }
        return verifica;
    }//Fim do verificaNum

    private static void imprimeAposta(int[] lista, String[] bichos){
        System.out.println("Bilhete de Aposta");
        System.out.println(Arrays.toString(lista));
        for(int i=0; i<lista.length; i++){
            System.out.printf("%d - %s\n", lista[i], bichos[lista[i]-1]);
        }
    }

}