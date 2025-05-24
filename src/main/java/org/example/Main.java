package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Main está iniciando");
        BankAccount account = new BankAccount();
        History history = new History(account);

        account.receivePayment(3500);
        history.save(account);
        System.out.println("Estado da conta após primeira transferência --> " + account);

        account.pay(350);
        history.save(account);
        System.out.println("Estado da conta após segunda transferência --> " + account);

        System.out.println("Jurandir caiu no golpe desfez transferência");
        history.undoTransference(account);
        System.out.println("estado da conta após desfazer --> " + account);
    }
}