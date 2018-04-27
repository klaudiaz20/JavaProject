package JavaProject;
import java.util.ArrayList;
import java.util.List;

public class Konkurs {
    private double punktK;
    private double przelBelk;
    private List<Skok> listSkok = new ArrayList<>();


    public double getPunktK() {
        return punktK;
    }

    public void setPunktK(double punktK) {
        this.punktK = punktK;
    }

    public double getPrzelBelk() {
        return przelBelk;
    }

    public void setPrzelBelk(double przelBelk) {
        this.przelBelk = przelBelk;
    }

    public List<Skok> getListSkok() {
        return listSkok;
    }

    public void setListSkok(List<Skok> listSkok) {
        this.listSkok = listSkok;
    }
}

