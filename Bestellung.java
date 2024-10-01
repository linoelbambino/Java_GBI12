import java.util.ArrayList;
import java.util.List;

public class Bestellung {
    // Liste aller bestellten Produkte
    private List<Produkt> bestellteProdukte = new ArrayList<>();
    
    // Bestellung bestätigt? False = Nein; True = Ja;
    private boolean bestellbestaetigung = false;
    
    // Beschaffungszeit (in Tagen)
    private int beschaffungszeit = -1;
    
    // Bestellnummer als fortlaufender Integer
    private int bestellnummer;
    
    // Anzahl bestellter Standard- und Premiumtüren
    private int anzahlStandardTueren;
    private int anzahlPremiumTueren;
    
    // Konstruktor
    public Bestellung(int anzahlStandardTueren, int anzahlPremiumTueren, int bestellnummer) {
        this.anzahlStandardTueren = anzahlStandardTueren;
        this.anzahlPremiumTueren = anzahlPremiumTueren;
        this.bestellnummer = bestellnummer;
        
        // Füge Standardtüren zur Produktliste hinzu
        for (int i = 0; i < anzahlStandardTueren; i++) {
            bestellteProdukte.add(new Standardtuer());
        }
        
        // Füge Premiumtüren zur Produktliste hinzu
        for (int i = 0; i < anzahlPremiumTueren; i++) {
            bestellteProdukte.add(new Premiumtuer());
        }
    }

    // Methode zur Rückgabe der Produktliste
    public List<Produkt> getProdukte() {
        return bestellteProdukte;
    }

    // Bestellung bestätigen
    public void bestellungBestaetigen() {
        bestellbestaetigung = true;
    }

    // Beschaffungszeit setzen
    public void setBeschaffungsZeit(int beschaffungszeit) {
        if (beschaffungszeit >= 0) {
            this.beschaffungszeit = beschaffungszeit;
            System.out.println("Beschaffungszeit für Bestellung Nr. " + bestellnummer + " wurde auf " + beschaffungszeit + " Tage gesetzt.");
        } else {
            System.out.println("Beschaffungszeit muss positiv oder 0 sein.");
        }
    }

    // Bestellung bestätigen Status
    public boolean istBestellungBestaetigt() {
        return bestellbestaetigung;
    }

    // Beschaffungszeit zurückgeben
    public int getBeschaffungszeit() {
        return beschaffungszeit;
    }

    // Bestellnummer zurückgeben
    public int getBestellnummer() {
        return bestellnummer;
    }

    // Anzahl der Standardtüren zurückgeben
    public int getAnzahlStandardTueren() {
        return anzahlStandardTueren;
    }

    // Anzahl der Premiumtüren zurückgeben
    public int getAnzahlPremiumTueren() {
        return anzahlPremiumTueren;
    }
}
