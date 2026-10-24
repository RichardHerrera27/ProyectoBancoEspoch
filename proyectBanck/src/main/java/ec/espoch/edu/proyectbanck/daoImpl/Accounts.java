package ec.espoch.edu.proyectbanck.daoImpl;

import ec.espoch.edu.proyectbanck.model.Account;
import java.util.Scanner;

public class Accounts {

    public boolean deposit(Account account, float value) {
        //deposit an amount of money into
        //the account, updating its balance

        float saldo = account.getBalance() + value;
        account.setBalance(saldo);
        return true;
    }

    public boolean withdraw(Account account, float value) {
        //withdraw an amount of money from the account
        //updating its balance; the amount to withdraw must not exceed the balance

        Scanner sc = new Scanner(System.in);
        float retiro = account.getBalance() - value;

        if (retiro > account.getBalance()) {
            System.out.println("Tu saldo es menor al monto que deseas retirar");
        } else {
            System.out.println("retiro completado");

        }
        account.setBalance(retiro);
        return true;
    }

    private float calculateMonthlyInterest(Account account) {

        return account.getAnualInteres() / 12;
    }

    public float monthlyStatement(Account account) {

        float monthlyInterest = calculateMonthlyInterest(account);
        float interesValue = (account.getMonthlyFec() * monthlyInterest);
        float newBalance = account.getBalance() - account.getMonthlyFec() - interesValue;
        account.setBalance(newBalance);
        return account.getBalance();
    }

    public String showDatos(Account account) {

        return "Account { " + "Balance : " + account.getBalance()
                + ", numberDeposits= " + account.getNumberDeposit()
                + ", numberWithdraw = " + account.getNumberWithdraw()
                + ", anualInteres = " + account.getAnualInteres()
                + ", monthlyFee = " + account.getMonthlyFec();
    }
}
