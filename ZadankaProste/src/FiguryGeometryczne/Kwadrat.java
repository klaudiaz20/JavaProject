package FiguryGeometryczne;

public class Kwadrat implements Figura{
    int a1;

    @Override
    public double obliczPole(){
        return a1*a1;
    }

    @Override
    public double obliczObwod(){
        return a1*4;
    }

    public Kwadrat(int a1) {
        this.a1 = a1;
    }

    @Override
    public String toString() {
        return "Kwadrat{" +
                "a1=" + a1 +
                '}';
    }
}
