import java.util.ArrayList;
import java.util.List;

public class Atraktsioon {

    private String atraktsiooniNimi;
    private int minNõutudVanus;


    public Atraktsioon(String atraktsiooniNimi, int minNõutudVanus) {
        this.atraktsiooniNimi = atraktsiooniNimi;
        this.minNõutudVanus = minNõutudVanus;

    }

        public boolean vanusedSobivad (Dokument[]dokumendid){
            for (Dokument dokument : dokumendid) {
                if (!dokument.vanusOnVähemalt(minNõutudVanus))
                    return false;
            }
            return true;
        }

        ArrayList<Dokument> ebasobivad = new ArrayList<>();
        public List<Dokument> ebasobivadDokumendid (Dokument[]dokumendid){
            for (Dokument dokument : dokumendid) {
                if (!dokument.vanusOnVähemalt(minNõutudVanus)) {
                    ebasobivad.add(dokument);
                }
            }
            return ebasobivad;
        }


    @Override
    public String toString() {
        return "Atraktsiooni \"" + atraktsiooniNimi + "\"" +
                " minimaalne nõutud vanus on " + minNõutudVanus;
    }

}