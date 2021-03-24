import java.util.Arrays;

public class TestTelefon {

    public static void main(String[] args) {

        Telefon laua1 = new Lauatelefon("12345", "piiks", "Tartu");
        Telefon laua2 = new Lauatelefon("64748", "mute", "Põlva");
        Telefon laua3 = new Lauatelefon("9994447", "pirrr", "Võru");
        Telefon mob1 = new Mobiiltelefon("55555555", "iiiiiiii", "Kati", true);
        Telefon mob2 = new Mobiiltelefon("7777777", "rrrrrrrr", "Mati", false);

        Telefon[] telefonid = new Telefon[5];
        telefonid[0] = laua1;
        telefonid[1] = laua2;
        telefonid[2] = laua3;
        telefonid[3] = mob1;
        telefonid[4] = mob2;

        Arrays.sort(telefonid);

        for (Telefon elem : telefonid) {
            System.out.println(elem);
        }



    }
}
