package ContoBancario;

public class ContoRisparmio extends ContoBancario {
    private final double tassoInteressi=0.22;

    public  int contatoreOperazioni=0;

    public ContoRisparmio(){}

    @Override
    public double deposita(double sommaDepositata){
        super.deposita(sommaDepositata);
        contatoreOperazioni++;
        return getSaldo();
    }

    @Override
    public double preleva(double sommaPrelevata){
        super.preleva(sommaPrelevata);
        contatoreOperazioni++;
        return getSaldo();
    }

    public void applicaInteressi(){
        for(int i = 0; i < contatoreOperazioni;i++){
            double nuovoSaldo = getSaldo()+((getSaldo()*tassoInteressi)/100);
            setSaldo(nuovoSaldo);
        }
        contatoreOperazioni=0;
       
    }
}