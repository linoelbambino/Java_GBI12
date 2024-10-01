
/**
 * Write a description of class Standardtür here.
 *
 */
public class Standardtuer extends Produkt
{
    //Einheiten des Materials, welches für dieses Produkt notwendig ist
    private static int anzahlEinheitenHolz = 2;
    private static int anzahlEinheitenSchrauben = 10;
    private static int anzahlEinheitenGlas = 0;
    private static int anzahlEinheitenFarbe = 2;
    private static int anzahlEinheitenKarton = 1;
    private int produktionsZeit;

    //Konstruktor
    public Standardtuer()
    {
        //Initialisiere Standardtür
        super(anzahlEinheitenHolz, anzahlEinheitenSchrauben, anzahlEinheitenGlas, anzahlEinheitenFarbe, anzahlEinheitenKarton);
    }

    public void sampleMethod(int y)
    {
        // put your code here
        
    }
}
