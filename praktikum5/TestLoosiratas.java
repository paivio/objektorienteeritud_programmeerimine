import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestLoosiratas {

    public static void main(String[] args) {
        Külastaja külastaja1 = new Külastaja("Mari", 10);
        Külastaja külastaja2 = new Külastaja("Kati", 5);
        Külastaja külastaja3 = new Külastaja("Toomas", 5);
        Külastaja külastaja4 = new Külastaja("Mart", 11);
        Külastaja külastaja5 = new Külastaja("Jaanika", 8);
        Külastaja külastaja6 = new Külastaja("Päivi", 21);

        List<Külastaja> nimed = new ArrayList<>();
        nimed.addAll(Arrays.asList(külastaja1, külastaja2, külastaja3, külastaja4, külastaja5));

        Loosiratas ratas = new Loosiratas(nimed);

        ratas.lisaKülastaja("Possu Kass", 15);
        ratas.lisaKülastaja(külastaja6);

        System.out.println(ratas.getNimekiri());
        System.out.println(ratas.kõigeAktiivsemad(2));
        System.out.println(ratas.loosiVõitja());






    }
}
