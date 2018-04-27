package FiguryGeometryczne;

public class Trojkat implements Figura {
    int h;
    int podstawa;
    int bok1;
    int bok2;

    @Override
    public double obliczPole(){
        return (h*podstawa)*1/2;
    }
    @Override
    public double obliczObwod(){
        return podstawa + bok1 + bok2;
    }

    public Trojkat(int h, int podstawa, int bok1, int bok2) {
        this.h = h;
        this.podstawa = podstawa;
        this.bok1 = bok1;
        this.bok2 = bok2;
    }

    @Override
    public String toString() {
        return "Trojkat{" +
                "h=" + h +
                ", podstawa=" + podstawa +
                ", bok1=" + bok1 +
                ", bok2=" + bok2 +
                '}';
    }
}
