public class Näriline extends Imetaja{

    private String lemmikToit;

    public Näriline(int jalgadeArv, int poegadeArv, String sabaKohevus, String nimi, String lemmikToit) {
        super(jalgadeArv, poegadeArv, sabaKohevus, nimi);
        this.lemmikToit = lemmikToit;
    }

    @Override
    public String toString() {
        return super.toString() + ", on näriline, kelle lemmiktoit on " + lemmikToit + ".";
    }
}
