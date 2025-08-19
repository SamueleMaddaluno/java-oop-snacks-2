
import ContoBancario.ContoRisparmio;




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
        ContoRisparmio cont = new ContoRisparmio();
        cont.deposita(150);
        cont.visualizzaSaldo();
        cont.preleva(10);
        cont.visualizzaSaldo();
        cont.applicaInteressi();
        
    }
}





// Es 3)
// Consegna:
// Crea una classe Utente con attributo nome.
// Aggiungi un attributo statico numeroUtenti che tiene il conto delle istanze create.
// In ogni costruttore, incrementa numeroUtenti.
// Crea un metodo statico getNumeroUtenti() che restituisce il totale.
// Nel main, crea 3 utenti e stampa il numero totale usando il metodo statico.
// Es 4)
// Consegna:
// Crea una classe astratta Figura con un metodo astratto calcolaArea().
// Crea sottoclassi Cerchio e Rettangolo.
// Usa una costante PI_GRECO dichiarata come public static final double PI_GRECO = 3.14.
// In Cerchio, usa PI_GRECO per calcolare l’area.
// Rendi Figura final e osserva cosa succede (errore se provi a estendere).
// Rendi un metodo final in Rettangolo e prova a sovrascriverlo (deve dare errore).
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
