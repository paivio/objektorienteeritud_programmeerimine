public class Kiskja extends Imetaja{

    private double kaal;

    public Kiskja(int jalgadeArv, int poegadeArv, String sabaKohevus, String nimi, double kaal) {
        super(jalgadeArv, poegadeArv, sabaKohevus, nimi);
        this.kaal = kaal;
    }

    @Override
    public String toString() {
        return  super.getNimi() + " kaalub " + kaal + " kg.";
    }
}
