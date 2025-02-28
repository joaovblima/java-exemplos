package CapituloDois;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite num numero: ");
        int num = sc.nextInt();
        sc.close();

        if (num < 0) {
            System.out.println(num + " é negativo");
        } else if (num == 0 || num == 1) {
            System.out.println(num + " não é primo");
        } else {
            boolean isPrime = true;
            for (int i = 2; i < Math.sqrt(num); i++){
                if(num % i == 0 ){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.println(num + " é primo");
            } else {
                System.out.println(num + " não é primo.");
            }
        }

    }
}
