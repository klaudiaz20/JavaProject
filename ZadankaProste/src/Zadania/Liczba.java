package Zadania;

import java.util.ArrayList;
import java.util.List;

public class Liczba{
    private int n;
    private List<Integer> listaLiczb= new ArrayList<>();

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
        for(int i =2; i<=n; i++){
            for(int j=2; j<=i;j++){
                if(j==i){

                } else if(i%j==0){
                    break;
                }
            }
        }
    }

    public List<Integer> getListaLiczb() {
        return listaLiczb;
    }

    public void setListaLiczb(List<Integer> listaLiczb) {
        this.listaLiczb = listaLiczb;
        ;listaLiczb.add(n);
    }
}
