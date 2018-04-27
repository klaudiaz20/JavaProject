package JavaProject;

import java.io.*;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class KlasaDane{
    public static void main(String[] args) throws FileNotFoundException{

        Konkurs konkurs=new Konkurs();
        String plik="D://Kurs Java//PlikiDoSkoczkow/Lista_zadanie.txt";
        int nrLinii = 0;

        FileReader fileReader=new FileReader(plik);
        Scanner scanner=new Scanner(fileReader);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            Scanner scanLini = new Scanner(line);
            scanLini.useLocale(Locale.ENGLISH); // ustawienia językowe
            scanLini.useDelimiter("\\t");
            if(nrLinii == 0){
                if(scanLini.hasNextDouble()){
                    konkurs.setPunktK(scanLini.nextDouble());
                }
            }else if (nrLinii == 1){
                if(scanLini.hasNextDouble()){
                    konkurs.setPrzelBelk(scanLini.nextDouble());
                }
            }else {
                Skok skok = new Skok();
                skok.setImieNazwisko(scanLini.next());
                skok.setNrBelki(scanLini.nextInt());
                skok.setOdleglosc(scanLini.nextDouble());
                double tab[]= new double[5];
                for(int i = 0; i<5; i++){
                    tab[i]= scanLini.nextDouble();
                }
                skok.setTab(tab);
                skok.setPktWiatr(scanLini.nextDouble());
                konkurs.getListSkok().add(skok);

            }
            nrLinii++;
            scanLini.close();

        }
        scanner.close();
        //String plik2 = "D://Kurs Java//PlikiDoSkoczkow/klasyfikSkoczkow.txt";
        //System.out.println(konkurs.getListSkok());




    }
}
