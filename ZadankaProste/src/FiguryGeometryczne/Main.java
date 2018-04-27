package FiguryGeometryczne;

public class Main {
    public static void main(String[] args){
        Trojkat trokat = new Trojkat(3,4,4,5);
        Kwadrat kwadrat = new Kwadrat(5);
        Prostokat prostokat = new Prostokat(5,6);
        Kolo kolo = new Kolo(6);

        System.out.println(trokat.toString());
        System.out.println(kwadrat.toString());
        System.out.println(prostokat.toString());
        System.out.println(kolo.toString());

    }

}
