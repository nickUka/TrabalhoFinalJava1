package Model;

/**
 *
 * @author nilo-
 */
public class ContaCorrente extends Conta{
    private double limite;
    
    @Override
    public boolean saca(double valor){
        if((getSaldo()+this.limite) < valor)
            return false;
        return(super.saca(valor));
    }
    
    @Override
    public void remunera() {
       super.setSaldo((0.01*getSaldo()));
    }
    
}
