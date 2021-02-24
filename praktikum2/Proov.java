// ül A3

public class Proov {

    public static void main(String[] args) {
        double nurk = 90.0;
        int a = 12;
        int b = 30;
        double c = 12.6;
        System.out.println("cos= " + Math.cos(nurk));
        System.out.println("Min: " + Math.min(a,b));
        System.out.println("Min: " + Math.min(nurk, c));
        double pii = Math.PI;
        double r = 3.0;
        double ring = Math.round(pii * Math.pow(r, 2));
        System.out.println("Ringi pindla: " + ring);
        double x = 2.0;
        double e = Math.E;
        double arv = Math.pow(e, x);
        System.out.println("e astmel x: " + arv);
        double rad = Math.toRadians(nurk);
        System.out.println("90 kraadi on " + rad + " radiaani.");
        double neg = -10.0;
        System.out.println(Math.copySign(c, neg));
    }
}
/*  See lause on lugemiskontrolliks - palun kirjutage paberile/dokumenti ennustus, kas Tänak tuleb teist korda
    maailmameistriks. ----  haha, esimesel nädalal ikka diagonaalis ei lase :) Tänaku kohta ei oska kommenteerida.

    Funktsioon, mida ma varem kasutanud ei ole, on Math.copySign(double magnitude,double sign). See Tagastab esimese
    ujukomaargumendi teise ujukomaargumendi märgiga.
		*/