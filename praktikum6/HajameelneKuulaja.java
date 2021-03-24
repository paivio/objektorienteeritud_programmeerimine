import java.util.List;

public class HajameelneKuulaja extends RaadioKuulaja{

    private int loendur = 1;

    @Override
    public void kuula(String saade) {
        if (loendur % 2.0 != 0) {
            super.kuula(saade);
        }
            loendur += 1;

    }
}
