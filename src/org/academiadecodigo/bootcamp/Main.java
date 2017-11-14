package org.academiadecodigo.bootcamp;

public class Main {

    public static void main(String[] args) {

        Wallet wallet1 = new Wallet("mywallet", 50);
        Bank bank1 = new Bank("mybank",500);
        Client name1 = new Client("Diogo",wallet1,bank1);

        name1.withdrawlBank(34);


    }

}
