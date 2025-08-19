package Veicoli;

public class Auto extends Veicolo{
    private int numeroPorte;

    public Auto(String marca, int anno,int numeroPorte){
        super(marca, anno);
        this.numeroPorte=numeroPorte;
    }

    public void setNumeroPorte(int numeroPorte){
        this.numeroPorte=numeroPorte;
    }

    public int getNumeroPorte(){
        return numeroPorte;
    }

    @Override

    public void stampaInfo(){
        System.out.println("I tipo di veicolo selezionato è un'auto "+getMarca()+" di "+ getNumeroPorte()+" porte, costruita nell "+ getAnno());
    }
}
