import java.util.ArrayList;

public class Fabrik {
    // Liste, die alle Bestellungen enthält
    private ArrayList<Bestellung> bestellungen = new ArrayList<>();

    // Konstruktor
    public Fabrik() {
        // keine speziellen Initialisierungen notwendig
    }

    // Methode zum Aufgeben einer Bestellung
    public void bestellungAufgeben(int sDoors, int pDoors) {
        // Überprüfen, ob die Anzahl der Türen gültig ist
        if (sDoors >= 0 && pDoors >= 0 && sDoors + pDoors > 0) {
            Bestellung neueBestellung = new Bestellung(sDoors, pDoors, bestellungen.size() + 1);
            bestellungen.add(neueBestellung);
            System.out.println("Bestellung wurde erfolgreich aufgegeben.");
        } else {
            System.out.println("Fehler: Die Anzahl der Türen darf nicht negativ sein und muss mindestens eine Tür umfassen.");
        }
    }

    // Methode zum Ausgeben aller Bestellungen
    public void bestellungAusgeben() {
        System.out.println("Bestellübersicht:");
        System.out.println("Bestellnummer | Standardtüren | Premiumtüren");

        // Iteriere durch die Liste der Bestellungen und gebe die Details aus
        for (Bestellung b : bestellungen) {
        // Einfache Ausgabe der Bestellinformationen
        System.out.println(b.getBestellnummer() + " | " + b.getAnzahlStandardTueren() + " | " + b.getAnzahlPremiumTueren());
        }
    }
    
    public Bestellung gibBestellung(int index) {
        return bestellungen.get(index);
    }


    // Methode zur Rückgabe der Anzahl aller Bestellungen
    public int gibAnzahlAllerBestellungen() {
        return bestellungen.size();
    }
}
