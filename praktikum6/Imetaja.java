public class Imetaja extends Loom{

    private int jalgadeArv;
    private int poegadeArv;
    private String sabaKohevus;
    private String nimi;

    public Imetaja(int jalgadeArv, int poegadeArv, String sabaKohevus, String nimi) {
        this.jalgadeArv = jalgadeArv;
        this.poegadeArv = poegadeArv;
        this.sabaKohevus = sabaKohevus;
        this.nimi = nimi;
    }

    @Override
    public String toString() {
        return "Imetaja, " +
                "jalgade arvuga " + jalgadeArv +
                ", poegade arvuga " + poegadeArv +
                ", sabakohevusega \"" + sabaKohevus + "\"" +
                ", nimega \"" + nimi + "\"";
    }

    public String getNimi() {
        return nimi;
    }
}
