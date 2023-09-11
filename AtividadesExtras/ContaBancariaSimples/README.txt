Fazer um programa para ler os dados de uma conta bancária e depois 
realizar um saque nesta conta bancária, mostrando o nobo saldo.
Um saque não pode occores ou se não houver saldo na conta, ou se o
valor do saque for superior ao limite de saque da conta. Implemente a 
conta bancária conforme projeto abaixo:

MOLDE LIGADO

Account
---
- number: Integer
//Titular
- holder: String
//Saldo
- balance: Double
//Limite de saque
- withdrawLimit: Double
---
+ deposit(amount: Double): void
//Saque
+ withdraw(amount: Double): void
---
