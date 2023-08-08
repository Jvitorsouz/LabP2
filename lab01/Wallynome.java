/**
* Laboratório de Programação 2 - Lab 1
*
* @author João Vitor da Silva Souza - 122210993
*/

import java.util.Scanner;

public class Wallynome{
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        
        String verifica = "";
        while (true){
            String ultimoNome = "";
            String linha = sc.nextLine();
            String[] lista = linha.split(" ");
            verifica = lista[0];

            if(verifica.equals("wally")) break;

            for(String nome: lista){
                int tamanho = nome.length();
                if(tamanho == 5 && !nome.equals("wally")){
                    ultimoNome = nome;
                }
            }
            if(ultimoNome.length() != 5){
                ultimoNome = "?";
            }
            
            System.out.println(ultimoNome);
        }
    }
}