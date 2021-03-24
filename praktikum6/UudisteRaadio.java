import java.util.ArrayList;
import java.util.List;

public class UudisteRaadio extends Raadiosaatja {

    private List<String> aktuaalsedUudised = new ArrayList<>();

    public void uuendaAktuaalsedUudised(List<String> uudised) {
        this.aktuaalsedUudised = uudised;
    }

    public void edastaUudised () {
        for (String uudis : aktuaalsedUudised) {
            super.edasta(uudis);
        }
    }
}
