public class TestArv {
    public static void main(String[] args) {
        Arv viitarv1 = new Arv();
        viitarv1.arv = 1632;
        Arv viitarv2 = new Arv();
        viitarv2 = viitarv1;
        viitarv2.arv = 1802;
        System.out.println("viitarv1.arv on: " + viitarv1.arv);
        System.out.println("viitarv2.arv on: " + viitarv2.arv);

        int[] arvud1 = {1632};
        int[] arvud2 = arvud1;
        arvud2[0] = 1802;
        System.out.println("arvud1[0] on: " + arvud1[0]);
        System.out.println("arvud2[0] on: " + arvud2[0]);
    }
}
