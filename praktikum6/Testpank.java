import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Testpank {

    public static void main(String[] args) {
        Klient klient1 = new Klient(4860707, 160.56, 0.1);
        Klient klient2 = new Klient(5937236, 2830.80, 10.34);
        Klient klient3 = new Klient(494730, 12987.34, 100.55);
        List<Klient> kliendid = new ArrayList<>(Arrays.asList(klient1, klient2, klient3));
        Kuldklient kuld1 = new Kuldklient(25398372, 120987.44, 238430, "Tiina");
        Kuldklient kuld2 = new Kuldklient(386390, 386392.66, 3836383, "Toomas");
        Kuldklient kuld3 = new Kuldklient(58436373, 739473.99, 49763, "Mari");
        List<Klient> kuldKliendid = new ArrayList<>(Arrays.asList(kuld1, kuld2, kuld3));

        klient1.teostaÜlekanne("SEB", 12.12);
        klient1.teostaÜlekanne("Swed", 7.77);
        klient2.teostaÜlekanne("LHV", 25.87);
        System.out.println(klient1.arvutaTehinguTasud());
        System.out.println(kliendid);
        kuld1.teostaÜlekanne("SEB", 1200.12);
        kuld2.teostaÜlekanne("LHV", 2500.87);
        System.out.println(kuld2.arvutaTehinguTasud());
        System.out.println(kuldKliendid);
        kuld3.setKliendiHaldur("Tiina");
        System.out.println(kuld3.getKliendiHaldur());
        System.out.println(klient3.arvutaporfelliTasu());
        System.out.println(kuld1.arvutaporfelliTasu());
        System.out.println(kuld3.arvutaporfelliTasu());
        KampaaniaKuldklient kkuld1 = new KampaaniaKuldklient(1324, 100, 3000, "Andrus");
        System.out.println(kkuld1.toString());
        System.out.println(klient3.toString());
        System.out.println(kuld3.toString());

    }


}
