public class Mobiiltelefon extends Telefon{

    private String omanikuNimi;
    private boolean pildistamisVõimalus;

    public Mobiiltelefon(String number, String helin, String omanikuNimi, boolean pildistamisVõimalus) {
        super(number, helin);
        this.omanikuNimi = omanikuNimi;
        this.pildistamisVõimalus = pildistamisVõimalus;
    }

    @Override
    String tähtisInfo() {
        return omanikuNimi;
    }

    @Override
    public String toString() {
        return super.toString() + " omanik " + omanikuNimi + " teeb pilti: " + pildistamisVõimalus;
    }
}
