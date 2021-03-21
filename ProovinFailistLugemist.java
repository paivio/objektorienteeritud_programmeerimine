public class ProovinFailistLugemist {

    public static void main(String[] args) throws Exception {
        // tekitan uue tühja faili:
        java.io.File fail = new java.io.File("ProoviFail2.txt");

        // kirjutan faili sisse teksti:
        try (java.io.PrintWriter pw = new java.io.PrintWriter(fail, "UTF-8")) {
            pw.print("See on esimene rida ...");
            pw.println(" ja see vahetab rida ka.");
            pw.println("Teine rida.");
            pw.println("Ja kolmas ka.");
        }

        // loen, mis faili sisse kirja sai:
        try (java.util.Scanner sc = new java.util.Scanner (fail, "UTF-8")) {
            while (sc.hasNextLine()) {
                String rida = sc.nextLine();
                System.out.println(rida);
            }
        }

        // väljastan iga rea kaks viimas sõna:
        try (java.util.Scanner sc = new java.util.Scanner(fail, "UTF-8")) {
            while (sc.hasNextLine()) {
                String rida = sc.nextLine();
                // tühiku kohalt laiali:
                String[] tükid = rida.split(" ");
                // prindin välja kaks viimast sõna:
                System.out.println(tükid[tükid.length - 2] + " " + tükid[tükid.length - 1]);

            }
        }

        // proovin esimest tähte kätte saada:
        try (java.util.Scanner sc = new java.util.Scanner(fail, "UTF-8")) {
            int i = 0;
            while (sc.hasNextLine()) {
                String rida = sc.nextLine();
                String[] sõnad = rida.split(" ");
                String sõna = sõnad[sõnad.length - sõnad.length + i];
                String täht = sõna.charAt(0) + "";
                System.out.print(täht);
                i++;
            }
        }

    }
}
