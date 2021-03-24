public class LotoNumbriTeataja extends Raadiosaatja{

    public void loosiJaEdasta() {
        StringBuilder võiduNumbrid = new StringBuilder();
        int i = 0;
        while (i < 10) {
            int number = (int) Math.round(Math.random()*100);
            võiduNumbrid.append(number + " ");
            i++;
        }
        String numbridSõnena = võiduNumbrid.toString();
        super.edasta(numbridSõnena);
    }


}


