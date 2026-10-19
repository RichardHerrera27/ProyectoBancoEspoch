/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.espoch.edu.proyectbanck.dao;

/**
 *
 * @author HP
 */
public interface SavingAccountsDAO {

    public float deposit(float value);

    public float withdraw(float value);

    public float calculateMonthlyInterest();

    public String showDatos();
}
