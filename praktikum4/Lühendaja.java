// ül 7

public class Lühendaja {

    public static void main(String[] args) throws Exception{
        // annan faili:
        java.io.File fail = new java.io.File("nimed.txt");

        // loen ja väljastan perekonnanimed:
        try (java.util.Scanner sc = new java.util.Scanner(fail, "UTF-8")) {
            while (sc.hasNextLine()) {
                String rida = sc.nextLine();
                String tükid[] = rida.split(" ");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(tükid[tükid.length - 1] + " ");
                for(int i = 0; i < tükid.length - 1; i++) {
                    String nimi = tükid[i];
                    if (nimi.contains("-")) {
                        String[] kriipsuga = nimi.split("-");
                        String kriips1 = kriipsuga[kriipsuga.length - 1];
                        String kriips2 = kriipsuga[kriipsuga.length - 2];
                        String täht1 = kriips1.charAt(0) + "";
                        String täht2 = kriips2.charAt(0) + "";
                        stringBuilder.append(täht2 + "-" + täht1 + ".");

                    } else {
                        String täht = nimi.charAt(0) + "";
                        stringBuilder.append(täht + ". ");
                    }
                }
                String kokku = stringBuilder.toString();
                kokku = kokku.trim();
                System.out.println(kokku);
            }
        }
    }
}
