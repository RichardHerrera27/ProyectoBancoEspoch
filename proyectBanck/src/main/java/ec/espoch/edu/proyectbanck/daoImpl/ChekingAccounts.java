/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espoch.edu.proyectbanck.daoImpl;

import ec.espoch.edu.proyectbanck.dao.ChekingAccountsDAO;

/**
 *
 * @author HP
 */
public class ChekingAccounts extends Accounts implements ChekingAccountsDAO {

    @Override
    public float deposit(float value) {
        return 0.0f;
    }

    @Override
    public float withdraw(float value) {
        return 0.0f;
    }

    @Override
    public float monthlyStatement(float value) {
        return 0.0f;
    }

    @Override
    public String showDatos() {
        return "";
    }

}
