package com.company;

public class PrintMean {

    public static void main(String[] args) {

        //heltalsdivision


        System.out.println("Mean of 1, 1, 3, 3 " + MeanCalc(1,1, 3, 3));
        System.out.println("Mean of 1, 2, 3, 4 " + MeanCalc(1,2, 3, 4));
        System.out.println("Mean of 1, -2, 3, -4 " + MeanCalc(1,-2, 3, -4));
        System.out.println("Mean of -1, -11, 24, 2 " + MeanCalc(-1,-11, 24, 2));
    }

    public static String MeanCalc(double a, double b, double c , double d) {
        // Gör en sträng av "mean"

        double Mean = (a + b + c + d) /4;
        return " is " + Mean;

        
    }
}
