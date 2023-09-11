public class Account{

    private int number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(int number, String holder, Double balance, Double withdrawLimit){
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount){
        this.balance += amount;
    }

    public void withdraw(Double amount){
        if(amount > this.withdrawLimit){
            throw new RuntimeException("ERRO DE SAQUE: A quantia excede o limite de saque!");
        }

        if(amount > this.balance){
            throw new RuntimeException("ERRO DE SAQUE: Saldo insuficiente!");
        }
        this.balance -= amount;
    }

    public Double getBalance(){
        return this.balance;
    }
}