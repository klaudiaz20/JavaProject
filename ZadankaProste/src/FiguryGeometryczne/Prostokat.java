package FiguryGeometryczne;

public class Prostokat implements Figura{
    int a;
    int b;

    @Override
    public double obliczPole(){
        return a*b;
    }

    @Override
    public double obliczObwod(){
        return 2*a + 2*b;
    }

    public Prostokat(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Prostokat{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
