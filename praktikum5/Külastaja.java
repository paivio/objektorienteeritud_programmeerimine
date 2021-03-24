public class Külastaja implements Comparable<Külastaja>{

    private String nimi;
    private int külastusteArv;

    public Külastaja(String nimi, int külastusteArv) {
        this.nimi = nimi;
        this.külastusteArv = külastusteArv;
    }

    public String getNimi() {
        return nimi;
    }

    public int getKülastusteArv() {
        return külastusteArv;
    }

    @Override
    public String toString() {
        return "Külastaja " + nimi + " on atraktsiooni kasutanud " + külastusteArv + " korda.";
    }
    public int compareTo(Külastaja võrreldav) {
        if (külastusteArv < võrreldav.külastusteArv) {
            return 1;
        } if (külastusteArv > võrreldav.külastusteArv) {
            return -1;
        } return 0;
    }
}
