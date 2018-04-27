package JavaProject;

import java.util.ArrayList;
import java.util.List;

public class ObliczeniaSkokow {
    Skok skok = new Skok();
    Konkurs konkurs = new Konkurs();
    private double nota;
    private double punktyZaOdleg;
    private double punktyZaStyl;
    private double punktyNajazd;


    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
        nota = getPunktyZaOdleg() + getPunktyNajazd() + getPunktyZaStyl()+ skok.getPktWiatr();
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

}
