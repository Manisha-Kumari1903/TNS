package com.Tns.ArrayString;

public class delete {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 7};
        int lar = Integer.MIN_VALUE;    // Largest
        int seclar = Integer.MIN_VALUE; // Second Largest

        for (int num : arr) {
            if (num > lar) {
                seclar = lar; // Update second largest before largest
                lar = num;
            } else if (num > seclar && num != lar) {
                seclar = num;
            }
        }

        System.out.println("Largest element: " + lar);
        System.out.println("Second largest element: " + seclar);
    }
}
