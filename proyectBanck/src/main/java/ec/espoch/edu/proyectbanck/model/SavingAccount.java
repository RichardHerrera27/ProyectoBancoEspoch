package ec.espoch.edu.proyectbanck.model;

public class SavingAccount extends Account {

    protected boolean state;

    public SavingAccount(boolean state, int balance, float anualInteres) {
        super(balance, anualInteres);
        this.state = state;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "SavingAccount{" + "state=" + state + '}';
    }

}
