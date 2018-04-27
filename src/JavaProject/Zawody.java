package JavaProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Zawody {
    public static void main(String[] args) throws IOException {
        String plik = "D://Kurs Java//PlikiDoSkoczkow/Lista_zadanie.txt";
        int numer = 0;
        BufferedReader fileReader = null;

        try {

            fileReader = new BufferedReader(new FileReader(plik));
            String numberAsString = fileReader.readLine();
            numer = Integer.parseInt(numberAsString);
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
        }

/*		File file = new File("D://Kurs Java//PlikiDoSkoczkow/ala.txt");
		Scanner in = new Scanner(file);
		String zdanie = in.nextLine();
		System.out.println(zdanie);
*/
    }
}

