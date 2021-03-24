public class Kolmnurk implements Hulknurk, Comparable<Kolmnurk> {

    private double a, b, c;

    public Kolmnurk(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double pindala() {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    public int nurkadeArv() {
        return 3;
    }
    public boolean onTäisnurkne() {
        double[] abc = {a, b, c};
        java.util.Arrays.sort(abc);
        double kaatet1 = abc[0] * abc[0];
        double kaatet2 = abc[1] * abc[1];
        double hüpotenuus = abc[2] * abc[2];
        return Math.abs(kaatet1 + kaatet2 - hüpotenuus) < 0.001; // ümardusviga
    }
    public int compareTo (Kolmnurk võrreldav){
        if (pindala() < võrreldav.pindala()) {
            return -1;
        } if (pindala() > võrreldav.pindala()) {
            return 1;
        } return 0;
    }
}
