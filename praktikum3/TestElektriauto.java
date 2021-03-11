// ül 6

public class TestElektriauto {
    public static void main (String[] args) {
        Elektrijaam hind = new Elektrijaam(0.15);
        // kõik andmed, mida esimese 10 sekundiga ei leidnud, on asendatud suvaliste numbritega
        Elektriauto mia = new Elektriauto("Mia Electric", 1.0, 3, 50, hind);
        Elektriauto mini = new Elektriauto("Mini Electric 2019", 0.0, 7, 45, hind);
        Elektriauto bmw = new Elektriauto("BMW i3", 30, 4, 200, hind);
        Elektriauto tesla = new Elektriauto ("Tesla Model S", 15.5, 10, 250, hind);
        // esimese kahe auto andmed:
        System.out.println("Esimese auto andmed on " + mia);
        System.out.println("Teise auto andmed on " + mini);
        // kolmanda auto sõidukulu 100 km kohta:
        System.out.println("BMW i3-ga on sajakilomeetrise reisi hind " + bmw.maksumus100() + " eurot.");
        // nelja auto reisi maksumus 350 km kohta:
        System.out.println("350 km reis Teslaga maksab " + tesla.maksumus(350) + " eurot...");
        // eelmise rea reisile kuluv aeg:
        System.out.println("...ja selleks kulub " + Math.round(tesla.reisiKestus(350, 90)) + " tundi.");
        // laadimisaja andmete kontroll (negatiivse arvu sisestamisel aeg ei muutu, positiivse korral muutub)
        mia.setLaadimisaeg(-1);
        System.out.println(mia);
        mia.setLaadimisaeg(1);
        System.out.println(mia);
    }
}
