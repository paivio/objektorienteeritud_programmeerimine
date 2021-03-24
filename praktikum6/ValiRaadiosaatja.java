import java.util.Locale;

public class ValiRaadiosaatja extends Raadiosaatja{

    @Override
    public void edasta(String saade) {
        super.edasta(saade.toUpperCase());
    }
}
