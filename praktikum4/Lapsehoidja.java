// ül 8

public class Lapsehoidja {

    private int number;
    private String nimi;

    public Lapsehoidja(int number, String nimi) {
        this.number = number;
        this.nimi = nimi;
    }

    public int getNumber() {
        return number;
    }

    public String getNimi() {
        return nimi;
    }

    @Override
    public String toString() {
        return  number + " " + nimi;
    }
}
