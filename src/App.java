
import MissioniSpaziali.MissioneCommerciale;
import MissioniSpaziali.MissioneScientifica;
import MissioniSpaziali.MissioneSpaziale;


public class App {
    public static void main(String[] args) throws Exception {
        
        // Veicolo ve = new Veicolo("ford", 1978);
        // ve.setAnno(2006);
        // Auto au = new Auto("Fiat", 2102, 5);
        // au.setAnno(2012);
        // ve.stampaInfo();
        // au.stampaInfo();

        // ContoBancario c1 = new ContoBancario();

        // c1.deposita(100);

       
        // c1.preleva(50);

        // c1.visualizzaSaldo();
        // ContoRisparmio cont = new ContoRisparmio();
        // cont.deposita(150);
        // cont.visualizzaSaldo();
        // cont.preleva(10);
        // cont.visualizzaSaldo();
        // cont.applicaInteressi();

    //     Utente u1 = new Utente();
    //     Utente u2 = new Utente();
    //     Utente u3 = new Utente();
    //     System.out.println("il numero untenti è "+ Utente.getNumeroUtenti());

        MissioneSpaziale msp1 = new MissioneSpaziale("Odio Marte");
        MissioneScientifica msc1 = new MissioneScientifica("depurazione", "cercare nuove energie sostenibili");
        MissioneCommerciale mc1 = new MissioneCommerciale("soldi", "Barilla");
        MissioneSpaziale msp2 = new MissioneScientifica("caos", "cercare nuove armi");
        
        System.out.println(msp1.stampaDettagli());
        System.out.println(msc1.stampaDettagli());
        System.out.println(mc1.stampaDettagli());
        System.out.println(msp2.stampaDettagli());
        System.out.println(MissioneSpaziale.contatore);
        
    }
}