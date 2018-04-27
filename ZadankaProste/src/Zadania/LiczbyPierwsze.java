package Zadania;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class LiczbyPierwsze {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        System.out.println(LiczbyPierwsze.getPrimes(n));
        System.out.println(LiczbyPierwsze.isPrime(n));
    }

    private static List<Integer> getPrimes(int n){
        List<Integer> Primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                Primes.add(i);
            }
        }

        return Primes;
    }
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i = 2; i<n; i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }

}
