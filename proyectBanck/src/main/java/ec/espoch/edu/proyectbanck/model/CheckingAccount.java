package ec.espoch.edu.proyectbanck.model;

public class CheckingAccount extends Account {

    protected float overdraft = 0.0f; //sobregiro

    public CheckingAccount(int balance, float anualInteres) {
        super(balance, anualInteres);
    }

    public float getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(float overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" + "overdraft=" + overdraft + '}';
    }
    
    

}
