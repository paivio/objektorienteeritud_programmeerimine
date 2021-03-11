// ül 3

class TestIsik {
    public static void main (String[] args) {
        Isik a = new Isik("Juhan Juurikas", 1.99, "38901012720", 67.0);
        Isik b = new Isik("Madli Mallikas", 1.55, "49001012720", 49.2);
        a.setNimi("Evelin");
        a.setPikkus(-0.2);
        a.setMass(-12.2);
        Isik d = new Isik();
        Isik e = new Isik("Ülli Õpilane", 2.05, "48701012720", 78.4);
        System.out.println("Isik a on " + a);
        System.out.println(b);
        System.out.println(d);
        System.out.println(e);
        System.out.println(e.suusakepiPikkus());
        System.out.println(a.kehaMassiIndeks());
        System.out.println(e.sugu("s"));
    }
}
