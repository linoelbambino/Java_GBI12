import java.util.List;

public class Lager {
    // Klassenvariablen für maximale Lagerbestände
    private int maxHolzeinheiten = 100;
    private int maxSchrauben = 5000;
    private int maxFarbeinheiten = 1000;
    private int maxKartoneinheiten = 1000;
    private int maxGlaseinheiten = 100;

    // Aktuelle Lagerbestände
    private int aktuelleHolzeinheiten = 50;
    private int aktuelleSchrauben = 100;
    private int aktuelleFarbeinheiten = 25;
    private int aktuelleKartoneinheiten = 50;
    private int aktuelleGlaseinheiten = 15;

    // Instanzvariable für Lieferant
    private Lieferant lieferant;

    // Konstruktor
    public Lager() {
        this.lieferant = new Lieferant(); // Lieferant wird bei der Erstellung des Lagers initialisiert
    }

    // Methode zur Berechnung der Beschaffungszeit
    public int gibBeschaffungszeit(Bestellung bestellung) {
        // Benötigte Materialeinheiten initialisieren
        int benoetigteHolzeinheiten = 0;
        int benoetigteSchrauben = 0;
        int benoetigteFarbeinheiten = 0;
        int benoetigteKartoneinheiten = 0;
        int benoetigteGlaseinheiten = 0;

        // Durch die Liste der bestellten Produkte iterieren
        List<Produkt> produkte = bestellung.getProdukte(); // Korrektur hier
        for (Produkt produkt : produkte) {
            if (produkt instanceof Standardtuer) {
                // Standardtür Materialanforderungen
                benoetigteHolzeinheiten += 5;
                benoetigteSchrauben += 10;
                benoetigteFarbeinheiten += 2;
                benoetigteKartoneinheiten += 1;
            } else if (produkt instanceof Premiumtuer) {
                // Premiumtür Materialanforderungen
                benoetigteHolzeinheiten += 8;
                benoetigteSchrauben += 15;
                benoetigteFarbeinheiten += 3;
                benoetigteGlaseinheiten += 2;
                benoetigteKartoneinheiten += 2;
            }
        }

        // Überprüfen, ob genügend Materialien vorhanden sind
        if (benoetigteHolzeinheiten <= aktuelleHolzeinheiten &&
            benoetigteSchrauben <= aktuelleSchrauben &&
            benoetigteFarbeinheiten <= aktuelleFarbeinheiten &&
            benoetigteKartoneinheiten <= aktuelleKartoneinheiten &&
            benoetigteGlaseinheiten <= aktuelleGlaseinheiten) {
            // Genügend Material vorhanden -> 0 Tage Beschaffungszeit
            return 0;
        } else {
            // Nicht genug Material -> Bestellung beim Lieferanten notwendig -> 2 Tage Beschaffungszeit
            return 2;
        }
    }

    // Methode zum Auffüllen des Lagers durch eine Bestellung beim Lieferanten
    public void lagerAuffuellen() {
        lieferant.bestellungAufgeben(); // Bestellung beim Lieferanten aufgeben

        // Nach Erhalt der Lieferung Lager auffüllen
        aktuelleHolzeinheiten = maxHolzeinheiten;
        aktuelleSchrauben = maxSchrauben;
        aktuelleFarbeinheiten = maxFarbeinheiten;
        aktuelleKartoneinheiten = maxKartoneinheiten;
        aktuelleGlaseinheiten = maxGlaseinheiten;

        System.out.println("Lager wurde aufgefüllt.");
    }

    // Methode zur Ausgabe der aktuellen Lagerbestände
    public void lagerBestandAusgeben() {
        System.out.println("Aktueller Lagerbestand:");
        System.out.println("Holzeinheiten: " + aktuelleHolzeinheiten);
        System.out.println("Schrauben: " + aktuelleSchrauben);
        System.out.println("Farbeinheiten: " + aktuelleFarbeinheiten);
        System.out.println("Kartoneinheiten: " + aktuelleKartoneinheiten);
        System.out.println("Glaseinheiten: " + aktuelleGlaseinheiten);
    }
}
