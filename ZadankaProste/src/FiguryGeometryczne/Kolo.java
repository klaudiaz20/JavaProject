package FiguryGeometryczne;

public class Kolo implements Figura {
    int r;

    @Override
    public double obliczPole(){
        return r*r*Math.PI;
    }

    @Override
    public double obliczObwod(){
        return 2*Math.PI*r;
    }

    public Kolo(int r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Kolo{" +
                "r=" + r +
                '}';
    }
}
