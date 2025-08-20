package MissioniSpaziali;

public class MissioneCommerciale extends MissioneSpaziale {

    private String aziendaPartner;

    public MissioneCommerciale(String nomeMissione, String aziendaPartner) {
        super(nomeMissione);
        this.aziendaPartner=aziendaPartner;
    }

    @Override

    public String stampaDettagli(){
        return (super.stampaDettagli())+ ", in collaborazione con "+ aziendaPartner;
    }
    
    

}
