package ec.espoch.edu.proyectbanck.dao;

import ec.espoch.edu.proyectbanck.model.SavingAccount;

public interface SavingAccountsDAO {

    //MANEJO DE INTERFAZ
    public boolean deposit(SavingAccount savingAccount, float value);

    public float withdraw(SavingAccount savingAccount, float value);

    public float monthlyStatement(SavingAccount savingAccount);

    public String showDatos(SavingAccount savingAccount);
}
