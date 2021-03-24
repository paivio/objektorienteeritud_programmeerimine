import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Loosiratas {
    private List<Külastaja> nimekiri = new ArrayList<>();

    public void lisaKülastaja(Külastaja külastaja) {
        nimekiri.add(külastaja);
    }

    public void lisaKülastaja(String nimi, int külastusteArv) {
        Külastaja uusKülastaja = new Külastaja(nimi, külastusteArv);
        nimekiri.add(uusKülastaja);
    }
    public List<Külastaja> kõigeAktiivsemad (int n) {
        List<Külastaja> aktiivsed = new ArrayList<>();
        Collections.sort(nimekiri);
        if (nimekiri.size() <= n) {
            aktiivsed.addAll(nimekiri);
        }
        else {
            for(int i = 0; i < n; i++) {
                aktiivsed.add(nimekiri.get(i));
            }
        } return aktiivsed;
    }

    public List<Külastaja> getNimekiri() {
        return nimekiri;
    }

    public Loosiratas(List<Külastaja> nimekiri) {
        this.nimekiri = nimekiri;
    }

    public String loosiVõitja() {
        List<Külastaja> valik = kõigeAktiivsemad(3);
        int number = (int) Math.round(Math.random()*3);
        Külastaja tulemus = valik.get(number);
        String nimi = tulemus.getNimi();
        return nimi;
    }
}
