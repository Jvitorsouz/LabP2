import java.util.Scanner;
import java.util.ArrayList;

public class notasTurma{
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int media = 0;
        int count = 0;
        int maior = 0;
        int menor = 0;

        ArrayList<Integer> notas = new ArrayList<Integer>();

        while (true){
            String linha = sc.nextLine();

            if(linha.equals("-")) break;

            String[] dados = linha.split(" ");

            for(int i=0; i<dados.length; i++){
                int nota = Integer.parseInt(dados[1]);
                notas.add(nota);
                if(nota>maior){
                    maior = nota;
                    menor = nota;
                } 
                else if(nota<menor){
                    menor = nota; 
                } 

                media += nota;
                count++;

            }
        }

        media /= count;

        int countacima = 0;
        int countabaixo = 0;
        for(int n: notas){
            if(n < media){
                countabaixo++;
            }else{
                countacima++;
            }
        }           

        System.out.printf("maior: %d \n", maior);
        System.out.printf("menor: %d \n", menor);
        System.out.printf("media: %d \n", media);
        System.out.printf("acima: %d \n", countacima);
        System.out.printf("abaixo: %d \n", countabaixo);


    }

}