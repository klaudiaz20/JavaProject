package Zadania;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {
    public static void main(String[] args) {
        List <Integer> lista= BubbleSort.listaLiczb();
        System.out.println(lista);

        BubbleSort.sortowania(lista);
        System.out.println(lista);

    }
    private static List <Integer> listaLiczb(){
        List <Integer> lista = new ArrayList<Integer>();
        lista.add(0,8);
        lista.add(1,4);
        lista.add(2,5);
        lista.add(3,1);
        lista.add(4,3);
        lista.add(5,2);
        lista.add(6,6);
        lista.add(7,9);
        lista.add(8,7);
        return lista;

    }
    private static void sortowania(List<Integer> sort){
        int zamiennik;
        for (int m=0; m<sort.size(); m++){
            for(int n=0; n<sort.size()-1; n++){
                if (sort.get(n) > sort.get(n+1)) {
                    zamiennik = sort.get(n);
                    sort.set(n,sort.get(n+1));
                    sort.set(n+1,zamiennik);

                }
            }
        }
    }
}
