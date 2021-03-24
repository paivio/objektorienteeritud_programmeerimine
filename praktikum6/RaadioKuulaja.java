import java.util.ArrayList;
import java.util.List;

public class RaadioKuulaja {

    private List<String> meelesSaated = new ArrayList<>();

    public void kuula(String saade) {
        meelesSaated.add(saade);
    }

    public List<String> meenuta() {
        return meelesSaated;
    }

    public List<String> getMeelesSaated() {
        return meelesSaated;
    }
}
