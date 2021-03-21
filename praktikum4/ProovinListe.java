import java.util.ArrayList;
import java.util.Arrays;

public class ProovinListe {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.addAll(Arrays.asList(1, 2, 3));

        System.out.println(list1);
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + " ");
        }
        System.out.println();



    }

}
