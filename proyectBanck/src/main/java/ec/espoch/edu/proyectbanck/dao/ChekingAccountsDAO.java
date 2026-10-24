package ec.espoch.edu.proyectbanck.dao;

import ec.espoch.edu.proyectbanck.model.CheckingAccount;

public interface ChekingAccountsDAO {

    // MANEJO DE INTERFAZ
    public float deposit(CheckingAccount checkingAccount, float value);

    public float withdraw(CheckingAccount checkingAccount, float money);

    public float monthlyStatement(CheckingAccount checkingAccountF);

    public String showDatos();
}
