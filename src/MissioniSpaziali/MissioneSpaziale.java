package MissioniSpaziali;

public class MissioneSpaziale {
    private String nomeMissione;
    public final  int idMissione;
    public static int contatore = 0;
    public MissioneSpaziale(String nomeMissione){
        this.nomeMissione=nomeMissione;
        contatore++;
        int idMissione=contatore;
        this.idMissione=idMissione;
    }
   
    public String stampaDettagli(){
        return "Benvenuti nella "+ idMissione+" missione "+nomeMissione;
    }

    public static int missioniTotali(){
        return contatore;
    }
}






// Es 5)
// consegna:
// Crea una classe MissioneSpaziale con i seguenti campi:
// nomeMissione (privato)
// idMissione (final, auto-generato con un contatore statico condiviso tra tutte le missioni)
// Crea un metodo stampaDettagli() che stampa il nome e l'ID.
// Crea due sottoclassi:
// MissioneScientifica con un campo aggiuntivo obiettivo
// MissioneCommerciale con un campo aziendaPartner
// In ognuna, sovrascrivi stampaDettagli() per includere i campi specifici.
// Nel main, crea una lista di missioni miste, stampale, e mostra il numero totale delle missioni create (tramite un metodo static della classe base).
