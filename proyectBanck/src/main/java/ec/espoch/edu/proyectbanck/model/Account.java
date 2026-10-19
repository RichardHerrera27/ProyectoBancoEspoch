package ec.espoch.edu.proyectbanck.model;

public class Account {

    protected int balance;
    protected int numberDeposit = 0;
    protected int numberWithdraw = 0;
    protected float anualInteres;
    protected float monthlyFec = 0.0f;

    public Account() {
    }

    public Account(int balance, float anualInteres) {
        this.balance = balance;
        this.anualInteres = anualInteres;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getNumberDeposit() {
        return numberDeposit;
    }

    public void setNumberDeposit(int numberDeposit) {
        this.numberDeposit = numberDeposit;
    }

    public int getNumberWithdraw() {
        return numberWithdraw;
    }

    public void setNumberWithdraw(int numberWithdraw) {
        this.numberWithdraw = numberWithdraw;
    }

    public float getAnualInteres() {
        return anualInteres;
    }

    public void setAnualInteres(float anualInteres) {
        this.anualInteres = anualInteres;
    }

    public float getMonthlyFec() {
        return monthlyFec;
    }

    public void setMonthlyFec(float monthlyFec) {
        this.monthlyFec = monthlyFec;
    }

    @Override
    public String toString() {
        return "Account{" + "balance=" + balance + ", numberDeposit=" + numberDeposit + ", numberWithdraw=" + numberWithdraw + ", anualInteres=" + anualInteres + ", monthlyFec=" + monthlyFec + '}';
    }

}
