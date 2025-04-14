package test;

import calculators.Algorithm;

public class RunCalculator {
    public static void main(String[] args) {

        Algorithm algorithm = new Algorithm();  //instance
        System.out.println("Sum is : " + algorithm.add(5, 6));

    }

}
