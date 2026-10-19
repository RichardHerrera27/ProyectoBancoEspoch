package ec.espoch.edu.proyectbanck.dao;

public interface ChekingAccountsDAO {

    public float deposit(float value);

    public float withdraw(float value);

    public float monthlyStatement(float value);

    public String showDatos();
}
