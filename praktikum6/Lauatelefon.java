public class Lauatelefon extends Telefon{

    private String asukoht;

    public Lauatelefon(String number, String helin, String asukoht) {
        super(number, helin);
        this.asukoht = asukoht;
    }

    @Override
    String tähtisInfo() {
        return asukoht;
    }

    @Override
    public String toString() {
        return super.toString() + " asukoht " + asukoht;
    }
}
