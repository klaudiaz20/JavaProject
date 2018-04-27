package JavaProject;

public class Skok {
    private String imieNazwisko;
    private int nrBelki;
    private double odleglosc;
    private double tab[] = new double[5];
    private double pktWiatr;

    public String getImieNazwisko() {
        return imieNazwisko;
    }

    public void setImieNazwisko(String imieNazwisko) {
        this.imieNazwisko = imieNazwisko;
    }

    public int getNrBelki() {
        return nrBelki;
    }

    public void setNrBelki(int nrBelki) {
        this.nrBelki = nrBelki;
    }

    public double getOdleglosc() {
        return odleglosc;
    }

    public void setOdleglosc(double odleglosc) {
        this.odleglosc = odleglosc;
    }

    public double[] getTab() {
        return tab;
    }

    public void setTab(double[] tab) {
        this.tab = tab;
    }

    public double getPktWiatr() {
        return pktWiatr;
    }

    public void setPktWiatr(double pktWiatr) {
        this.pktWiatr = pktWiatr;
    }

    @Override
    public String toString() {
        return this.imieNazwisko;
    }
}
