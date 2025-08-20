package MissioniSpaziali;

public class MissioneScientifica extends MissioneSpaziale{
    public String obiettivo;

    public MissioneScientifica(String nomeMissione, String obiettivo) {
        super(nomeMissione);
        this.obiettivo=obiettivo;

    }
    
    @Override

    public String stampaDettagli(){
        return super.stampaDettagli() + " il quale obiettivo è "+ obiettivo;
    }

}
