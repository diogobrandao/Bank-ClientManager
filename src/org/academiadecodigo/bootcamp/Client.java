package org.academiadecodigo.bootcamp;

public class Client {

    private String name;
    private Wallet wallet;
    private Bank bank;

    public Client(String name, Wallet wallet, Bank bank){
        this.name = name;
        this.wallet = wallet;
        this.bank = bank;

    }

    public void depositBank(int numb) {
        wallet.decrease(numb);
        bank.deposit(numb);
            System.out.println("you made a deposit");
             System.out.println("you're wallet is lighter");
    }

    public void withdrawlBank(int numb) {
        wallet.increase(numb);
        bank.withdrawl(numb);
        System.out.println("take that money out of that bank fool!");
        System.out.println("feel that wallet getting heavier");
    }

    public String getName() {
        return this.name;

    }


}
