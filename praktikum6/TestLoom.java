public class TestLoom {

    public static void main(String[] args) {

        Näriline orav = new Näriline(4, 12, "ekstrakohev", "Bob", "vanaema närvid");
        System.out.println(orav.toString());
        Kiskja lõvi = new Kiskja(4, 2, "mitte eriti", "Miisu", 120);
        System.out.println(lõvi.toString());
        Roomaja püüton = new Roomaja(false);
        System.out.println(püüton.toString());
        Roomaja rästik = new RoomajaAlamklass(true);
        System.out.println(rästik.toString());
        Loom jänes = new Imetaja(4, 8, "kohev tutike", "Juss");
        System.out.println(jänes.toString());
    }
}
