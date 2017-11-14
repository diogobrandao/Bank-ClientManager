package org.academiadecodigo.bootcamp;

public class Bank {

    private double balance;
    private double interest;

        public Bank(String name, double balance){
            this.balance = balance;
            this.interest = interest;
        }

        public double deposit(double amount) {

            return balance = balance + amount;

        }

        public double withdrawl(double amount) {

            return balance = balance - amount;
        }

        public double addInterest(double amount) {

            return balance = balance + amount * interest;
        }

        public double checkBalance(double balance) {

            return balance;
        }
}
