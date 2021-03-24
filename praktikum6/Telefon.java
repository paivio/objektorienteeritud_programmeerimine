abstract class Telefon implements Comparable<Telefon> {

    private String number;
    private String helin;

    public Telefon(String number, String helin) {
        this.number = number;
        this.helin = helin;
    }

    public String getNumber() {
        return number;
    }

    public String getHelin() {
        return helin;
    }

    abstract String tähtisInfo();

    public String viimasedNumbrid(int n) {
        String viimased = number.substring(number.length() - n);
        return viimased;
    }

    @Override
    public String toString() {
        return "Telefon{" +
                "number='" + number + '\'' +
                ", helin='" + helin + '\'' +
                '}';
    }

    public int compareTo(Telefon o) {
        if(Integer.parseInt(viimasedNumbrid(3)) < Integer.parseInt(o.viimasedNumbrid(3))) {
            return -1;
        }
        else if (Integer.parseInt(viimasedNumbrid(3)) > Integer.parseInt(o.viimasedNumbrid(3))) {
            return 1;
        } else {
            return 0;
        }
    }
}
