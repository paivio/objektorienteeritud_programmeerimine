public class TestHulknurk {

    public static void main(String[] args) {
        Kolmnurk kolmnurk = new Kolmnurk(1, 1, 1);
        System.out.println(kolmnurk.getClass());
        Hulknurk hulknurk = new Kolmnurk(3, 4, 5);
        System.out.println(hulknurk.getClass());
        Kolmnurk kolmnurk1 = new Kolmnurk(3, 4, 5);
        System.out.println(kolmnurk1.getClass());

        System.out.println(kolmnurk.pindala());
        System.out.println(kolmnurk1.pindala());
        System.out.println(kolmnurk.compareTo(kolmnurk1));


    }
}
