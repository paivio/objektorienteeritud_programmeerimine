// ül A4

public class SamaNimega {

    static int leiaVastus (int a, int b) {
        return a + b;
    }
    static double leiaVastus (double c) {
        return Math.round(c * c);
    }
    static void leiaVastus (String sõne, int arv) {
        for(int i = 0; i < arv; i++) {
            System.out.println(sõne);
        }
    }
    public static void main (String[] args) {
        int a = 1;
        int b = 2;
        double c = 2.0;
        String sõne = "Kõik ülesanded teen ära!";
        int arv = 5;
        System.out.println("Arvude summa on: " + leiaVastus(a, b));
        System.out.println("Arvu ruut on: " + leiaVastus(c));
        leiaVastus(sõne, arv);
    }
}
