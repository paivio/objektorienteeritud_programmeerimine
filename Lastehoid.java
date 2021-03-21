// ül 8
import java.util.ArrayList;
import java.util.Arrays;

public class Lastehoid {
    public static void main(String[] args) throws Exception {
        java.io.File fail = new java.io.File("lapsehoidjad.txt");

        ArrayList<Integer> numbriList = new ArrayList<Integer>();
        ArrayList<String> nimeList = new ArrayList<String>();

        try (java.util.Scanner sc = new java.util.Scanner(fail, "UTF-8")) {
            while (sc.hasNextLine()) {
                String rida = sc.nextLine();
                String[] tükid = rida.split(" ");
                int nr = Integer.parseInt(tükid[tükid.length - 6]);
                numbriList.add(nr);
                nimeList.add(tükid[tükid.length - 5]);
            }
        }

        int koht = 0;
        for (int i = 0; i < numbriList.size(); i++) {
            int valik = numbriList.get(i);
            if (valik <= 34) {
                koht = i + 1;
            }
        }
        numbriList.add(koht, 35);
        nimeList.add(koht, "Jana");

        if (numbriList.contains(46)) {
            int indeks = numbriList.indexOf(46);
            numbriList.remove(indeks);
            nimeList.remove(indeks);
        }

        for (int i = 0; i < numbriList.size(); i++) {
            System.out.print(numbriList.get(i) + " ");
            System.out.print(nimeList.get(i));
            System.out.println();
        }

    }
}

