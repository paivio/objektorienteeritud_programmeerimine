public class TestDokumendid {
    public static void main(String[] args) {

        Atraktsioon esimene = new Atraktsioon("Suurtele", 14);
        Atraktsioon teine = new Atraktsioon("Väikestele", 12);

        Dokument[] dokumendid = {new IdKaart("6061008071234"), new Õpilaspilet(2008)};

        if (esimene.vanusedSobivad(dokumendid)) {
            System.out.println(esimene + ". Kõik dokumendid on korras.");
        } else {
            System.out.println(esimene + ". Ebasobivad dokumendid on " + esimene.ebasobivadDokumendid(dokumendid));
        }

        if (teine.vanusedSobivad(dokumendid)) {
            System.out.println(teine + ". Kõik dokumendid on korras.");
        } else {
            System.out.println(teine + ". Ebasobivad dokumendid on " + teine.ebasobivadDokumendid(dokumendid));
        }


    }
}

