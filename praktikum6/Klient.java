import java.util.ArrayList;
import java.util.List;

public class Klient {

    private int isikukood;
    private double saldo;
    private List<String> tehingud = new ArrayList<>();
    private double aktsiaPortfelliVäärtus;

    public Klient(int isikukood, double saldo, double aktsiaPortfelliVäärtus) {
        this.isikukood = isikukood;
        this.saldo = saldo;
        this.aktsiaPortfelliVäärtus = aktsiaPortfelliVäärtus;
    }

    public void teostaÜlekanne(String kontole, double summa) {
        tehingud.add("ülekanne kontole " + kontole + ", summa " + summa);
        saldo -= summa;
    }

    public double arvutaTehinguTasud() {
        return 0.1 * tehingud.size();
    }

    public String toString() {
        return "klient " + isikukood + ", saldo " + saldo;
    }

    public double arvutaporfelliTasu() {
        return 0.005 * aktsiaPortfelliVäärtus;
    }

    public double getAktsiaPortfelliVäärtus() {
        return aktsiaPortfelliVäärtus;
    }
}
