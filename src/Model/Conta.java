package Model;

import Interfaces.ContaI;

/**
 *
 */
public abstract class Conta implements ContaI{

    @Override
    public boolean deposita(double valor) {
        return false;
    }

    @Override
    public boolean saca(double valor) {
        return false;
    }

    @Override
    public Cliente getDono() {     
        return null;     
    }

    @Override
    public int getNumero() {
        return 0;
    }

    @Override
    public double getSaldo() {
        return 0;
    }

    @Override
    public void remunera() {
    }
    
}
