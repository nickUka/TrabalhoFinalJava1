package Model;

/**
 *
 * @author nilo-
 */
public class ContaInvestimento extends Conta{
    private double depositoMin;
    private double montanteMin;

    @Override
    public boolean saca(double valor) {
       if(getSaldo() >= this.montanteMin)
           return(super.saca(valor));
       return false;
    }    
    
    @Override
    public boolean deposita(double valor) {
        if(valor >= this.depositoMin)
            return (super.deposita(valor));
        return false;
    }
    
    @Override
    public void remunera() {
       super.setSaldo((getSaldo()*0.02));
    }
    
    
}
