package JavaProject;

public class SkokWynik {

    private double nota;
    private double punktyZaOdleg;
    private double punktyZaStyl;
    private double punktyNajazd;
    private double belkaPoczatkowa;

    public void setSkok(Skok skok){

    }

    public void notaLaczna(double notaPierwszego){
        notaPierwszego= belkaPoczatkowa + getPunktyZaOdleg()+ getPunktyZaStyl();

    }
    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getPunktyZaOdleg() {
        return punktyZaOdleg;
    }

    public void setPunktyZaOdleg(double punktyZaOdleg) {
        this.punktyZaOdleg = punktyZaOdleg;

    }

    public double getPunktyZaStyl() {
        return punktyZaStyl;
    }

    public void setPunktyZaStyl(double punktyZaStyl) {
        this.punktyZaStyl = punktyZaStyl;
    }

    public double getPunktyNajazd() {
        return punktyNajazd;
    }

    public void setPunktyNajazd(double punktyNajazd) {
        this.punktyNajazd = punktyNajazd;

    }


    public double getBelkaPoczatkowa() {
        return belkaPoczatkowa;
    }

    public void setBelkaPoczatkowa(double belkaPoczatkowa) {
        this.belkaPoczatkowa = belkaPoczatkowa;

    }
}
