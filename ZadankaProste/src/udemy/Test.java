package udemy;

class Test{
    int zmienWartosc(int zm){
        zm= zm+2;
        return zm;
    }
    void zmienZawartosc(Foo zm){ //Foo zm przesłaliśmy kopię adresu klasy Foo i zmieniamy to samo miejsce
        zm.y= zm.y +40;
    }

}
