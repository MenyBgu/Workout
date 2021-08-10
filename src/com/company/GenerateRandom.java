package com.company;

import java.util.Random;

public class GenerateRandom {

    public static void main(String args[]) {
        // create instance of Random class
        for (int i = 0; i < args.length; i++) {
            System.out.println("j "+args[i]);
        }

        Random rand = new Random();

        // Generate random integers in range 0 to 999
        int rand_int1 = rand.nextInt(1000);
        int rand_int2 = rand.nextInt(1000);

        // Print random integers
        System.out.println("Random Integers: " + rand_int1);
        System.out.println("Random Integers: " + rand_int2);

        // Generate Random doubles
        double rand_dub1 = rand.nextDouble();
        double rand_dub2 = rand.nextDouble();

        // Print random doubles
        System.out.println("Random Doubles: " + rand_dub1);
        System.out.println("Random Doubles: " + rand_dub2);

        printRandomNumbersFromArray();


    }

    public static void printRandomNumbersFromArray() {
        int[] arr = new int[]{10, 30, 45, 60, 78, 99, 120, 140, 180, 200};
        //System.out.print("Random number from the array = " + arr[new Random().nextInt(arr.length)]);

        for (int i = 0; i < arr.length; i++) {
            if (i == 0)
                System.out.print("Random number from the array = " + arr[new Random().nextInt(arr.length)]);
            else
                System.out.print(" ," + arr[new Random().nextInt(arr.length)]);

        }



    }
}
