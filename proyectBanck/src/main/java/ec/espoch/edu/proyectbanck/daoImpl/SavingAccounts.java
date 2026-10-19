package ec.espoch.edu.proyectbanck.daoImpl;

import ec.espoch.edu.proyectbanck.dao.ChekingAccountsDAO;

public class SavingAccounts extends Accounts implements ChekingAccountsDAO{

    @Override
    public float deposit(float value) {
        return 0.0f;
    }

    @Override
    public float withdraw(float value) {
        return 0.0f;
    }

    @Override
    public float calculateMonthlyInterest() {
        return 0.0f;
    }

    @Override
    public String showDatos() {
        return "";
    }

}
