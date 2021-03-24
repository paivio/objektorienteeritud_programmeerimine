import java.util.ArrayList;
import java.util.List;

public class Raadiosaatja {

    private List<RaadioKuulaja> kuulajad = new ArrayList<>();

    public void lisaKuulaja(RaadioKuulaja kuulaja) {
        kuulajad.add(kuulaja);
    }

    public void edasta(String saade) {
        for (RaadioKuulaja kuulaja : kuulajad) {
            kuulaja.kuula(saade);
        }
    }

}
