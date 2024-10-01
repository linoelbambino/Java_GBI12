
/**
 * Write a description of class Testklasse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestFabrik
{
    // instance variables - replace the example below with your own

    //Konstruktor
    public TestFabrik()
    {
        // Initialisiere TestFabrik
        Fabrik testfabrik = new Fabrik();
        testfabrik.bestellungAufgeben(-3,2);
        testfabrik.bestellungAufgeben(0,0);
        testfabrik.bestellungAufgeben(25,2);
        testfabrik.bestellungAufgeben(3,267);
        testfabrik.bestellungAufgeben(43,342);
        testfabrik.bestellungAusgeben();
    }
    
    public void sampleMethod(int y)
    {
        //
    }
}
