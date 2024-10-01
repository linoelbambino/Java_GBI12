
/**
 * Write a description of class Premiumtür here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Premiumtuer extends Produkt
{
    //Einheiten des Materials, welches für dieses Produkt notwendig ist
    private static int anzahlEinheitenHolz = 4;
    private static int anzahlEinheitenSchrauben = 5;
    private static int anzahlEinheitenGlas = 5;
    private static int anzahlEinheitenFarbe = 1;
    private static int anzahlEinheitenKarton = 5;
    private int produktionsZeit;

    //Konstruktor
    public Premiumtuer()
    {
        //Initialisiere Premiumtür
        super(anzahlEinheitenHolz, anzahlEinheitenSchrauben, anzahlEinheitenGlas, anzahlEinheitenFarbe, anzahlEinheitenKarton);
    }

    public void sampleMethod(int y)
    {
        // put your code here
        
    }
}
