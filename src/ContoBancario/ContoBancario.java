package ContoBancario;

import java.util.Random;

public class ContoBancario {

    private double saldo;

    private String numeroConto;

    public ContoBancario(){
        String numeroConto="";
        Random ran = new Random();
        for(int i =0;i<22;i++){
            int cifra = ran.nextInt(9);
            numeroConto+=cifra;
        }
        this.numeroConto=numeroConto;
    }

    

    

    public String getNumeroConto(){
        return numeroConto;
    }

    public double deposita(double sommaDepositata){
        if(sommaDepositata<=0){
            System.out.println("Spiacenti, la ciffra selezionata non è valida");
            return saldo;
        }else{
            return saldo = sommaDepositata+saldo;
        }
    }

    public double preleva(double sommaPrelevata){
         if(sommaPrelevata<=0){
            System.out.println("Spiacenti, la ciffra selezionata non è valida");
            return saldo;
        }else{
            if(sommaPrelevata>saldo){
                System.out.println("Spiacenti, la ciffra selezionata non è valida");
                return saldo;
            }else{
                return saldo= saldo-sommaPrelevata;
            }
        }
    }

    protected void setSaldo(double saldo){
        this.saldo=saldo;
    }

    protected double getSaldo(){
        return saldo;
    }

    public void visualizzaSaldo(){
        System.out.println("il saldo disponibile è "+ saldo);
    }
    
}






// Es 2)
// Consegna:
// Crea una classe ContoBancario con i campi privati saldo e numeroConto.
// Crea metodi pubblici deposita(), preleva(), getSaldo().
// Crea una sottoclasse ContoRisparmio che aggiunge un tasso di interesse.
// Aggiungi un metodo applicaInteressi() che aumenta il saldo.
// Testa tutto nel main e spiega perché serve l’incapsulamento.