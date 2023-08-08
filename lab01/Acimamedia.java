import java.util.Scanner;
public class Acimamedia{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String linha = sc.nextLine();
        String[] numeros = linha.split(" ");

        int cont = 0;
        int media = 0;

        for(String num: numeros){
            media += Integer.parseInt(num);
            cont++;
        }

        media /= cont;

        for(int i=0; i<cont; i++){
            if(Integer.parseInt(numeros[i]) > media){
                System.out.printf("%s ", numeros[i]);
            }
        }
        System.out.println("");

    }
}