package udemy;

public class Butelka {
    //stworzyc pojemnosc, żeby nie było wlane za dużo niż jest
    //jeżeli ktoś zaczyna przelewać, jeżeli byłoby za dużo litrów do przelania to dolać do końca i resztę zostawić w butelce z której się przelewało

    private double ileLitrow;
    private double pojemnosc;

    public double getIleZostalo() {
        return ileZostalo;
    }

    private double ileZostalo;
    Butelka(double ileLitrow, double pojemnosc){

        this.ileLitrow = ileLitrow;
        this.pojemnosc = pojemnosc;
        this.ileZostalo = pojemnosc - ileLitrow;
    }
    double getIleLitrow(){

        return ileLitrow;
    }
    void wlej (double ilosc){

        this.ileLitrow += ilosc;
    }
    boolean wylej (double ilosc){
        if(ilosc<ileLitrow) {
            this.ileLitrow -= ilosc;
        }else
            return false;
        return true;
    }
    void przelej (double ilosc, Butelka gdziePrzelac){
        if(this.wylej(ilosc)) {
            if(ilosc <= ileZostalo) {
                gdziePrzelac.wlej(ilosc);
            }else if(ilosc> ileZostalo){
                ilosc -= ileZostalo;
                gdziePrzelac.wlej(ilosc);
            }
        } else {
            System.out.println("Za mało");
        }
    }

    public static void main (String[] args){
        Butelka[] butelka = new Butelka[3]; //3 null

        butelka[0] = new Butelka(5, 20);
        butelka[1] = new Butelka(8, 12);
        butelka[2] = new Butelka(10,30);

        //butelka[0].wlej(6);
        butelka[0].przelej(5, butelka[1]);

        System.out.println(butelka[0].getIleLitrow());
        System.out.println(butelka[1].getIleLitrow());
        System.out.println(butelka[2].getIleLitrow());
    }

}
