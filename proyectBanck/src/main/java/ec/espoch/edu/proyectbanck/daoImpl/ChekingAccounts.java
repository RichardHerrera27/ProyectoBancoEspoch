package ec.espoch.edu.proyectbanck.daoImpl;

import ec.espoch.edu.proyectbanck.dao.ChekingAccountsDAO;
import ec.espoch.edu.proyectbanck.model.CheckingAccount;

public class ChekingAccounts extends Accounts implements ChekingAccountsDAO {

    @Override
    //deposito
    public float deposit(CheckingAccount checkingAccount, float value) {
        checkingAccount.getBalance();

        checkingAccount.setBalance(checkingAccount.getBalance() + value);
        System.out.println("su saldo es: " + checkingAccount.getBalance());

        //
        if (checkingAccount.getOverdraft() > 0) {
            System.out.println("Tienes un sobregiro por un valor de: " + checkingAccount.getOverdraft());

            checkingAccount.setOverdraft(checkingAccount.getOverdraft() - value);
            System.out.println("el valor descontado es: " + value);
            System.out.println("saldo pendiente por sobregiros: " + checkingAccount.getOverdraft());
        }
        checkingAccount.setNumberDeposit(checkingAccount.getNumberDeposit() + 1);
        System.out.println("el numero de depositos realizados es:  " + checkingAccount.getNumberDeposit());
        return 0.0f;
    }

    @Override
    //retiro
    public float withdraw(CheckingAccount checkingAccount, float money) {
        //se puede retirar mas dinero del que se tiene 
        // tenemos el atributo sobregiro -> overdraft

        float saldo = checkingAccount.getBalance();

        if (checkingAccount.getBalance() < money) {
            float sobregiro = money - saldo;
            checkingAccount.setOverdraft(sobregiro);

            System.out.println("el valor por sobregiro es: " + checkingAccount.getOverdraft());
        } else {
            checkingAccount.setBalance(saldo - money);
            System.out.println("retiro exitoso por el valor de: " + money);
        }

        checkingAccount.setBalance(saldo - money);
        checkingAccount.setNumberWithdraw(checkingAccount.getNumberWithdraw() + 1);
        System.out.println("el numero de retiros es: " + checkingAccount.getNumberWithdraw());
        return money;
    }

    @Override
    //estado de cuenta mensual
    public float monthlyStatement(CheckingAccount checkingAccount) {
        System.out.println("el balance de la cuenta es: " + checkingAccount.getBalance());
        System.out.println("el interes mensual generado es: " + checkingAccount.getMonthlyFec());
        System.out.println("");
        System.out.println("depositos realizados: " + checkingAccount.getNumberDeposit());
        System.out.println("retiros realizados: " + checkingAccount.getNumberWithdraw());
        System.out.println("");
        System.out.println("el total en sobregiros es:" + checkingAccount.getOverdraft());
        return 0.0f;
    }

    @Override
    public String showDatos() {
        return "";
    }

}
