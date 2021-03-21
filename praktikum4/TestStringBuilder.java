public class TestStringBuilder {
    public static void main(String[] args) throws Exception {

        int[] arvud = { 3, 5, 7, 11 };
        StringBuilder sub = new StringBuilder(50); // küsime 50 tähemärgi jagu puhvrit
        sub.append("esimesed algarvud on ");
        for (int arv : arvud) {
            sub.append(arv);
            sub.append(' ');
        }
        String tulemus = sub.toString();
        System.out.println(tulemus);

        StringBuilder sb = new StringBuilder("esimesed algarvud on 3 5 7 11");
        int i = sb.indexOf(" ", "esimesed algarvud on ".length()); // tühik pärast “3”
        while (i != -1) {
            sb.replace(i, i + 1, ",");
            i = sb.indexOf(" ", i + 1);
        }
        System.out.println(sb); // “esimesed algarvud on 3,5,7,11”

        StringBuilder tekst = new StringBuilder("PossuMossu");
        System.out.println("Lisan lõppu " + tekst.append(1));
        System.out.println("Maht " + tekst.capacity());
        System.out.println("Pööran ümber " + tekst.reverse());


        System.out.println(Double.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        Integer intObjekt3 = Integer.valueOf("19");
        double arvdouble4 = Double.parseDouble("21");
        int arvint4 = Integer.parseInt("1CE",16);
        System.out.println(arvdouble4);
        System.out.println(arvint4);

        java.io.File fail = new java.io.File("C:/Users/Kasutaja/Downloads/marsruut.txt");
        if (fail.exists()) {
            System.out.println("Fail on juba olemas");
        } else {
            System.out.println("Faili ei ole olemas");
        }

        try (java.io.PrintWriter pw = new java.io.PrintWriter(fail, "UTF-8")) {
            pw.print("Karl Ernst von Baeri ");
            pw.println("tänav");
            pw.print("Johann Wilhelm Friedrich Hezeli ");
            pw.println("tänav");
            pw.print("Juhan Liivi ");
            pw.println("tänav");
        }

        try (java.util.Scanner sc = new java.util.Scanner(fail, "UTF-8")) {
            while (sc.hasNextLine()) {
                String rida = sc.nextLine();
                String[] tükid = rida.split(" ");
                System.out.print(tükid[tükid.length-2]+" "+tükid[tükid.length-1]);
                System.out.println();
            }
        }


    }



}
