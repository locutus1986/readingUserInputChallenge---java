package com.timbuchalka;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int i = 1;

        while(i <= 10){
            System.out.println("Enter number #" + i + ":");
            boolean nextInt = scanner.hasNextInt();
            if(nextInt){
                sum += scanner.nextInt();
                i++;

            }else{
                System.out.println("Invalid Number");
            }

            scanner.nextLine(); //handles end of line enter key
        }

        System.out.println(sum);
        scanner.close();
    }
}
