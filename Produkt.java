
/**
 * Write a description of class Produkt here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Produkt
{
    // instance variables - replace the example below with your own
    private BestellZustand zustand;
    private int anzahlEinheitenHolz;
    private int anzahlEinheitenSchrauben;
    private int anzahlEinheitenFarbe;
    private int anzahlEinheitenKarton;
    private int anzahlEinheitenGlas;
    
    //Konstruktor
    public Produkt(int holz, int schrauben, int glas, int farbe, int karton)
    {
        // initialise instance variables
        anzahlEinheitenHolz = holz;
        anzahlEinheitenSchrauben = schrauben;
        anzahlEinheitenGlas = glas;
        anzahlEinheitenFarbe = farbe;
        anzahlEinheitenKarton = karton;
    }

    public void setZustand(BestellZustand bz)
    {
        // put your code here
        zustand = bz;
    }
    
    public int getAnzahlHolz(){
        return anzahlEinheitenHolz;
    }
    
    public int getAnzahlSchrauben(){
        return anzahlEinheitenSchrauben;
    }
    
    public int getAnzahlGlas(){
        return anzahlEinheitenGlas;
    }
    
    public int getAnzahlFarbe(){
        return anzahlEinheitenFarbe;
    }
    
    public int getAnzahlKarton(){
        return anzahlEinheitenKarton;
    }
}
