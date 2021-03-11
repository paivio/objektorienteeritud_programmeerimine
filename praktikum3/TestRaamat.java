// ül 4

public class TestRaamat {
    public static void main(String[] args) {
        Isik luts = new Isik("Oskar Luts", 1.86, "34501012720", 88.3);
        Raamat kevade = new Raamat(luts, "Kevade");
        Raamat[] riiul = new Raamat[100];
        System.out.println(riiul[8]);
        riiul[8] = kevade;
        System.out.println(riiul[8]);



    }
}
