package ec.espoch.edu.proyectbanck;

import ec.espoch.edu.proyectbanck.dao.ChekingAccountsDAO;
import ec.espoch.edu.proyectbanck.dao.SavingAccountsDAO;
import ec.espoch.edu.proyectbanck.daoImpl.ChekingAccounts;
import ec.espoch.edu.proyectbanck.daoImpl.SavingAccounts;
import ec.espoch.edu.proyectbanck.model.CheckingAccount;
import ec.espoch.edu.proyectbanck.model.SavingAccount;

public class ProyectBanck {

    public static void main(String[] args) {

        SavingAccount savingAccount = new SavingAccount(true, 25000, 0.2f);
        SavingAccountsDAO savingAccounts = new SavingAccounts();
        savingAccounts.deposit(savingAccount, 1000);
        savingAccounts.deposit(savingAccount, 1000);
        System.out.println("Saldo actual: " + savingAccount.getBalance());

        //verificar error en el conteo de los retiros
        savingAccounts.withdraw(savingAccount, 1500);
        savingAccounts.withdraw(savingAccount, 3000);
        System.out.println("");
        savingAccounts.monthlyStatement(savingAccount);
        System.out.println("");
//        //
//
//        savingAccounts.withdraw(savingAccount, 30000);
//        System.out.println("");
//        savingAccounts.showDatos(savingAccount);
        CheckingAccount checkingAccount = new CheckingAccount(10000, 0.2f);
        ChekingAccountsDAO checkingAccounts = new ChekingAccounts();
        checkingAccounts.deposit(checkingAccount, 1000);
        checkingAccount.getBalance();

        checkingAccounts.withdraw(checkingAccount, 2000);
        checkingAccounts.withdraw(checkingAccount, 15000);
        checkingAccounts.deposit(checkingAccount, 5000);

        //
        checkingAccounts.monthlyStatement(checkingAccount);
//        System.out.println("");
//        checkingAccounts.withdraw(checkingAccount, 15000);
//        
//        //#########
//        checkingAccounts.deposit(checkingAccount, 1000);
    }
}
