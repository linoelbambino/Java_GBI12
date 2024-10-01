public class Lieferant {
    
    // Methode, um eine Bestellung vom Lager anzunehmen
    public void bestellungAufgeben() {
        // Hier wird eine Meldung ausgegeben, dass eine Bestellung beim Lieferanten eingegangen ist.
        System.out.println("Eine Bestellung beim Lieferanten wurde aufgegeben. Materialien werden beschafft.");
        
        // Simuliere die Beschaffung der Materialien durch eine Pause
        try {
            Thread.sleep(2000); // 2 Sekunden warten, um die Materialbeschaffung zu simulieren
        } catch (InterruptedException e) {
            System.out.println("Fehler beim Warten auf die Materiallieferung.");
        }
        
        // Ausgabe, dass die Bestellung abgeschlossen ist
        System.out.println("Materialien wurden erfolgreich vom Lieferanten beschafft.");
    }
}
