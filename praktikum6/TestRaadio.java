public class TestRaadio {
    public static void main(String[] args) {

        RaadioKuulaja saade1 = new RaadioKuulaja();
        HajameelneKuulaja saade2 = new HajameelneKuulaja();
        Raadiosaatja saatja1 = new Raadiosaatja();
        LotoNumbriTeataja numbrid1 = new LotoNumbriTeataja();
        LotoNumbriTeataja numbrid2 = new LotoNumbriTeataja();
        ValiRaadiosaatja vali1 = new ValiRaadiosaatja();
        UudisteRaadio uudis1 = new UudisteRaadio();
        saade1.kuula("Uudiseid laiast maailmast");
        saade2.kuula("Kassikese seiklused");
        saade2.kuula("Teine saade");
        saade2.kuula("Kolmas saade");
        saade2.kuula("Neljas saade");
        saade1.kuula("Kohvipaus");
        saatja1.lisaKuulaja(saade1);
        saatja1.lisaKuulaja(saade2);
        numbrid1.lisaKuulaja(saade2);
        numbrid1.loosiJaEdasta();
        numbrid2.loosiJaEdasta();
        saatja1.edasta("Vaheaeg");
        vali1.lisaKuulaja(saade1);
        vali1.edasta("vali vali");
        System.out.println(saade1.meenuta());
        System.out.println(saade2.meenuta());

    }
}
