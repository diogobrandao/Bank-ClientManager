package org.academiadecodigo.bootcamp;

public class Wallet {



    private double amount;
    private String name;

    public Wallet(String name, double amount) {
        this.name = name;
        this.amount = amount;

    }

    public double increase(double num){

        return amount + num;
    }

    public double decrease(double num){

        return amount + num;

    }
}
