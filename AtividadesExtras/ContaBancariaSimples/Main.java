import java.util.Locale;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        //Considera o ponto em vez de virgula
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os dados da conta: ");
        System.out.print("Número: ");
        int num = sc.nextInt();
        System.out.print("Titular: ");
        sc.nextLine();
        String titular = sc.nextLine();
        System.out.print("Saldo inicial: ");
        Double saldoInicial = sc.nextDouble();
        System.out.print("Limite de saque: ");
        Double limiteSaque = sc.nextDouble();

        Account conta = new Account(num, titular, saldoInicial, limiteSaque);

        System.out.print("\nInforme uma quantia para sacar: ");
        Double amount = sc.nextDouble();
        
        /* ISSO SERIA O TRATAMENTO DA EXCEÇÃO
        try{
            conta.withdraw(amount);
            System.out.printf("Novo saldo: %.2f\n", conta.getBalance());
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }*/

        conta.withdraw(amount);
        System.out.printf("Novo saldo: %.2f\n", conta.getBalance());

    }

}