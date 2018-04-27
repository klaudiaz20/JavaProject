package udemy;

public class Referencje {
    public static void main(String[] args){
        int a = 5;
        Test x = new Test();
        a = x.zmienWartosc(a);
        System.out.println(a);
        Foo foo = new Foo();
        x.zmienZawartosc(foo); //zmiana wartości y na y+40 jak w klasie
        System.out.println(foo);

        //porównywanie Strngów

        String imie = "Klaudia";
        String imie2 = "Klaudia";

        if (imie.equals(imie2)){
            System.out.println("Są równe");
        }
    }
}

