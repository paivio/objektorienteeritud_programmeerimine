// ül A7

import java.util.Scanner;

public class Kehamassiindeks {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sisesta oma eesnimi: ");
        String eesnimi = scanner.nextLine();

       System.out.print("Sisesta oma kehamass: ");
       String kehamass = scanner.nextLine();
       int kehamassArv = Integer.parseInt(kehamass);

       System.out.print("Sisesta oma pikkus: ");
       String pikkus = scanner.nextLine();
       double pikkusArv = Double.parseDouble(pikkus);

       double kmi = Math.round(kehamassArv / (pikkusArv * pikkusArv));
       int kmiTäisarv = (int) kmi;
       if (kmiTäisarv < 18) {
           System.out.println(eesnimi + ", sinu KMI on: " + kmiTäisarv + ". Söö rohkem.");
       } else if (kmiTäisarv < 25) {
           System.out.println(eesnimi + ", sinu KMI on: " + kmiTäisarv + ". Oled normkaalus.");
       } else {
           System.out.println(eesnimi + ", sinu KMI on: " + kmiTäisarv + ". Kasva pikemaks.");
       }
    }
}
