// ül 3

class Isik {
    private String nimi;
    private double pikkus;
    private String isikukood;
    private double mass;

    public String toString() {
        return "(" + nimi + "; " + pikkus + "; " + mass + " kg; IK: " + isikukood + ")";
    }

    public Isik(String IsikuNimi, double IsikuPikkus, String IsikuIsikukood, double IsikuMass) {
        this.nimi = IsikuNimi;
        this.pikkus = IsikuPikkus;
        this.isikukood = IsikuIsikukood;
        this.mass = IsikuMass;

    }
    public Isik(){
        this("Nimetu", 0.0, "Ei tea", 0.0);
        //nimi = "Nimetu";
        //pikkus = 0.0;
    }
    public int suusakepiPikkus () {
        return (int) Math.round(0.85 * pikkus * 100);
    }
    public double kehaMassiIndeks () {
        return Math.round(mass/(pikkus*pikkus));
    }
    public String sugu (String isikuSugu) {
        if (isikuSugu == "M" || isikuSugu == "m") {
            return "Mees";
        } else if (isikuSugu == "N" || isikuSugu == "n") {
            return "Naine";
        } else {
            return "Apachi helikopter";
        }
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public double getPikkus() {
        return pikkus;
    }

    public void setPikkus(double pikkus) {
        if (pikkus > 0.0) {
            this.pikkus = pikkus;
        }
    }
    public String getIsikukood() {
        return isikukood;
    }

    private void setIsikukood(String isikukood) {
        this.isikukood = isikukood;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        if (mass > 0.0) {
            this.mass = mass;
        }
    }
}

