public class Kuldklient extends Klient{

    private String kliendiHaldur;

    public Kuldklient(int isikukood, double saldo, double aktsiaPortfelliVäärtus, String kliendiHaldur) {
        super(isikukood, saldo, aktsiaPortfelliVäärtus); // Klient konstruktori käivitamine
        this.kliendiHaldur = kliendiHaldur;
    }

    public String getKliendiHaldur() {
        return kliendiHaldur;
    }

    public void setKliendiHaldur(String kliendiHaldur) {
        this.kliendiHaldur = kliendiHaldur;
    }

    @Override
    public double arvutaTehinguTasud() {
        return 10.0;
    }

    @Override
    public double arvutaporfelliTasu() {
        if (getAktsiaPortfelliVäärtus() < 50000) {
            return 0;
        }
        return super.arvutaporfelliTasu();
    }
    // class Kuldklient
    public double säästetudTehinguTasud() {
        // käivitab Kuldklient klassis oleva meetodi
        double soodusTasud = arvutaTehinguTasud();
        // käivitab Klient klassis oleva meetodi
        double tavakliendiTasud = super.arvutaTehinguTasud();
        return tavakliendiTasud - soodusTasud;
    }

    @Override
    public String toString() {
        return super.toString() + ", kliendihaldur " + kliendiHaldur;
    }
}
