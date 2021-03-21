// ül 2

public class SõnadeAnalüüs {
    public static void main(String[] args) {

        String lause = "Võtke sõnena kasutusele üks lause, milles on vähemalt 7 sõna";
        System.out.println("Algne lause on: \"" + lause + ".\"");
        String[] sõnad = lause.split(" ");
        for (int i = 0; i < sõnad.length; i++) {
            System.out.println("Sõna \"" + sõnad[i] + "\" pikkus on " + sõnad[i].length() + " tähemärki.");
        }
    }
}
