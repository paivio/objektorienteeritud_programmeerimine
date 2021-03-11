// ül 4

public class Raamat {
    private Isik autor;
    private String pealkiri;

    public String toString() {
        return autor + ", " + pealkiri;
    }

    public Raamat(Isik autor, String pealkiri) {
        this.autor = autor;
        this.pealkiri= pealkiri;
    }

}
