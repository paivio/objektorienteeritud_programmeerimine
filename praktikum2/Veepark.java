// ül A5

import java.util.Arrays;

public class Veepark {
    public static void main (String[] args) {
        int[] väikesed = massiiv(10, 60, 100);
        int[] keskmised = massiiv(15, 101, 140);
        int[] suured = massiiv(20, 141, 200);
        for (int i = 0; i <= väikesed.length-1; i++) {
            System.out.println(väikesed[i]);
        }
        for (int i = 0; i <= keskmised.length-1; i++) {
            System.out.println(keskmised[i]);
        }
        for (int i = 0; i <= suured.length-1; i++) {
            System.out.println(suured[i]);
        }
        for (int i = 0; i <= väikesed.length-1; i++) {
            if (väikesed[i] > 80) {
                System.out.println(väikesed[i]);
            }
        }
        for (int elem: väikesed) {
            if (elem > 80) {
                System.out.println(elem);
            }
        }
        System.out.println("Väikeste laste harmooniline keskmine on: " + harmoonilineKeskmine(väikesed));
    }

    static int juhuslikArv (int alumine, int ülemine) {
        int arv = (int) Math.round(Math.random() * (ülemine - alumine) + alumine);
        return arv;
    }
    static int[] massiiv (int lasteArv, int alumine, int ülemine) {
        int[] massiiv = new int[lasteArv];
        for (int i = 0; i < lasteArv; i++) {
            massiiv[i] = juhuslikArv(alumine, ülemine);
        }
        return massiiv;
    }

    static int harmoonilineKeskmine (int[] massiiv) {
        double summa = 0.0;
        for (int i = 0; i < massiiv.length; i++) {
            summa += 1.0 / massiiv[i];
        }
        double jagatis = massiiv.length / summa;
        return (int) jagatis;
    }

    // Harmooniline keskmine: https://et.wikipedia.org/wiki/Harmooniline_keskmine
    // Kuidas leida Javas: https://ryanharrison.co.uk/2013/10/04/java-calculate-the-harmonic-mean.html
}
