package ec.espoch.edu.proyectbanck.daoImpl;

import ec.espoch.edu.proyectbanck.dao.SavingAccountsDAO;
import ec.espoch.edu.proyectbanck.model.SavingAccount;

public class SavingAccounts extends Accounts implements SavingAccountsDAO {

    @Override
    public boolean deposit(SavingAccount savingAccount, float value) {

        //esta relacionado con la interfaz se debe implementar de forma adecuada
        boolean respuesta = false;
        if (isActive(savingAccount)) {
            System.out.println("puedes realizar un deposito: ");
            super.deposit(savingAccount, value);
        } else {
            System.out.println("Cuenta inactiva");
        }
        respuesta = super.deposit(savingAccount, value);
        savingAccount.setNumberDeposit(savingAccount.getNumberDeposit() + 1);
        System.out.println("el numero de depositos actuales es: " + savingAccount.getNumberDeposit());
        return respuesta;
    }

    @Override
    public float withdraw(SavingAccount savingAccount, float value) {
        //se puede retirar solo SI la cuenta esta activa
        // si el numero de retiros es mayor a 4.
        // en el 5 retiro se cobra un impuesto de 1000$ el cual se carga a comision mensual

        if (isActive(savingAccount) && value < savingAccount.getBalance()) {
            System.out.println("Cuenta Activa");
            System.out.println("");

            if (savingAccount.getNumberWithdraw() > 4) {
                savingAccount.setNumberWithdraw(savingAccount.getNumberWithdraw() + 1);
                savingAccount.setMonthlyFec(savingAccount.getMonthlyFec() + 1000);
                savingAccount.setBalance(savingAccount.getBalance() - value);
            } else {
                savingAccount.setBalance(savingAccount.getBalance() - value);
                savingAccount.setNumberWithdraw(savingAccount.getNumberWithdraw() + 1);
                //
                System.out.println("Retiro exitoso :" + value + " $ ");

            }

        }

        System.out.println("el numero de retiros actual es: " + savingAccount.getNumberWithdraw());
        System.out.println("saldo menor a la cantidad que deseas retirar: ");

        return 0.0f;
    }

    @Override
    public float monthlyStatement(SavingAccount savingAccount) {
        System.out.println("la cuenta se encuentra activa: " + savingAccount.isState());
        System.out.println("el balance general de la cuenta es: " + savingAccount.getBalance());
        System.out.println("el interes acumulado es: " + savingAccount.getMonthlyFec());
        System.out.println("el numero de deposito es: " + savingAccount.getNumberDeposit());
        System.out.println("el numero de retiros es: " + "-->" + savingAccount.getNumberWithdraw());

        return 0.0f;
    }

    @Override
    public String showDatos(SavingAccount savingAccount) {
        System.out.println(isActive(savingAccount));
        System.out.println(savingAccount.getBalance());
        System.out.println(savingAccount.getMonthlyFec());
        System.out.println(savingAccount.getNumberDeposit());
        System.out.println(savingAccount.getNumberWithdraw());
        return "";
    }

    private boolean isActive(SavingAccount savingAccount) {
        if (savingAccount.getBalance() < 10000) {
            savingAccount.setState(false);
        } else {
            savingAccount.setState(true);
        }
        return savingAccount.isState();
    }
}
